package tw.cody.test11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class F2 extends Fragment {
    private View mainView;
    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
//        return inflater.inflate(R.layout.mainf2,container,false);
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.mainf2, container, false);
            textView = mainView.findViewById(R.id.textView);
        }
        return mainView;
    }

    public void chTitle(String newtitle){
        textView.setText(newtitle);
    }
}
