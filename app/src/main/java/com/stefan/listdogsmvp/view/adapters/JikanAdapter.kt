package com.stefan.listdogsmvp.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.stefan.listdogsmvp.R
import com.stefan.listdogsmvp.databinding.RecyclerlayoutBinding
import com.stefan.listdogsmvp.model.dtClases.characterDtModel

class JikanAdapter: RecyclerView.Adapter<JikanAdapter.JikanViewHolder>() {

    val characters = mutableListOf<characterDtModel>()

    class JikanViewHolder(view: View): RecyclerView.ViewHolder(view){

        private val binding = RecyclerlayoutBinding.bind(view)
        
        fun bind(characterDtModel: characterDtModel){
            binding.NameCharacter.text = characterDtModel.data.name
            binding.AboutTxt.text = characterDtModel.data.about
           Picasso.get().load(characterDtModel.data.images.webp.small_image_url).into(binding.ImgCharacter)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JikanViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recyclerlayout,parent,false)
        return JikanViewHolder(view)
    }

    override fun onBindViewHolder(holder: JikanViewHolder, position: Int) {
        val character = characters[position]
        holder.bind(character)
    }

    override fun getItemCount() = characters.size
}