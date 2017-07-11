package com.bxw.application02;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.bxw.model.Person;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)this.findViewById(R.id.lv);
        listView.setAdapter(new MyAdpterView());
      //  listView
    }

    private class MyAdpterView extends BaseAdapter{

        private ArrayList<Person> list = new ArrayList<Person>();

        public MyAdpterView( ) {
            for (int i =0 ; i<20 ; i++){
                list.add(new Person("小强"+i , "1345435345"+i , "30000"));
            }
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            Person person = (Person)getItem(position);
            View item = View.inflate(MainActivity.this, R.layout.list_item, null);
                       TextView txtName = (TextView)item.findViewById(R.id.tname);
                        TextView txtTel = (TextView)item.findViewById(R.id.tphone);
                        TextView txtSalary = (TextView)item.findViewById(R.id.tsalary);
                        txtName.setText(person.getName());
                        txtTel.setText(person.getTel());
                        txtSalary.setText(person.getSalary());
                        return item;
        }
    }

 protected  void goHome(View view){
     RadioButton button = (RadioButton) view;
     Log.e("gxyd",  button.getText().toString() );
 }

}
