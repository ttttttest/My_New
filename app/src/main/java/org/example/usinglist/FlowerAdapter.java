package org.example.usinglist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Я on 05.07.2015.
 */
public class FlowerAdapter extends ArrayAdapter<Flower> {

    private Context context;
    private List<Flower> objects;

    public FlowerAdapter(Context context, int resource, List<Flower> objects) {
        super(context, resource, objects);

        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Flower flower = objects.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE );
        View view = inflater.inflate(R.layout.item_flower, null);

        ImageView iv = (ImageView) view.findViewById(R.id.imageView);
        iv.setImageResource(flower.imageResource);

        TextView tv = (TextView) view.findViewById(R.id.textView);
        tv.setText(flower.toString());

        return view;
    }
}
