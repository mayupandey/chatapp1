package ssm.unkown.bca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class activity_dslist extends AppCompatActivity {
private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dslist);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        ImageView intro_ds= (ImageView) findViewById(R.id.introds);
        ImageView algocomplex_ds = (ImageView) findViewById(R.id.algocomp);
        ImageView array_ds = (ImageView) findViewById(R.id.dsarray);
        ImageView  graph_ds=(ImageView)findViewById(R.id.dsgraph);
        ImageView queue_ds=(ImageView)findViewById(R.id.dsqueue);
        ImageView stack_ds=(ImageView)findViewById(R.id.dsstack);
        ImageView ll_ds=(ImageView)findViewById(R.id.ll_ds);
        ImageView tree_ds=(ImageView)findViewById(R.id.tree_ds);
        intro_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syllabus = new Intent(activity_dslist.this,datastructure.class);
                startActivity(syllabus);
            }
        });



        algocomplex_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notes = new Intent(activity_dslist.this,dsalgocompl.class);
                startActivity(notes);
            }
        });
        array_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(activity_dslist.this,arrayds.class);
                startActivity(cont);
            }
        });
        graph_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(activity_dslist.this,graphds.class);
                startActivity(cont);
            }
        });
        queue_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(activity_dslist.this,queueds.class);
                startActivity(cont);
            }
        });
        stack_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(activity_dslist.this,stackds.class);
                startActivity(cont);
            }
        });
        ll_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(activity_dslist.this,linkedlistds.class);
                startActivity(cont);
            }
        });
        tree_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cont = new Intent(activity_dslist.this,treeds.class);
                startActivity(cont);
            }
        });

    }
}
