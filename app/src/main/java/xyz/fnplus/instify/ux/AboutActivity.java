package xyz.fnplus.instify.ux;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;
import xyz.fnplus.instify.R;

/**
 * Created by Abhish3k on 8/21/2016.
 */

public class AboutActivity extends AppCompatActivity {
    private String TAG = AboutActivity.class.getSimpleName();

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("This app is developed by : Abhishek Uniyal, Arjun Mahishi, Chandan Singh, Vijay Krishna and Somnath" +
                        "\n\nSepcial thanks to : Ankur, Trishansh")
                .setImage(R.drawable.ic_logo_96dp)
                .addItem(new Element().setTitle("Version 1.2.0"))
                .addGroup("Connect with us")
                .addEmail("abhishekuniyal09@gmail.com")
                .addWebsite("https://www.fnplus.xyz/")
                .addFacebook("https://www.facebook.com/fnplus.xyz")
                .addYoutube("https://youtu.be/RMDjTWrylOk")
                .addPlayStore("https://play.google.com/store/apps/details?id=com.instify.android")
                .addItem(getCopyRightsElement())
                .create();
        setContentView(aboutPage);
    }

    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.about_icon_copy_right);
        copyRightsElement.setIconTint(R.color.about_item_icon_color);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(v ->
                Toast.makeText(AboutActivity.this, copyrights, Toast.LENGTH_SHORT).show());
        return copyRightsElement;
    }
}