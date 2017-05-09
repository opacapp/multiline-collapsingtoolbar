package net.opacapp.multilinecollapsingtoolbar.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import net.opacapp.multilinecollapsingtoolbar.CollapsingToolbarLayout;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_light);
        setSupportActionBar(toolbar);
        // change to a dark font when collapsed
        ((CollapsingToolbarLayout)findViewById(R.id.collapsingtoolbarlayout)).setCollapsedTitleTextColor(0xff202020);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_demo, menu);
        // set up the menu on the second toolbar
        // note: in general this won't be sufficient to make it work, but this is not the point of this demo
        ((Toolbar) findViewById(R.id.toolbar_dark)).inflateMenu(R.menu.menu_demo);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
