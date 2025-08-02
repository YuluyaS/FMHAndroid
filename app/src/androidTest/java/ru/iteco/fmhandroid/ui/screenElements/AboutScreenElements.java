package ru.iteco.fmhandroid.ui.screenElements;

import ru.iteco.fmhandroid.R;

public class AboutScreenElements {
    private int trademarkImage = R.id.trademark_image_view;
    private int versionTitle = R.id.about_version_title_text_view;
    private int privacyPolicyLabel = R.id.about_privacy_policy_label_text_view;
    private int termsOfUseLabel = R.id.about_terms_of_use_label_text_view;
    private int backButton = R.id.about_back_image_button;
    private String urlPrivacyPolicy = "https://vhospice.org/#/privacy-policy/";

    public int getTrademarkImage() {
        return trademarkImage;
    }

    public String getUrlPrivacyPolicy() {
        return urlPrivacyPolicy;
    }

    public int getVersionTitle() {
        return versionTitle;
    }

    public int getPrivacyPolicyLabel() {
        return privacyPolicyLabel;
    }

    public int getTermsOfUseLabel() {
        return termsOfUseLabel;
    }

    public int getBackButton() {
        return backButton;
    }
}