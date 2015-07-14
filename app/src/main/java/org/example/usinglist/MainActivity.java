package org.example.usinglist;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends ListActivity {

    public final int REQUEST_CODE = 100;
    List<Flower> flowers = new FlowerData().getFlowers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayAdapter<Flower> aa = new ArrayAdapter<Flower>(this, android.R.layout.simple_list_item_1, flowers);
//        setListAdapter(aa);

        FlowerAdapter fa = new FlowerAdapter(this, R.layout.item_flower, flowers);
        setListAdapter(fa);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText(this, flowers.get(position).toString(), Toast.LENGTH_LONG).show();
    }
}
