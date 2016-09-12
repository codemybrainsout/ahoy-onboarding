package com.codemybrainsout.onboarding;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.widget.Toast;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;

import java.util.ArrayList;
import java.util.List;

public class SolidBackgroundExampleActivity extends AhoyOnboarderActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AhoyOnboarderCard ahoyOnboarderCard1 = new AhoyOnboarderCard("Scan Barcode", "Label your packages with a barcode before we collect it from you.", R.drawable.barcode);
        AhoyOnboarderCard ahoyOnboarderCard2 = new AhoyOnboarderCard("Shipping", "Our huge network of shipping partners ensures that your packages are always on schedule.", R.drawable.truck);
        AhoyOnboarderCard ahoyOnboarderCard3 = new AhoyOnboarderCard("Payment", "Receive payments immediately after the package is delivered.", R.drawable.wallet);

        ahoyOnboarderCard1.setBackgroundColor(R.color.white);
        ahoyOnboarderCard2.setBackgroundColor(R.color.white);
        ahoyOnboarderCard3.setBackgroundColor(R.color.white);

        List<AhoyOnboarderCard> pages = new ArrayList<>();

        pages.add(ahoyOnboarderCard1);
        pages.add(ahoyOnboarderCard2);
        pages.add(ahoyOnboarderCard3);

        for (AhoyOnboarderCard page : pages) {
            page.setTitleColor(R.color.black);
            page.setDescriptionColor(R.color.grey_600);
        }

        setFinishButtonTitle("Finish");
        showNavigationControls(false);

        List<Integer> colorList = new ArrayList<>();
        colorList.add(R.color.solid_one);
        colorList.add(R.color.solid_two);
        colorList.add(R.color.solid_three);

        setColorBackground(colorList);

        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
        setFont(face);

        setOnboardPages(pages);

    }

    @Override
    public void onFinishButtonPressed() {
        Toast.makeText(this, "Finish Pressed", Toast.LENGTH_SHORT).show();
    }
}
