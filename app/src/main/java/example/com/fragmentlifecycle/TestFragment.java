package example.com.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class TestFragment extends Fragment {

    public TestFragment() {
    }

    private void trace(String method) {
        Log.i("LifeCycle", Integer.toHexString(this.hashCode()) + "#" + method);
    }

    @Override
    public void onAttach(Context context) {
        trace("onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        trace("onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        trace("onCreateView");
        return inflater.inflate(R.layout.fr_test, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        trace("onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        trace("onCreateAnimation");
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    @Override
    public void onStart() {
        trace("onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        trace("onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        trace("onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        trace("onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        trace("onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        trace("onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        trace("onDetach");
        super.onDetach();
    }

}
