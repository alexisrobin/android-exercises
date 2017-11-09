package fr.android.androidexercises;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by alexis on 09/11/2017.
 */

public class BookAdapterForRecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Book> books;

    public BookAdapterForRecyclerView(LayoutInflater inflater, List<Book> books) {
        this.inflater = inflater;
        this.books = books;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(inflater.inflate(R.layout.custom_view_item_book, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((BookItemView) holder.itemView).bindView(books.get((position)));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
