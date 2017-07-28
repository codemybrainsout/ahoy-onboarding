# Ahoy! Onboarding
Onboarding library for android with Gradient, Image or Solid color backgrounds.

![](preview/preview.gif)

## Installation

### Gradle
Add it as a dependency in your app's build.gradle file

```groovy
dependencies {
    compile 'com.codemybrainsout.onboarding:onboarder:1.0.4'
}
```

## How to use

**First of all, you will have to extend your activity like this**

```java
public class YourActivity extends AhoyOnboarderActivity {
```

**Then, Create `AhoyOnboarderCard` and configure it accordingly**

```java
AhoyOnboarderCard ahoyOnboarderCard1 = new AhoyOnboarderCard("Title", "Description", R.drawable.icon1);
ahoyOnboarderCard1.setBackgroundColor(R.color.black_transparent);
ahoyOnboarderCard1.setTitleColor(R.color.white);
ahoyOnboarderCard1.setDescriptionColor(R.color.grey_200);
ahoyOnboarderCard1.setTitleTextSize(dpToPixels(10, this));
ahoyOnboarderCard1.setDescriptionTextSize(dpToPixels(8, this));
ahoyOnboarderCard1.setIconLayoutParams(iconWidth, iconHeight, marginTop, marginLeft, marginRight, marginBottom);
```

**After that, Create a list of cards and set them using**

```java
List<AhoyOnboarderCard> pages = new ArrayList<>();
pages.add(ahoyOnboarderCard1);
pages.add(ahoyOnboarderCard2);
pages.add(ahoyOnboarderCard3);
...

setOnboardPages(pages);
```

### Choose from one of these three background types

- **Gradient Background**
```java
setGradientBackground();
```

![](preview/preview-gradient.png)

- **Image Background**
```java
setImageBackground(R.drawable.image);
```

![](preview/preview-image.png)

- **Solid Background**

```java
List<Integer> colorList = new ArrayList<>();
colorList.add(R.color.solid_one);
colorList.add(R.color.solid_two);
colorList.add(R.color.solid_three);
setColorBackground(colorList);

                //or

setColorBackground(R.color.solid_one);
```

![](preview/preview-solid.png)

**You can also customise the font to match your app**
```java
Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
setFont(face);
```

### Landscape mode

![](preview/preview-landscape.png)

### Other properties
```java

//Show/Hide navigation controls
showNavigationControls(false);

//Set pager indicator colors
setInactiveIndicatorColor(R.color.grey);
setActiveIndicatorColor(R.color.white);

//Set finish button text
setFinishButtonTitle("Get Started");

//Set the finish button style
setFinishButtonDrawableStyle(ContextCompat.getDrawable(this, R.drawable.rounded_button));
```

## Thanks
* [dynamitechetan/Flowing-Gradient](https://github.com/dynamitechetan/Flowing-Gradient)
* [chyrta/AndroidOnboarder](https://github.com/chyrta/AndroidOnboarder)

## Changelog

### v1.0.1

Landscape layout by [Maxwell](https://github.com/wax911)

### v1.0.2

FinishButtonDrawableStyle by [Maxwell](https://github.com/wax911)

## Support
If you've any questions regarding this library, please contact us at help@codemybrainsout.com

## Credits

This project was initiated by **Code My Brains Out**. You can contribute to this project by submitting issues or/and by forking this repo and sending a pull request.

![](http://codemybrainsout.com/files/img/logo-small.png)

Follow us on:

[![Facebook](http://codemybrainsout.com/files/img/fb.png)](https://www.facebook.com/codemybrainsout)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[![Twitter](http://codemybrainsout.com/files/img/tw.png)](https://twitter.com/codemybrainsout)

Author: [Rahul Juneja](https://github.com/ahulr)

# License
```
Copyright (C) 2016 Code My Brains Out

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