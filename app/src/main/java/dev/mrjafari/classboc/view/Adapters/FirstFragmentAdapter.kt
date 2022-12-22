package dev.mrjafari.classboc.view.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.mrjafari.classboc.databinding.ActivityMainBinding
import dev.mrjafari.classboc.databinding.HomeItemBinding
import dev.mrjafari.classboc.model.FirstFragmentModel
import dev.mrjafari.classboc.view.FirstFragment
import java.util.zip.Inflater

class FirstFragmentAdapter(val lists: ArrayList<FirstFragmentModel>) :
    RecyclerView.Adapter<FirstFragmentAdapter.FirstFragmentAdapterViewHolder>() {

    class FirstFragmentAdapterViewHolder(private val itemBinding: HomeItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(firstFragmentModel: FirstFragmentModel) {
            itemBinding.test.text = firstFragmentModel.title
        }
    }

        override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FirstFragmentAdapterViewHolder {
        val itemBinding = HomeItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FirstFragmentAdapterViewHolder(itemBinding)

    }

    override fun onBindViewHolder(holder: FirstFragmentAdapterViewHolder, position: Int) {
       val model = lists[position]
       holder.bind(model)
    }

    override fun getItemCount(): Int =lists.size
}