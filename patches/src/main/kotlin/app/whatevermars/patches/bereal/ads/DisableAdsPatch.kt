package app.whatevermars.patches.bereal.ads

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.whatevermars.patches.shared.Constants.COMPATIBILITY_BEREAL

@Suppress("unused")
val disableAdsPatch = bytecodePatch(
    name = "disable ads",
    description = "Stops Applovin MAX native and banner ad requests from loading.",
    default = true,
) {
    compatibleWith(COMPATIBILITY_BEREAL)

    execute {
        val nativeMethod = MaxNativeAdLoaderLoadAdFingerprint.method
        val viewMethod = MaxAdViewLoadAdFingerprint.method

        nativeMethod.addInstructions(0, "return-void")
        viewMethod.addInstructions(0, "return-void")
    }
}
