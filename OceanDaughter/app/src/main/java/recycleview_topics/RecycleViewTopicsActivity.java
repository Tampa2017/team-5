package recycleview_topics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.oceansdaughter.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jats2k12Kite on 10/20/2017.
 */

public class RecycleViewTopicsActivity extends AppCompatActivity {


    private List<Topic> topicsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TopicsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_topics);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new TopicsAdapter(topicsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        initTopicList();
    }

    private void initTopicList() {

        topicsList.add(new Topic("Sharks"));
        topicsList.add(new Topic("Mermaids"));
        topicsList.add(new Topic("Fishes"));
        topicsList.add(new Topic("Whales"));
        topicsList.add(new Topic("Other"));


        mAdapter.notifyDataSetChanged();
    }
}



