package ssm.unkown.bca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class timetable extends AppCompatActivity {
PDFView pdfView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        pdfView1=(PDFView) findViewById(R.id.pdfView1);
        pdfView1.fromAsset("tt.pdf")
                .load();
    }
}
