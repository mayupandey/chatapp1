package ssm.unkown.bca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class queueds extends AppCompatActivity {
PDFView book1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queueds);
        book1=(PDFView) findViewById(R.id.pdfView);
        book1.fromAsset("Queue-min.pdf")
                .load();
    }
}
