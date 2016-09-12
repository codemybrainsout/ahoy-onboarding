package com.codemybrainsout.onboarder;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AhoyOnboarderFragment extends Fragment {

    private static final String AHOY_PAGE_TITLE = "ahoy_page_title";
    private static final String AHOY_PAGE_TITLE_RES_ID = "ahoy_page_title_res_id";
    private static final String AHOY_PAGE_TITLE_COLOR = "ahoy_page_title_color";
    private static final String AHOY_PAGE_TITLE_TEXT_SIZE = "ahoy_page_title_text_size";
    private static final String AHOY_PAGE_DESCRIPTION = "ahoy_page_description";
    private static final String AHOY_PAGE_DESCRIPTION_RES_ID = "ahoy_page_description_res_id";
    private static final String AHOY_PAGE_DESCRIPTION_COLOR = "ahoy_page_description_color";
    private static final String AHOY_PAGE_DESCRIPTION_TEXT_SIZE = "ahoy_page_description_text_size";
    private static final String AHOY_PAGE_IMAGE_RES_ID = "ahoy_page_image_res_id";
    private static final String AHOY_PAGE_BACKGROUND_COLOR = "ahoy_page_background_color";

    private String title;
    private String description;
    @StringRes
    private int titleResId;
    @ColorRes
    private int titleColor;
    @StringRes
    private int descriptionResId;
    @ColorRes
    private int backgroundColor;
    @ColorRes
    private int descriptionColor;
    @DrawableRes
    private int imageResId;
    private float titleTextSize;
    private float descriptionTextSize;

    private View view;
    private ImageView ivOnboarderImage;
    private TextView tvOnboarderTitle;
    private TextView tvOnboarderDescription;
    private CardView cardView;

    public AhoyOnboarderFragment() {
    }

    public static AhoyOnboarderFragment newInstance(AhoyOnboarderCard card) {
        Bundle args = new Bundle();
        args.putString(AHOY_PAGE_TITLE, card.getTitle());
        args.putString(AHOY_PAGE_DESCRIPTION, card.getDescription());
        args.putInt(AHOY_PAGE_TITLE_RES_ID, card.getTitleResourceId());
        args.putInt(AHOY_PAGE_DESCRIPTION_RES_ID, card.getDescriptionResourceId());
        args.putInt(AHOY_PAGE_TITLE_COLOR, card.getTitleColor());
        args.putInt(AHOY_PAGE_DESCRIPTION_COLOR, card.getDescriptionColor());
        args.putInt(AHOY_PAGE_IMAGE_RES_ID, card.getImageResourceId());
        args.putFloat(AHOY_PAGE_TITLE_TEXT_SIZE, card.getTitleTextSize());
        args.putFloat(AHOY_PAGE_DESCRIPTION_TEXT_SIZE, card.getDescriptionTextSize());
        args.putInt(AHOY_PAGE_BACKGROUND_COLOR, card.getBackgroundColor());

        AhoyOnboarderFragment fragment = new AhoyOnboarderFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Bundle bundle = getArguments();

        title = bundle.getString(AHOY_PAGE_TITLE, null);
        titleResId = bundle.getInt(AHOY_PAGE_TITLE_RES_ID, 0);
        titleColor = bundle.getInt(AHOY_PAGE_TITLE_COLOR, 0);
        titleTextSize = bundle.getFloat(AHOY_PAGE_TITLE_TEXT_SIZE, 0f);
        description = bundle.getString(AHOY_PAGE_DESCRIPTION, null);
        descriptionResId = bundle.getInt(AHOY_PAGE_DESCRIPTION_RES_ID, 0);
        descriptionColor = bundle.getInt(AHOY_PAGE_DESCRIPTION_COLOR, 0);
        descriptionTextSize = bundle.getFloat(AHOY_PAGE_DESCRIPTION_TEXT_SIZE, 0f);
        imageResId = bundle.getInt(AHOY_PAGE_IMAGE_RES_ID, 0);
        backgroundColor = bundle.getInt(AHOY_PAGE_BACKGROUND_COLOR, 0);

        view = inflater.inflate(R.layout.fragment_ahoy, container, false);
        ivOnboarderImage = (ImageView) view.findViewById(R.id.iv_image);
        tvOnboarderTitle = (TextView) view.findViewById(R.id.tv_title);
        tvOnboarderDescription = (TextView) view.findViewById(R.id.tv_description);
        cardView = (CardView) view.findViewById(R.id.cv_cardview);

        if (title != null) {
            tvOnboarderTitle.setText(title);
        }

        if (titleResId != 0) {
            tvOnboarderTitle.setText(getResources().getString(titleResId));
        }

        if (description != null) {
            tvOnboarderDescription.setText(description);
        }

        if (descriptionResId != 0) {
            tvOnboarderDescription.setText(getResources().getString(descriptionResId));
        }

        if (titleColor != 0) {
            tvOnboarderTitle.setTextColor(ContextCompat.getColor(getActivity(), titleColor));
        }

        if (descriptionColor != 0) {
            tvOnboarderDescription.setTextColor(ContextCompat.getColor(getActivity(), descriptionColor));
        }

        if (imageResId != 0) {
            ivOnboarderImage.setImageDrawable(ContextCompat.getDrawable(getActivity(), imageResId));
        }

        if (titleTextSize != 0f) {
            tvOnboarderTitle.setTextSize(titleTextSize);
        }

        if (descriptionTextSize != 0f) {
            tvOnboarderDescription.setTextSize(descriptionTextSize);
        }

        if (backgroundColor != 0) {
            cardView.setCardBackgroundColor(ContextCompat.getColor(getActivity(), backgroundColor));
        }

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public CardView getCardView() {
        return cardView;
    }

    public TextView getTitleView() {
        return tvOnboarderTitle;
    }

    public TextView getDescriptionView() {
        return tvOnboarderDescription;
    }

}
