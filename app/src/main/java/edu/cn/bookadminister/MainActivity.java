package edu.cn.bookadminister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //声明控件
    private Button bt_createe;//添加
    private Button bt_updatee;//修改
    private Button bt_deletee;//删除
    private Button bt_read;//查询借书信息

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_createe = findViewById(R.id.bt_createe);
        bt_createe.setOnClickListener(this);

        bt_updatee = findViewById(R.id.bt_updatee);
        bt_updatee.setOnClickListener(this);

        bt_deletee = findViewById(R.id.bt_deletee);
        bt_deletee.setOnClickListener(this);

        bt_read = findViewById(R.id.bt_read);
        bt_read.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_createe){
            //跳转到添加学生借书情况界面
            Intent intent = new Intent(MainActivity.this, AddbooksActivity.class);
            startActivityForResult(intent, 0);
        }else if (v.getId() == R.id.bt_updatee){
            //跳转到修改界面
            Intent intent = new Intent(MainActivity.this, UpdateBooksActivity.class);
            startActivityForResult(intent, 1);
        }else if (v.getId() == R.id.bt_deletee){
            //跳转到删除界面
            Intent intent = new Intent(MainActivity.this, DeleteBooksActivity.class);
            startActivityForResult(intent, 2);
        }else if (v.getId() == R.id.bt_read){
            //跳转到查询界面
            Intent intent = new Intent(MainActivity.this, QueryBooksActivity.class);
            startActivityForResult(intent, 3);
        }
    }
}

