package ssm.unkown.bca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class dbmslist extends AppCompatActivity {
private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbmslist);
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        ImageView intro_dbms= (ImageView) findViewById(R.id.intro_dbms);
        ImageView arch_dbms = (ImageView) findViewById(R.id.arch_dbms);
        ImageView int_dbms = (ImageView) findViewById(R.id.int_dbms);
        ImageView fo_dbms=(ImageView)findViewById(R.id.fo_dbms);
        ImageView ih_dbms=(ImageView)findViewById(R.id.ih_dbms);
        ImageView rac_dbms=(ImageView)findViewById(R.id.rac_dbms);
        ImageView b_tree=(ImageView)findViewById(R.id.b_tree);
        ImageView n_dbms=(ImageView)findViewById(R.id.n_dbms);
        intro_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syllabus = new Intent(dbmslist.this,dbms.class);
                startActivity(syllabus);
            }
        });



        arch_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notes = new Intent(dbmslist.this,archdbms.class);
                startActivity(notes);
            }
        });
        int_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(dbmslist.this,intigrdbms.class);
                startActivity(cont);
            }
        });
        fo_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(dbmslist.this,fodbms.class);
                startActivity(cont);
            }
        });
        ih_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(dbmslist.this,ihdbms.class);
                startActivity(cont);
            }
        });
        rac_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(dbmslist.this,racdbms.class);
                startActivity(cont);
            }
        });
        b_tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(dbmslist.this,bdbms.class);
                startActivity(cont);
            }
        });
        n_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(dbmslist.this,normdbms.class);
                startActivity(cont);
            }
        });










    }
}
