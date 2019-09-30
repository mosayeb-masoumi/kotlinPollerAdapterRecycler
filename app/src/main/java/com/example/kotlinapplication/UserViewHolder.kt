package com.example.kotlinapplication

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import android.widget.Toast

class UserViewHolder (view: View, val listener: GeneralItemIntraction<User>) : RecyclerView.ViewHolder(view) {

    val firstname = view.findViewById(R.id.row_txtname) as TextView
    val lastnam = view.findViewById(R.id.row_txtlastname) as TextView


    fun bindUserData(data:User){

        firstname.text = data.firstname
        lastnam.text = data.lastname

//        itemView.setOnClickListener{
//            Toast.makeText(itemView.context,""+ position.toString(),Toast.LENGTH_SHORT).show()
//        }


        // to access to each row in activity
        itemView.setOnClickListener { listener.invokeItem(data) }

    }
}