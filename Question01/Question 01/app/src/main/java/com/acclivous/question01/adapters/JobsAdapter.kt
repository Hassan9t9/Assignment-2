package com.acclivous.question01.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.acclivous.question01.R
import com.acclivous.question01.models.JobsModel
import kotlinx.android.synthetic.main.jobs_items.view.*

class JobsAdapter(private val context: Context,private val dataFilter: ArrayList<JobsModel>, private val listener: ItemClickListener):
    RecyclerView.Adapter<JobsAdapter.JobsViewHolder>() {

    private val mInflater by lazy {
        LayoutInflater.from(context)
    }
    private var isFlag = false

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobsViewHolder {
        val view = mInflater.inflate(R.layout.jobs_items, parent, false)
        return JobsViewHolder(view)
    }
    override fun getItemCount(): Int {
        return dataFilter.size
    }
    override fun onBindViewHolder(holder: JobsViewHolder, position: Int) {

        holder.likeUnlike.setOnClickListener {
            if (isFlag.not()) {
                holder.likeUnlike.setImageDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.favourte_icon
                    )
                )
                isFlag = true
            }else{
                holder.likeUnlike.setImageDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.un_favourite_icon
                    )
                )
                isFlag = false
            }
        }

    }

    inner class JobsViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(v: View?) {
            listener.openDetail(
               dataFilter[adapterPosition]
            )
        }
        init {
            itemView.setOnClickListener(this)
        }

        val likeUnlike = itemView.selected_unselected

    }
    interface ItemClickListener {
        fun openDetail(notify: JobsModel)
    }
}