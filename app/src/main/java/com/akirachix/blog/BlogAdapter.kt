package com.akirachix.blog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import kotlin.contracts.contract

class BlogAdapter(var blogSite: List<Blog>):
    RecyclerView.Adapter<BlogViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.live_blogs, parent, false)
        return BlogViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val blog = blogSite[position]
        holder.tvName.text = blog.name
        holder.tvDate.text = blog.date
        holder.tvTile.text = blog.title
        holder.tvSeemore.text = blog.more
        holder.tvParagraph.text = blog.paragraph
    }

    override fun getItemCount(): Int {
        return blogSite.size
    }
}

class BlogViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
     val tvName = itemView.findViewById<TextView>(R.id.tvName)
     val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
     val tvTile = itemView.findViewById<TextView>(R.id.tvTitle)
     val tvParagraph = itemView.findViewById<TextView>(R.id.tvParagraph)
     val tvSeemore = itemView.findViewById<TextView>(R.id.tvSeemore)

}