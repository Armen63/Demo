package com.com.armen.th.ui.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import com.com.armen.th.R;
import com.com.armen.th.db.Data;
import com.com.armen.th.db.helper.Helper;
import com.com.armen.th.ui.adapter.CountryPagerAdapter;
import com.com.armen.th.ui.adapter.WordAdapter;

import java.util.ArrayList;
import java.util.Locale;

public class CountryActivity extends BaseActivity implements View.OnClickListener, WordAdapter.OnItemClickListener {

    // ===========================================================
    // Constants
    // ===========================================================

    private static final java.lang.String LOG_TAG = CountryActivity.class.getSimpleName();

    // ===========================================================
    // Fields
    // ===========================================================

    private RecyclerView mRecyclerViewWord;
    private ViewPager mViewPager;
    private WordAdapter mWordAdapter;
    private CountryPagerAdapter mCustomPagerAdapter;
    private ArrayList<String> mWordListForeign;
    private String countryName;
    private Typeface cFont;
    private TextToSpeech mTts;


    // ===========================================================
    // Getter & Setter
    // ===========================================================
    // ===========================================================
    // Methods for/from SuperClass
    // ===========================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        findViews();
        init();
        customizeActionBar();
        setListeners();
    }


    @Override
    protected int getLayoutResource() {
        return R.layout.activity_country;
    }


    // ===========================================================
    // Click Listeners
    // ===========================================================

    @Override
    public void onClick(View v) {
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void setListeners() {

    }

    // ===========================================================
    // Methods
    // ===========================================================

    private void findViews() {
        mViewPager = findViewById(R.id.vp_image_pager);
        mRecyclerViewWord = findViewById(R.id.rv_word_list);
    }

    private void customizeActionBar() {
        setActionBarTitle(countryName);
    }

    private void init() {
        countryName = getIntent().getStringExtra("COUNTRY_NAME");
//        fillList();
        initViewPager();
        initRecycleView();
    }

    private void initRecycleView() {
        mRecyclerViewWord.setHasFixedSize(true);
        mRecyclerViewWord.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerViewWord.setItemAnimator(new DefaultItemAnimator());
        cFont = Typeface.createFromAsset(getAssets(), "fonts/myFont.ttf");
        mWordAdapter = new WordAdapter(Helper.getWords(countryName, getApplication()), cFont, this);
        mRecyclerViewWord.setAdapter(mWordAdapter);
    }

    private void initViewPager() {
        mCustomPagerAdapter = new CountryPagerAdapter(Helper.getImages(countryName), this);
        mViewPager.setAdapter(mCustomPagerAdapter);

//        int margin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 25 * 2, getResources().getDisplayMetrics());
//        mViewPager.setPageMargin(-margin);
//        mViewPager.setPadding(80, 0, 80, 0);
//        mViewPager.setCurrentItem(1);

    }


    @Override
    public void onItemClick(String word, int position) {
        mTts = new TextToSpeech(CountryActivity.this, status -> {
            int currentPos = Data.COUNTRY_NAME.indexOf(countryName);
            mTts.setLanguage(new Locale(Data.COUNTRY_CODE.get(currentPos)));

            switch (countryName) {
                case "Armenia":
                    mTts.speak(Data.ARMENIAN_WORDS_ARM[position], TextToSpeech.QUEUE_FLUSH, null);
                    break;
                case "Russia":
                    mTts.speak(Data.RUSSIAN_WORDS_RU[position], TextToSpeech.QUEUE_FLUSH, null);
                    break;
                case "France":
                    mTts.speak(Data.FRENCH_WORDS_FR[position], TextToSpeech.QUEUE_FLUSH, null);
                    break;
                case "Georgia":
                    mTts.speak(Data.GEORGIAN_WORDS_GE[position], TextToSpeech.QUEUE_FLUSH, null);
                    break;
                case "Germany":
                    mTts.speak(Data.GERMANY_WORDS_GE[position], TextToSpeech.QUEUE_FLUSH, null);
                    break;
                case "Spain":
                    mTts.speak(Data.SPAIN_WORDS_ES[position], TextToSpeech.QUEUE_FLUSH, null);
                    break;
            }
        });
    }
}
