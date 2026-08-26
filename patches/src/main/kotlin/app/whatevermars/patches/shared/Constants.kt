package app.whatevermars.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.SupportedAbi

object Constants {
    val COMPATIBILITY_BEREAL = Compatibility(
        name = "Bereal",
        packageName = "com.bereal.ft",
        apkFileType = ApkFileType.APKM,
        appIconColor = 0x000000,
        targets = listOf(
            AppTarget(
                version = "3.91.2"
            )
        )
    )

}
