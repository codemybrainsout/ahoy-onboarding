# Ahoy! Onboarding
Android onboarding library.

![](preview/preview.gif)

##Usage

###First of all, you will have to extend your activity like this

```java
public class YourActivity extends AhoyOnboarderActivity {
```

###Then, Create **AhoyOnboarderCard** and configure it accordingly

```java
AhoyOnboarderCard ahoyOnboarderCard = new AhoyOnboarderCard("Title", "Description", R.drawable.icon1);
ahoyOnboarderCard.setBackgroundColor(R.color.black_transparent);
ahoyOnboarderCard.setTitleColor(R.color.white);
ahoyOnboarderCard.setDescriptionColor(R.color.grey_200);
```

###After that, Create a list of cards and set them using

```java
List<AhoyOnboarderCard> pages = new ArrayList<>();
pages.add(ahoyOnboarderCard);

setOnboardPages(pages);
```

###Choose one of these three background types

*Gradient
```java
setGradientBackground();
```

![](preview/preview-gradient.png)

*Image
```java
setImageBackground(R.drawable.image);
```

![](preview/preview-image.png)

*Solid

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

###You can also customise the font to match your app
```java
Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
setFont(face);
```

#License
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