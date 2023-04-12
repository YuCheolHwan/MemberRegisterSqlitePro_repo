package com.example.memberregistersqlitepro

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.memberregistersqlitepro.databinding.ItemListBinding

class MemberRecyclerAdapter(val member: MutableList<Member>):RecyclerView.Adapter<MemberRecyclerAdapter.MemberHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberHolder {
        val itemListBinding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MemberHolder(itemListBinding)
    }

    override fun getItemCount() = member.size

    override fun onBindViewHolder(holder: MemberHolder, position: Int) {
        val itemListBinding = holder.itemListBinding
        itemListBinding.tvId.text = member.get(position).id
        itemListBinding.tvPw.text = member.get(position).password
        itemListBinding.tvLevel.text = member.get(position).level
        itemListBinding.tvEmail.text = member.get(position).email
        itemListBinding.tvName2.text = member.get(position).name
        itemListBinding.tvPhoneNumber2.text = member.get(position).phone
        itemListBinding.tvAddress2.text = member.get(position).address

    }
    inner class MemberHolder(val itemListBinding: ItemListBinding) : RecyclerView.ViewHolder(itemListBinding.root){}

}