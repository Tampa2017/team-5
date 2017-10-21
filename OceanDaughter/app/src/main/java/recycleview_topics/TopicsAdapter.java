package recycleview_topics;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.oceansdaughter.R;

import java.util.List;

class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.TopicsAdapterViewHolder> {

    private List<Topic> topicList;

    public TopicsAdapter(List<Topic> topicList) {
        this.topicList = topicList;
    }

    @Override
    public TopicsAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.topic_list_layout, parent, false);

        return new TopicsAdapterViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TopicsAdapterViewHolder holder, int position) {
        holder.topic.setText(topicList.get(position).getTopic());
    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    public class TopicsAdapterViewHolder extends RecyclerView.ViewHolder {
        public TextView topic;

        public TopicsAdapterViewHolder(View view) {
            super(view);
            topic = (TextView) view.findViewById(R.id.topic);
        }
    }
}