# 👋🧩 Morphe Patches by WhateverMars [WIP]

## ❓ About

### BeReal
 - Ad blocking patch
 - PairIp antitamper bypass patch

### Issues
Currenly when attempting to launch the patched app an error occurs and it instantly closes.
Logs:
```
08-27 15:59:36.664 15903 15903 E AndroidRuntime: FATAL EXCEPTION: main
08-27 15:59:36.664 15903 15903 E AndroidRuntime: Process: com.bereal.ft, PID: 15903
08-27 15:59:36.664 15903 15903 E AndroidRuntime: java.lang.ExceptionInInitializerError
...
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$0(r8-map-id-9be51d4541f4d3ce792dfa37cd20629897a53d4ea561acab8eec69b20b149475:13)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at com.google.firebase.sessions.FirebaseSessionsRegistrar.b(r8-map-id-9be51d4541f4d3ce792dfa37cd20629897a53d4ea561acab8eec69b20b149475:1)
...
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at com.google.firebase.provider.FirebaseInitProvider.onCreate(r8-map-id-9be51d4541f4d3ce792dfa37cd20629897a53d4ea561acab8eec69b20b149475:12)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.content.ContentProvider.attachInfo(ContentProvider.java:2712)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.content.ContentProvider.attachInfo(ContentProvider.java:2681)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at com.google.firebase.provider.FirebaseInitProvider.attachInfo(r8-map-id-9be51d4541f4d3ce792dfa37cd20629897a53d4ea561acab8eec69b20b149475:16)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.app.ActivityThread.installProvider(ActivityThread.java:8556)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.app.ActivityThread.installContentProviders(ActivityThread.java:8051)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:7697)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.app.ActivityThread.-$$Nest$mhandleBindApplication(ActivityThread.java:0)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2500)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.os.Handler.dispatchMessage(Handler.java:107)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.os.Looper.loopOnce(Looper.java:273)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.os.Looper.loop(Looper.java:388)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at android.app.ActivityThread.main(ActivityThread.java:8969)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at java.lang.reflect.Method.invoke(Native Method)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:580)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:892)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: Caused by: java.lang.RuntimeException: java.lang.NullPointerException: name == null
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at java.util.concurrent.atomic.AtomicReferenceFieldUpdater$AtomicReferenceFieldUpdaterImpl.<init>(AtomicReferenceFieldUpdater.java:334)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(AtomicReferenceFieldUpdater.java:112)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at mab.<clinit>(r8-map-id-9be51d4541f4d3ce792dfa37cd20629897a53d4ea561acab8eec69b20b149475:7)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	... 42 more
08-27 15:59:36.664 15903 15903 E AndroidRuntime: Caused by: java.lang.NullPointerException: name == null
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at java.lang.Class.getDeclaredField(Native Method)
08-27 15:59:36.664 15903 15903 E AndroidRuntime: 	at java.util.concurrent.atomic.AtomicReferenceFieldUpdater$AtomicReferenceFieldUpdaterImpl.<init>(AtomicReferenceFieldUpdater.java:328)

```
Issue is that AtomicReferenceFieldUpdater gets messed up during the decompiling and recompiling.

### How to use these patches

Click here to add these patches to Morphe: https://morphe.software/add-source?github=WhateverMars/bereal-patches

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.0.0-dev.1](https://github.com/WhateverMars/bereal-patches/releases/tag/v1.0.0-dev.1)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;1 patches total
<details open>
<summary>📦 Bereal&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**🎯 Supported versions:**

| 3.91.2 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [disable ads](#disable-ads) | Stops Applovin MAX native and banner ad requests from loading. |  |

</details>

<!-- PATCHES_END -->

### 🛠️ Building locally

- Run `./gradlew buildAndroid`
- The built patches .mpp file is found in `patches/build/libs/patches-*.mpp`
- Patch the mpp file using [Morphe-Desktop](https://github.com/MorpheApp/morphe-desktop)
  like any other patch bundle.

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## 📜 License

UserXYZ Patches are licensed under the [GNU General Public License v3.0](LICENSE)
