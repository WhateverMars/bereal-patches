package app.whatevermars.patches.bereal.ads

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.whatevermars.patches.shared.Constants.COMPATIBILITY_BEREAL

val bypassPairipPatch = bytecodePatch(
    name = "Bypass Pairip integrity check",
    description = "Prevents Pairip's native startup integrity/tamper check from running, avoiding a crash when other patches modify the app's bytecode.",
) {
    compatibleWith(COMPATIBILITY_BEREAL)

    execute {
        StartupLauncherLaunchFingerprint.method.addInstructions(0, "return-void")
        SignatureCheckVerifyIntegrityFingerprint.method.addInstructions(0, "return-void")
    }
}
