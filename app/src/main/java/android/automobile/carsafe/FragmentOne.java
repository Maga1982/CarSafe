package android.automobile.carsafe;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentOne extends Fragment {
    public FragmentOne(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.one_fragment,container,false);
        ImageView imageView = rootView.findViewById(R.id.copilotid);
        imageView.setImageResource(R.drawable.copilot);
        return imageView;
    }
}
