package wang.com.scrollholdlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> list = new ArrayList<String>();
    private MyListView mylistview;
    private MyListView mylistview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initdate();

        init();
    }

    private void initdate() {
        for (int i = 0; i < 20; i++) {
            list.add("我要涨工资" + i);
        }

    }

    private void init() {
        mylistview = (MyListView) findViewById(R.id.lv);
        mylistview1 = (MyListView) findViewById(R.id.lv1);
        mylistview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
        mylistview1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
        mylistview.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });
    }


}
