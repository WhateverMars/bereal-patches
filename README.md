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
<<<<<<< HEAD
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

=======

<!-- Do not modify this section by hand. The patch list is generated when release.yml creates a new release.
     
     If you wish for the patches list to be collapsed, then remove the word 'EXPANDED' from the comment tag above.

     If you wish to manually keep this list updated then remove the PATCHES_START and PATCHES_END 
     comment blocks entirely. -->

#### A list of your patches will automatically be shown here after your first patches release is created.

&nbsp;

## 🚀 Getting development started

To start using this template, follow these steps:

1. [Setup](https://github.com/MorpheApp/morphe-documentation/blob/main/docs/morphe-development/README.md) your development environment including adding a GitHub PAT as described [here](https://github.com/MorpheApp/morphe-patcher/blob/main/docs/2_1_setup.md#-prepare-the-environment).
2. [Create a new repository using this template](https://github.com/new?template_name=morphe-patches-template&template_owner=MorpheApp). Select create a new repository, and **enable 'Include all branches'** 
3. Enable "Allow GitHub Actions to create and approve pull requests" in your repo Settings > Actions > General > Workflow permissions
4. Update the [build.gradle.kts](patches/build.gradle.kts) file (Specifically, the 
   [group of the project](patches/build.gradle.kts#L1), and the [About](patches/build.gradle.kts#L6-L11))
5. Update the [README.md](README.md) file to be specific of your repo, and update the links in the [issue templates](.github/ISSUE_TEMPLATE).
6. Choose a name for your patches project. Keep in mind you must use a name that does not 
   imply authorship by the Morphe open source project. If unsure, then simply name these
   patches after yourself ("UserXYZ Morphe patches"). See the [NOTICE](NOTICE) for details. 
7. (Optional): Add `patches-bundle.png` to the project if you want a custom icon to show in
   Morphe Manager instead of your GitHub profile avatar.

🎉 You are now ready to start creating patches!

## 🧑‍💻 Dev usage

To develop and release your Patches using this template:

- **Make all changes to the `dev` branch.**
- For local development work build your patches using the gradle task `./gradlew buildAndroid` to generate the mpp file found in `patches/build/libs/patches-*.mpp`. Apply your patches locally using Morphe Desktop tool like any other patch bundle.
- Always use [Semantic commit](https://kapeli.com/cheat_sheets/Semantic_Commits.docset/Contents/Resources/Documents/index) messages for commits. To keep it simple use only 3 commit message types: 
  - `feat: Added a new feature`
  - `fix: Some problem now fixed`
  - `chore: Random change you do not want in the user facing changelog`
- Commits of `fix:` and `feat:` will automatically generate new pre-releases and `chore:` will not create a new release.
- Users can apply your dev branch releases by enabling `pre-release` in Morphe Manager patch sources.
- When your dev branch is ready, and you want a stable release, merge dev branch to main (do not squash, and only merge).
- **Always use semantic release (release.yml)**. Do not manually upload or create releases by hand
  because many files must be updated and release.yml handles everything.

## 🤓 Tips
- See the [patcher documentation](https://github.com/MorpheApp/morphe-patcher/blob/main/docs/1_patcher_intro.md) for more examples of creating patches and fingerprints.
- Do not use AI to create new release scripts. The `release.yml` here already handles everything.
  If you need omething custom with your releases then modify the existing `release.yml`
  and `.releaserc` instead of writing everything new from scratch.
- Do not manually edit or manually commit any generated files such as: `patches-list.json`,
  `patches-bundle.json`, `CHANGELOG.md`.  These files will be automatically updated by `release.yml`.
- Do not force push any semantic release commits as that will break all future releases.
  If you need to fix a broken release, it's always easiest to create a new release instead of 
  fixing an existing release.


<!-- The patches end tag is intentionally placed here so the first release will clean up 
     this readme of all developer instructions above. -->
>>>>>>> origin/main
<!-- PATCHES_END -->

### 🛠️ Building locally

- Run `./gradlew buildAndroid`
- The built patches .mpp file is found in `patches/build/libs/patches-*.mpp`
- Patch the mpp file using [Morphe-Desktop](https://github.com/MorpheApp/morphe-desktop)
  like any other patch bundle.

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## 📜 License

UserXYZ Patches are licensed under the [GNU General Public License v3.0](LICENSE)
