package com.julio.greennotes.service

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.julio.greennotes.R


class TaskAdapter (private val context : Context, private val taskList: List<Task>): RecyclerView.Adapter<TaskAdapter.MyViewHolder>(){

    //02- Recebe uma view e cria um padrão de viewHolder com base nos campos contidos na view
    class MyViewHolder(private val view : View): RecyclerView.ViewHolder(view){
        //03-Declarando quais atributos meu viewHolder irá conter
        val nameTextView : TextView = view.findViewById(R.id.textView_name)
        val detailTextView : TextView = view.findViewById(R.id.textView_detail)
        val responsableTextView : TextView = view.findViewById(R.id.textView_responsible)
        val dateTextView : TextView = view.findViewById(R.id.textView_date)
        val statusTextView : TextView = view.findViewById(R.id.textView_status)



    }

    //TODO:Substituir pelo cardView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // 01 - Recebe um layout para ser inflado que será utilizado como base pelo view holder
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.card_test, parent,false)
        return MyViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = taskList[position]
        //04-Manipulando os atributos declarado do meu view holder setando propriedades do elemento da lista
        holder.nameTextView.text = item.name
        holder.detailTextView.text = item.details
        holder.responsableTextView.text = item.responsible
        holder.dateTextView.text = item.date
        holder.statusTextView.text = item.status

    }
    //Retorna a quantidade de elementos para o viewHolder poder manipular de maneira eficaz quantas views irá
    //disponibilizar para nossa recycler view
    override fun getItemCount() = taskList.size

}
