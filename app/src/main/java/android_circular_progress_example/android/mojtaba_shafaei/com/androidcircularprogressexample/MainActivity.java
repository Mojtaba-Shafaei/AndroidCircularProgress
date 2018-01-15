package android_circular_progress_example.android.mojtaba_shafaei.com.androidcircularprogressexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.mojtaba_shafaei.android.CircularProgress;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    CircularProgress cp = findViewById(R.id.c1);
    cp.setProgress(2);
  }
}
