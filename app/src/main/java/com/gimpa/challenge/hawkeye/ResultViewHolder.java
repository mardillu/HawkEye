package com.gimpa.challenge.hawkeye;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by DELL on 3/12/2017.
 */

public class ResultViewHolder extends RecyclerView.ViewHolder {
    public TextView score;
    public TextView name;

    public ResultViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.result_name);
        score = (TextView) itemView.findViewById(R.id.result_score);
    }
}
