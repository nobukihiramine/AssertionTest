# AssertionTest
Androidアプリ開発におけるAssertionの実装方法についてのメモ。  

1. 組み込みのAssertステートメント  
Javaには、組み込みのAssertステートメントがあります。  
Eclipseを用いて開発していたとき（2015年ごろまで）は「adb shell setprop debug.assert 1」コマンドを実行した後に、Eclipseからデバッグ実行したプログラムは、assert行で、処理が中断しました。  
Android Studioを用いた開発においては、組み込みのAssertステートメントは機能しません。  
「Some new lint checks, and in particular one which flags uses of the assertion keyword. This does not work reliably on devices and you should use BuildConfig.DEBUG to do conditional checks instead.」  
「いくつかの新しいlintチェック、特にassertionキーワードの使用にフラグを付けるもの。 これはデバイスで確実に動作しないため、代わりにBuildConfig.DEBUGを使用して条件チェックを行う必要があります。」  
出典：http://tools.android.com/recent/androidstudio045released  

2. JUnitのAssert.assertTrueステートメント  
組み込みのAssertステートメントの代わりとしては、「JUnitのAssert.assertTrueステートメント」があります。  

3. BuildConfig.DEBUGを使用した方法  
Android Studio のリリースノートには、「代わりにBuildConfig.DEBUGを使用する必要がある」とあります。  

動作確認の結果としては、  
1. 深く調べてはいませんが、リリースノートの通りで、機能しません。  
2. 3. 下記ブレークポイントの設定をしないと、例外が発生し、アプリが終了する（どのassertionで例外が発生したかわからない）。  
下記ブレークポイントの設定をすることで、例外が発生した行で、処理が中断するので、どのassertionで例外が発生したかわかります。  

<img src="_images/setting_breakpoints.png" alt="Screenshot"/>
<img src="_images/setting_classfilters.png" alt="Screenshot"/>

## Screenshots : スクリーンショット
<img src="_images/Screenshot_01.png" width="256" alt="Screenshot"/>

## Requirements : 必要条件、依存関係
- Android Studio 3.1.2
- Android SDK 26
- Android Support Repository

## Author : 作者
Nobuki HIRAMINE : [http://www.hiramine.com](http://www.hiramine.com)

## License : ライセンス
```
Copyright 2018 Nobuki HIRAMINE

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
