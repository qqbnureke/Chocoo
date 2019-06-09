package com.nurda.chocotask;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nurda.chocotask.model.Book;
import com.nurda.chocotask.model.NetworkRepository;
import com.nurda.chocotask.util.CustomAdapter;
import com.nurda.chocotask.util.ProgressDialogUtil;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_getList;
    RecyclerView recyclerView;
    ArrayList<Book> booksList;
    ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        btn_getList = (Button) findViewById(R.id.btn_getBookList);
        btn_getList.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_getBookList){
            showProgressDialog(getString(R.string.getting_data));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    hideProgressDialog();
                    NetworkRepository repository = new NetworkRepository();
                    booksList = repository.getBooks();

                    if (!booksList.isEmpty()){
                        setBooksToList();
                    }else{
                        Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                    }
                }
            }, 3000);



        }
    }

    private void setBooksToList() {
        recyclerView.setAdapter(new CustomAdapter(MainActivity.this, booksList));
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    public void showProgressDialog(String message){
        dialog = ProgressDialogUtil.showDialog(MainActivity.this,message);
    }

    public void hideProgressDialog(){
        dialog.dismiss();
    }

}
