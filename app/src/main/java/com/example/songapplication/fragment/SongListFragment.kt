package com.example.songapplication.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.songapplication.R
import com.example.songapplication.Song
import com.example.songapplication.adapter.SongAdapter

class SongListFragment : Fragment(R.layout.fragment_song_list) {

    private val songs = listOf(
        Song("Down with the Sickness", "Disturbed", "Metal", "2000", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a2/TheSickness.jpg/220px-TheSickness.jpg"),
        Song("(sic)", "Slipknot", "Metal", "1999", "https://upload.wikimedia.org/wikipedia/ru/thumb/a/a0/Slipknot_Cover_1999.jpg/274px-Slipknot_Cover_1999.jpg"),
        Song("I Stand Alone", "Godsmack", "Nu metal", "2002", "https://static.wikia.nocookie.net/rockband/images/a/ab/Faceless.jpg/revision/latest/scale-to-width-down/250?cb=20121222003456")
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = SongAdapter(songs) { selectedSong ->
            navigateToSongDetail(selectedSong)
        }
    }
    private fun navigateToSongDetail(song: Song) {
        val action = SongListFragmentDirections.actionSongListFragmentToSongShowFragment(song)
        findNavController().navigate(action)
    }
}