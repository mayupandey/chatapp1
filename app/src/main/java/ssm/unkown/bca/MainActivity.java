package ssm.unkown.bca;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;



public class MainActivity extends AppCompatActivity  {
private  AdView mAdView;
    private PublisherInterstitialAd mPublisherInterstitialAd;
    private PublisherInterstitialAd mPublisherInterstitialAd1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/630097811");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

//intestitial
        mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        mPublisherInterstitialAd.setAdUnitId("/6499/example/interstitial");
        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        mPublisherInterstitialAd1 = new PublisherInterstitialAd(this);
        mPublisherInterstitialAd1.setAdUnitId("/6499/example/interstitial");
        mPublisherInterstitialAd1.loadAd(new PublisherAdRequest.Builder().build());

        //Image button
        ImageView note= (ImageView) findViewById(R.id.notes);
        ImageView sya = (ImageView) findViewById(R.id.sya);
        ImageView contact = (ImageView) findViewById(R.id.contactus);
        ImageView  timetable =(ImageView)findViewById(R.id.time);
        sya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syllabus = new Intent(MainActivity.this,SYLLABUS_VIEW.class);
                startActivity(syllabus);

            }

        });



        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notes = new Intent(MainActivity.this,NotesActivity.class);

              if(mPublisherInterstitialAd.isLoaded()){
                mPublisherInterstitialAd.show();
                  startActivity(notes);
                }
                else
              {
                  startActivity(notes);
              }
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(MainActivity.this,ContactUs.class);
                if(mPublisherInterstitialAd1.isLoaded()){
                    mPublisherInterstitialAd1.show();
                    startActivity(cont);
                }
                else
                {
                    startActivity(cont);
                }
            }
        });
        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent time = new Intent(MainActivity.this, timetable.class);
                startActivity(time);

            }

            });
    }


}
