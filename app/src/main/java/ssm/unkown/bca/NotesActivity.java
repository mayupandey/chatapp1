package ssm.unkown.bca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

public class NotesActivity extends AppCompatActivity {
private AdView mAdView;
private PublisherInterstitialAd mPublisherInterstitialAd;
    private PublisherInterstitialAd mPublisherInterstitialAd1;
    private PublisherInterstitialAd mPublisherInterstitialAd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

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
        mPublisherInterstitialAd2 = new PublisherInterstitialAd(this);
        mPublisherInterstitialAd2.setAdUnitId("/6499/example/interstitial");
        mPublisherInterstitialAd2.loadAd(new PublisherAdRequest.Builder().build());



        ImageView ds= (ImageView) findViewById(R.id.ds);
        ImageView dbms = (ImageView) findViewById(R.id.dbms);
        ImageView probstat = (ImageView) findViewById(R.id.probstat);
        ImageView  ss =(ImageView)findViewById(R.id.ss);
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syllabus = new Intent(NotesActivity.this,activity_dslist.class);
                if(mPublisherInterstitialAd.isLoaded()){
                    mPublisherInterstitialAd.show();
                    startActivity(syllabus);
                }
                else
                {
                    startActivity(syllabus);
                }
            }
        });



        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notes = new Intent(NotesActivity.this,dbmslist.class);
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
        probstat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(NotesActivity.this,probstat.class);
                startActivity(cont);
            }
        });
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(NotesActivity.this,actitivity_sslist.class);
                startActivity(cont);
            }
        });
    }
}
