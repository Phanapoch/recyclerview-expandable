package com.andexert.expandablelayout;

import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import io.github.hendraanggrian.expandablelayoutrecyclerview.ExpandableLayoutItem;
import io.github.hendraanggrian.expandablelayoutrecyclerview.ExpandableLayoutRecyclerView;

/**
 * Created by hendraanggrian on 6/13/16.
 */
public class TestAdapter extends ExpandableLayoutRecyclerView.Adapter<TestAdapter.ViewHolder> {

    private List<String> list;

    public TestAdapter(LinearLayoutManager lm) {
        super(lm);
        list = new ArrayList<>();
        list.add("Loren");
        list.add("Ipsum");
        list.add("Hello");
        list.add("World");
        list.add("Android");
        list.add("Totally");
        list.add("Rocks");
    }

    @Override
    public TestAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TestAdapter.ViewHolder holder, final int position) {
        super.onBindViewHolder(holder, position);

        final TextView header_text = (TextView) holder.expandableLayoutItem.getHeaderLayout().findViewById(R.id.header_text);
        header_text.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends ExpandableLayoutRecyclerView.ViewHolder {
        public ExpandableLayoutItem expandableLayoutItem;

        public ViewHolder(View itemView) {
            super(itemView);
            expandableLayoutItem = (ExpandableLayoutItem) itemView.findViewById(R.id.row);
        }

        @Override
        public ExpandableLayoutItem getExpandableLayoutItem() {
            return expandableLayoutItem;
        }
    }
}