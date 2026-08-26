package app.whatevermars.patches.bereal.ads

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal object MaxNativeAdLoaderLoadAdFingerprint : Fingerprint(
    definingClass = "Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;",
    name = "loadAd",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf(),
)

internal object MaxAdViewLoadAdFingerprint : Fingerprint(
    definingClass = "Lcom/applovin/mediation/ads/MaxAdView;",
    name = "loadAd",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf(),
)
