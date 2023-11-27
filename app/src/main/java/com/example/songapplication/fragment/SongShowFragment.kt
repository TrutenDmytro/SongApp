package com.example.songapplication.fragment

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.songapplication.R
import com.example.songapplication.Song

class SongShowFragment : Fragment(R.layout.fragment_song_show) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val song: Song = SongShowFragmentArgs.fromBundle(requireArguments()).song
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        val groupTextView: TextView = view.findViewById(R.id.groupTextView)
        val genreTextView: TextView = view.findViewById(R.id.genreTextView)
        val yearTextView: TextView = view.findViewById(R.id.yearTextView)
        val imageView: ImageView = view.findViewById(R.id.imageView)

        Glide.with(requireContext())
            .load(song.img)
            .into(imageView)
        nameTextView.text = song.name
        groupTextView.text = song.group
        genreTextView.text = song.genre
        yearTextView.text = song.year
    }
}