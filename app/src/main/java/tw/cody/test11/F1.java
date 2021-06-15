package tw.cody.test11;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class F1 extends Fragment {
    private View mainView;
    private TextView textView;
    private Button button,button1,button2;
    private MainActivity mainActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
//        return inflater.inflate(R.layout.mainf1,container,false);
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.mainf1,container,false);
            textView = mainView.findViewById(R.id.lottery);
            button = mainView.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int lottery = (int)(Math.random()*49+1);
                    textView.setText("" + lottery);
                }
            });

            button1 = mainView.findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.setTitle("hello cody");
                }
            });

            button2 = mainView.findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.getF2().chTitle("hello cody cody");
                }
            });
        }
        return mainView;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        mainActivity = (MainActivity)context;
    }
}
