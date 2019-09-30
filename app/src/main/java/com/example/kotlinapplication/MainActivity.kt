package com.example.kotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GeneralItemIntraction<User> {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false) as RecyclerView.LayoutManager?

        val users = ArrayList<User>()

        users.add(User("hassan","rrezai","hassan@gmail.com"))
        users.add(User("milad","miladi","milad@gmail.com"))
        users.add(User("nima","nimai","nima@gmail.com"))
        users.add(User("hassan","rrezai","hassan@gmail.com"))
        users.add(User("milad","miladi","milad@gmail.com"))
        users.add(User("nima","nimai","nima@gmail.com"))
        users.add(User("hassan","rrezai","hassan@gmail.com"))
        users.add(User("milad","miladi","milad@gmail.com"))
        users.add(User("nima","nimai","nima@gmail.com"))
        users.add(User("hassan","rrezai","hassan@gmail.com"))
        users.add(User("milad","miladi","milad@gmail.com"))


        val adapter=UsersAdapter(users,this@MainActivity)
        recyclerView.adapter = adapter





    }

    //we have access to data of each row here too
    override fun invokeItem(data: User) {

      var name:String =   data.firstname
      var lastname:String =   data.lastname
      var email:String =   data.email

    }
}
