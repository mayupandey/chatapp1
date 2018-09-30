package ssm.unkown.bca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class actitivity_sslist extends AppCompatActivity {
private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actitivity_sslist);


        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        ImageView intro_ss= (ImageView) findViewById(R.id.intro_ss);
        ImageView ml_ss = (ImageView) findViewById(R.id.ml_ss);
        ImageView ass_ss = (ImageView) findViewById(R.id.ass_ss);
        ImageView evol_ss=(ImageView)findViewById(R.id.evol_ss);
        ImageView macro_ss=(ImageView)findViewById(R.id.macro_ss);
        ImageView llc_ss=(ImageView)findViewById(R.id.llc_ss);
        ImageView pass1_ss=(ImageView)findViewById(R.id.pass1_ss);
        ImageView pass2_ss=(ImageView)findViewById(R.id.pass2_ss);
        intro_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syllabus = new Intent(actitivity_sslist.this,ss.class);
                startActivity(syllabus);
            }
        });



        ml_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notes = new Intent(actitivity_sslist.this,ssml.class);
                startActivity(notes);
            }
        });
        ass_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(actitivity_sslist.this,ssassembler.class);
                startActivity(cont);
            }
        });
        evol_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(actitivity_sslist.this,ssevol.class);
                startActivity(cont);
            }
        });
        macro_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(actitivity_sslist.this,ssmacro.class);
                startActivity(cont);
            }
        });
        llc_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(actitivity_sslist.this,ssllc.class);
                startActivity(cont);
            }
        });
        pass1_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(actitivity_sslist.this,sspassi.class);
                startActivity(cont);
            }
        });
        pass2_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(actitivity_sslist.this,sspassii.class);
                startActivity(cont);
            }
        });


    }
}
