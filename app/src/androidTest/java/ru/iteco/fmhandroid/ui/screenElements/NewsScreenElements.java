package ru.iteco.fmhandroid.ui.screenElements;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class NewsScreenElements {
    private int editNewsButton = R.id.edit_news_material_button;
    private int addNewsButton = R.id.add_news_image_view;
    private int deleteNewsButton = R.id.delete_news_item_image_view;
    private int editNewsItemButton = R.id.edit_news_item_image_view;
    private int categoryField = R.id.news_item_category_text_input_layout;
    private int titleField = R.id.news_item_title_text_input_edit_text;
    private int createDateField = R.id.news_item_create_date_text_input_layout;
    private int publishTimeField = R.id.news_item_publish_time_text_input_layout;
    private int descriptionField = R.id.news_item_description_text_input_edit_text;
    private int saveButton = R.id.save_button;
    private int confirmButton = android.R.id.button1;
    private int creatingNewsTitle = R.id.custom_app_bar_title_text_view;
    private int createCategory = R.id.news_item_category_text_auto_complete_text_view;
    private int filterPage = R.string.filter_news;

    private int categoryFieldSorting = R.id.news_item_category_text_auto_complete_text_view;
    private int sortNewsButton = R.id.sort_news_material_button;

    private int filter = R.id.filter_news_material_button;
    private int startDateButton = R.id.news_item_publish_date_start_text_input_edit_text;
    private int okButtonSorting = android.R.id.button1;
    private int filterButton = R.id.filter_button;
    private int errorMessage = android.R.id.message;
    private int endDateButton = R.id.news_item_publish_date_end_text_input_edit_text;
    private int cancelButton = R.id.cancel_button;
    private Matcher<View> controlPanel = withText("Control panel");

    private Matcher<View> activeCheckBox =
            allOf(withId(R.id.filter_news_active_material_check_box), withText("Active"));

    private Matcher<View> negativeCheckBox =
            allOf(withId(R.id.filter_news_inactive_material_check_box), withText("Not active"));

    public Matcher<View> getActiveCheckBox() {
        return activeCheckBox;
    }

    public Matcher<View> getNegativeCheckBox() {
        return negativeCheckBox;
    }

    public int getCreateCategory() {
        return createCategory;
    }

    public int getEditNewsButton() {
        return editNewsButton;
    }

    public int getAddNewsButton() {
        return addNewsButton;
    }

    public int getDeleteNewsButton() {
        return deleteNewsButton;
    }

    public int getEditNewsItemButton() {
        return editNewsItemButton;
    }

    public int getCategoryField() {
        return categoryField;
    }

    public int getTitleField() {
        return titleField;
    }

    public int getCreateDateField() {
        return createDateField;
    }

    public int getPublishTimeField() {
        return publishTimeField;
    }

    public int getDescriptionField() {
        return descriptionField;
    }

    public int getSaveButton() {
        return saveButton;
    }

    public int getConfirmButton() {
        return confirmButton;
    }

    public int getSortNewsButton() {
        return sortNewsButton;
    }

    public int getFilterPage() {
        return filterPage;
    }

    public int getFilter() {
        return filter;
    }

    public int getStartDateButton() {
        return startDateButton;
    }

    public int getOkButtonSorting() {
        return okButtonSorting;
    }

    public int getFilterButton() {
        return filterButton;
    }

    public int getErrorMessage() {
        return errorMessage;
    }

    public int getEndDateButton() {
        return endDateButton;
    }

    public int getCancelButton() {
        return cancelButton;
    }

    public int getCategoryFieldSorting() {
        return categoryFieldSorting;
    }

    public int getCreatingNewsTitle() {
        return creatingNewsTitle;
    }

    public Matcher<View> getControlPanel() {
        return controlPanel;
    }
}