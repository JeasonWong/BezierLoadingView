## What's BezierLoadingView ?
A cool loading view with Bezier and a smooth circular motion， 

## Demo
![效果](http://i4.buimg.com/cdd5a4a8f0233650.gif)

## Features
* Bezier
* Circular motion

##Attributes

|name|format|description|
|:---:|:---:|:---:|
| lv_external_radius | dimension |set external circle eadius
| lv_internal_radius | dimension |set internal circle eadius
| lv_duration | integer |set animation duration
| lv_start_color | color |set start color
| lv_end_color | color |set end color

## Import

Add it in your project's build.gradle at the end of repositories:

```gradle
repositories {
    maven {
        url 'https://dl.bintray.com/wangyuwei/maven'
    }
}
```

Step 2. Add the dependency in the form

```gradle
dependencies {
  compile 'me.wangyuwei:banner:1.0.2'
}
```

## Usage
#### Define your banner under your xml  :

```xml
    <me.wangyuwei.loadingview.LoadingView
        android:id="@+id/loading_view"
        android:layout_width="match_parent"
        android:layout_height="350dp"
        lv:lv_duration="10"
        lv:lv_start_color="#688fdb"
        lv:lv_end_color="#fff"
        lv:lv_internal_radius="5dp"
        lv:lv_external_radius="92dp"/>
```



##**Lincense**

```lincense
Copyright [2016] [JeasonWong of copyright owner]

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


