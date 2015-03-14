package com.benscholer.appcreator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;


public class Projects extends ActionBarActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Projects");
		ImageView icon = new ImageView(this);
		icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_action_new));
		FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
				.setContentView(icon)
				.setBackgroundDrawable(R.drawable.button_action_pink_selector)
				.build();
    }
}
