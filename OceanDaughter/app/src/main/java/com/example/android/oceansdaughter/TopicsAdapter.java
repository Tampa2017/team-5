package com.example.android.oceansdaughter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.oceansdaughter.LinkActivity;

import java.util.List;

class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.TopicsAdapterViewHolder> {

    private List<Topic> topicList;
    private Context ctx;

    TopicsAdapter(List<Topic> topicList, Context ctx) {
        this.topicList = topicList;
        this.ctx = ctx;
    }

    @Override
    public TopicsAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.topic_list_layout, parent, false);

        return new TopicsAdapterViewHolder(itemView, ctx);
    }

    @Override
    public void onBindViewHolder(TopicsAdapterViewHolder holder, int position) {
        holder.topic.setText(topicList.get(position).getTopic());
    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    class TopicsAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView topic;
        Context ctx;

        TopicsAdapterViewHolder(View view, Context ctx) {
            super(view);
            this.ctx = ctx;
            view.setOnClickListener(this);
            topic = (TextView) view.findViewById(R.id.topic);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(this.ctx, LinkActivity.class);
            ctx.startActivity(intent);
        }
    }
}