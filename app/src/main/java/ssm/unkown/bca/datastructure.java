package ssm.unkown.bca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class datastructure extends AppCompatActivity {
    PDFView book1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datastructure);
        book1=(PDFView) findViewById(R.id.pdfView);
        book1.fromAsset("Introdution-min.pdf")
                .load();

    }
}
