package zy.com.firstopen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private ImageView imageView;
    private ImageView imageView1;
    private int count = 0;

    private ViewStub viewStub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewStub = findViewById(R.id.stub_tip);
        viewStub.inflate();

        relativeLayout = findViewById(R.id.relative);
        imageView = findViewById(R.id.image);
        imageView1 = findViewById(R.id.image1);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0) {
                    relativeLayout.removeView(imageView);
                    imageView1.setVisibility(View.VISIBLE);
                    count++;
                }else {
                    relativeLayout.removeView(imageView1);
                    viewStub.setVisibility(View.GONE);
                }
            }
        });
    }
}
