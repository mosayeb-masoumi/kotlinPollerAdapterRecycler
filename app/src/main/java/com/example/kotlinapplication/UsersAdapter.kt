package com.example.kotlinapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


class UsersAdapter(private val userList: List<User>, val listener: GeneralItemIntraction<User>) :
    RecyclerView.Adapter<UserViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return UserViewHolder(view,listener)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindUserData(userList[position])

    }


}
