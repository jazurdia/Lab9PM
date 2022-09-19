package com.example.lab9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab9.adapters.PlaceAdapter
import com.example.lab9.database.Character
import com.example.lab9.database.RickAndMortyDB


class FragmentListOfCharacters() : Fragment(R.layout.fragment_list_of_characters), PlaceAdapter.RecyclerViewCharacter {

    private lateinit var recyclerview: RecyclerView
    private lateinit var adapter: PlaceAdapter
    private lateinit var list: MutableList<Character>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerview = view.findViewById(R.id.listOfCharacters)
        fRecycler()
    }

    private fun fRecycler() {
        list = RickAndMortyDB.getCharacters()
        adapter = PlaceAdapter(list, this)
        recyclerview.layoutManager = LinearLayoutManager(requireContext())
        recyclerview.adapter = adapter
        recyclerview.setHasFixedSize(true)
    }

    private fun onCharacterClicked(character: Character) {
        //val something = FragmentListDirections.actionFragmentListToCharacterDetailsFragment(character)
        //requireView().findNavController().navigate(some)
    }

    override fun onCharacterClick(character: Character) {
        TODO("Not yet implemented")
        // lo de arriba vavos
    }

}