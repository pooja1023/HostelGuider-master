package com.example.padminich.hostelguide;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class PostDetails extends AppCompatActivity {
   TextView mtitle,mdetail;
   ImageView mimage;
   Button mback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_post_details);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("Hostel Details");
       actionbar.setDisplayHomeAsUpEnabled(true);
    actionbar.setDisplayShowHomeEnabled(true);
    mtitle=findViewById(R.id.titlev);
    mimage=findViewById(R.id.imagev);
    mdetail=findViewById(R.id.descv);
    mback=findViewById(R.id.back);
    byte[] bytes= getIntent().getByteArrayExtra("Image");
    String title=getIntent().getStringExtra("Title");
    String desc=getIntent().getStringExtra("Description");
    Bitmap bmp= BitmapFactory.decodeByteArray(bytes,0,bytes.length);
        mtitle.setText(title);
        mdetail.setText(desc);
        mimage.setImageBitmap(bmp);
    /*mback.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });*/
    }


    @Override
    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return true;
    }
}
