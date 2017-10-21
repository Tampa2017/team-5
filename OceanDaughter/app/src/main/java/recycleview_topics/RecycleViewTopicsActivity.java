package recycleview_topics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

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

        // call method to populate view holders
        initTopicList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_name) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Mock data to represent how it will look
     */
    private void initTopicList() {
        topicsList.add(new Topic("Shark Facts"));
        topicsList.add(new Topic("Killer Whales"));
        topicsList.add(new Topic("Ocean"));
        topicsList.add(new Topic("Mermaids Program"));
        topicsList.add(new Topic("Orion's Guardians"));
        topicsList.add(new Topic("Educational Programs"));
        topicsList.add(new Topic("Fantastic Beasts"));
        topicsList.add(new Topic("Feeding Frenzy"));
        topicsList.add(new Topic("Glow-in-the-Dark Shark"));
        topicsList.add(new Topic("Saltie vs. Freshie "));
        topicsList.add(new Topic("Shark Tagging "));
        topicsList.add(new Topic("Taking A Bite Out Of STEM"));
        topicsList.add(new Topic("Workshops"));

        mAdapter.notifyDataSetChanged();
    }
}



