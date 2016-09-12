package koster.tychokoster_pset1;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.StringDef;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    static final String VIS_ARMS = "Vis_Arms";
    static final String VIS_MUS = "Vis_Mus";
    static final String VIS_NOSE = "Vis_Nose";
    static final String VIS_EARS = "Vis_Ears";
    static final String VIS_EYEB = "Vis_Eyeb";
    static final String VIS_EYES = "Vis_Eyes";
    static final String VIS_SHOES = "Vis_Shoes";
    static final String VIS_GLASS = "Vis_Glasses";
    static final String VIS_HAT = "Vis_Hat";
    static final String VIS_MOUTH = "VIS_MOUTH";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            ImageView checkedArms = (ImageView) findViewById(R.id.imageArms);
            ImageView checkedMustache = (ImageView) findViewById(R.id.imageMustache);
            ImageView checkedNose = (ImageView) findViewById(R.id.imageNose);
            ImageView checkedEars = (ImageView) findViewById(R.id.imageEars);
            ImageView checkedEyebrows = (ImageView) findViewById(R.id.imageEyebrows);
            ImageView checkedEyes = (ImageView) findViewById(R.id.imageEyes);
            ImageView checkedShoes = (ImageView) findViewById(R.id.imageShoes);
            ImageView checkedGlasses = (ImageView) findViewById(R.id.imageGlasses);
            ImageView checkedHat = (ImageView) findViewById(R.id.imageHat);
            ImageView checkedMouth = (ImageView) findViewById(R.id.imageMouth);

            checkedArms.setVisibility(savedInstanceState.getInt(VIS_ARMS));
            checkedMustache.setVisibility(savedInstanceState.getInt(VIS_MUS));
            checkedNose.setVisibility(savedInstanceState.getInt(VIS_NOSE));
            checkedEyebrows.setVisibility(savedInstanceState.getInt(VIS_EYEB));
            checkedEyes.setVisibility(savedInstanceState.getInt(VIS_EYES));
            checkedEars.setVisibility(savedInstanceState.getInt(VIS_EARS));
            checkedShoes.setVisibility(savedInstanceState.getInt(VIS_SHOES));
            checkedGlasses.setVisibility(savedInstanceState.getInt(VIS_GLASS));
            checkedHat.setVisibility(savedInstanceState.getInt(VIS_HAT));
            checkedMouth.setVisibility(savedInstanceState.getInt(VIS_MOUTH));
        }
    }

    public void checkboxClicked(View v) {
        CheckBox checked = (CheckBox) v;
        boolean checkbox = checked.isChecked();

        switch (v.getId()) {
            case R.id.checkArms:
                ImageView checkedArms = (ImageView) findViewById(R.id.imageArms);
                if(checkbox) {
                    checkedArms.setVisibility(View.VISIBLE);
                }
                else {
                    checkedArms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkMustache:
                ImageView checkedMustache = (ImageView) findViewById(R.id.imageMustache);
                if(checkbox) {
                    checkedMustache.setVisibility(View.VISIBLE);
                }
                else {
                    checkedMustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkNose:
                ImageView checkedNose = (ImageView) findViewById(R.id.imageNose);
                if(checkbox) {
                    checkedNose.setVisibility(View.VISIBLE);
                }
                else {
                    checkedNose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkEars:
                ImageView checkedEars = (ImageView) findViewById(R.id.imageEars);
                if(checkbox) {
                    checkedEars.setVisibility(View.VISIBLE);
                }
                else {
                    checkedEars.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkEyebrows:
                ImageView checkedEyebrows = (ImageView) findViewById(R.id.imageEyebrows);
                if(checkbox) {
                    checkedEyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    checkedEyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkEyes:
                ImageView checkedEyes = (ImageView) findViewById(R.id.imageEyes);
                if(checkbox) {
                    checkedEyes.setVisibility(View.VISIBLE);
                }
                else {
                    checkedEyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkShoes:
                ImageView checkedShoes = (ImageView) findViewById(R.id.imageShoes);
                if(checkbox) {
                    checkedShoes.setVisibility(View.VISIBLE);
                }
                else {
                    checkedShoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkGlasses:
                ImageView checkedGlasses = (ImageView) findViewById(R.id.imageGlasses);
                if(checkbox) {
                    checkedGlasses.setVisibility(View.VISIBLE);
                }
                else {
                    checkedGlasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkHat:
                ImageView checkedHat = (ImageView) findViewById(R.id.imageHat);
                if(checkbox) {
                    checkedHat.setVisibility(View.VISIBLE);
                }
                else {
                    checkedHat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkMouth:
                ImageView checkedMouth = (ImageView) findViewById(R.id.imageMouth);
                if(checkbox) {
                    checkedMouth.setVisibility(View.VISIBLE);
                }
                else {
                    checkedMouth.setVisibility(View.INVISIBLE);
                }
                break;
        }

    }
    public void onSaveInstanceState(Bundle savedInstanceState) {
        ImageView checkedArm = (ImageView) findViewById(R.id.imageArms);
        ImageView checkedMustache = (ImageView) findViewById(R.id.imageMustache);
        ImageView checkedNose = (ImageView) findViewById(R.id.imageNose);
        ImageView checkedEars = (ImageView) findViewById(R.id.imageEars);
        ImageView checkedEyebrows = (ImageView) findViewById(R.id.imageEyebrows);
        ImageView checkedEyes = (ImageView) findViewById(R.id.imageEyes);
        ImageView checkedShoes = (ImageView) findViewById(R.id.imageShoes);
        ImageView checkedGlasses = (ImageView) findViewById(R.id.imageGlasses);
        ImageView checkedHat = (ImageView) findViewById(R.id.imageHat);
        ImageView checkedMouth = (ImageView) findViewById(R.id.imageMouth);


        int vis_arm = checkedArm.getVisibility();
        int vis_mustache = checkedMustache.getVisibility();
        int vis_nose = checkedNose.getVisibility();
        int vis_ears = checkedEars.getVisibility();
        int vis_Eyebrows = checkedEyebrows.getVisibility();
        int vis_eyes = checkedEyes.getVisibility();
        int vis_shoes = checkedShoes.getVisibility();
        int vis_glasses = checkedGlasses.getVisibility();
        int vis_hat = checkedHat.getVisibility();
        int vis_mouth = checkedMouth.getVisibility();

        savedInstanceState.putInt(VIS_ARMS, vis_arm);
        savedInstanceState.putInt(VIS_MUS, vis_mustache);
        savedInstanceState.putInt(VIS_NOSE, vis_nose);
        savedInstanceState.putInt(VIS_EARS, vis_ears);
        savedInstanceState.putInt(VIS_EYEB, vis_Eyebrows);
        savedInstanceState.putInt(VIS_EYES, vis_eyes);
        savedInstanceState.putInt(VIS_SHOES, vis_shoes);
        savedInstanceState.putInt(VIS_GLASS, vis_glasses);
        savedInstanceState.putInt(VIS_HAT, vis_hat);
        savedInstanceState.putInt(VIS_MOUTH, vis_mouth);

        super.onSaveInstanceState(savedInstanceState);
    }
}
