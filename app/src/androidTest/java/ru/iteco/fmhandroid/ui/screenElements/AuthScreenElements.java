package ru.iteco.fmhandroid.ui.screenElements;

import ru.iteco.fmhandroid.R;

public class AuthScreenElements {
    private int loginField = R.id.login_input;
    private int passwordField = R.id.password_input;
    private int signInButton = R.id.enter_button;
    private int authTitle = R.id.auth_header_text;
    private int authImageButton = R.id.authorization_image_button;

    public int getLoginField() {
        return loginField;
    }

    public int getPasswordField() {
        return passwordField;
    }
    
    public int getSignInButton() {
        return signInButton;
    }

    public int getAuthTitle() {
        return authTitle;
    }

    public int getAuthImageButton() {
        return authImageButton;
    }
}