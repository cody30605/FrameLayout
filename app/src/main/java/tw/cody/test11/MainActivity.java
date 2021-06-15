package tw.cody.test11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private F1 f1;
    private F2 f2;
    private FragmentManager manager;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new F1();  f2 = new F2();
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container,f1);
        transaction.commit();

        textView = findViewById(R.id.textView);
    }

    public void f1(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,f1);
        transaction.commit();
    }

    public void f2(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,f2);
        transaction.commit();
    }

    public void setTitle(String newTitle) {
        textView.setText(newTitle);
    }

    public F2 getF2() {
        return f2;
    }
}