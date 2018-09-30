package ssm.unkown.bca;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class ContactUs extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        ImageView email = (ImageView) findViewById(R.id.email);
        ImageView wapp = (ImageView)findViewById(R.id.whatsapp1);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
                        public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","cuassign@gmail.com", null));
//Intent intent = new Intent(Intent.ACTION_SEND);
//intent.setType("text/html");
               // intent.putExtra(Intent.EXTRA_EMAIL,"cuassign@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Thanks for contacting team");
                intent.putExtra(Intent.EXTRA_TEXT, " ");

                startActivity(Intent.createChooser(intent, "Send Email"));

            }

        });
        wapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toNumber = "+91 99153 30878"; // contains spaces.
                toNumber = toNumber.replace("+", "").replace(" ", "");

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.putExtra("jid", toNumber + "@s.whatsapp.net");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Enter your query:");
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setPackage("com.whatsapp");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
    }
}
