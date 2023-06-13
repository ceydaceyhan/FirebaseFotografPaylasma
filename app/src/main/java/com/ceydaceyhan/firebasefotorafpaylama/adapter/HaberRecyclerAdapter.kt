package com.ceydaceyhan.firebasefotorafpaylama.adapter

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.ceydaceyhan.firebasefotorafpaylama.model.Post
import com.ceydaceyhan.firebasefotorafpaylama.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_row.view.recycler_row_imageview
import kotlinx.android.synthetic.main.recycler_row.view.recycler_row_kullanici_email
import kotlinx.android.synthetic.main.recycler_row.view.recyler_row_yorum

class HaberRecyclerAdapter (val postList : ArrayList<Post>) : RecyclerView.Adapter<HaberRecyclerAdapter.PostHolder>() {
    class PostHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_row,parent,false)
        return PostHolder(view)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.itemView.recycler_row_kullanici_email.text = postList[position].kullaniciEmail
        holder.itemView.recyler_row_yorum.text= postList[position].kullaniciYorum
        Picasso.get().load(postList[position].gorselUrl).into(holder.itemView.recycler_row_imageview)

    }

    override fun getItemCount(): Int {
        return postList.size
    }
}