package com.madkins.androidgms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RosterListFragment : Fragment() {

    private lateinit var rosterRecyclerView: RecyclerView
    private var adapter: RosterAdapter? = null
    private val rosterListViewModel: RosterListViewModel by lazy {
        ViewModelProviders.of(this).get(RosterListViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_roster_list, container, false)

        rosterRecyclerView = view.findViewById(R.id.roster_recycler_view) as RecyclerView
        rosterRecyclerView.layoutManager = LinearLayoutManager(context)

        updateUI()

        return view
    }

    private fun updateUI() {
        val roster = rosterListViewModel.characters
        adapter = RosterAdapter(roster) // Pass in the ist of players to the adapter here
        rosterRecyclerView.adapter = adapter
    }

    companion object {
        fun newInstance(): RosterListFragment {
            return RosterListFragment()
        }
    }

    private inner class RosterHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = itemView.findViewById(R.id.text_player_name)
        val classTextView: TextView = itemView.findViewById(R.id.text_player_class)
        val classIcon: ImageView = itemView.findViewById(R.id.image_class_icon)

    }

    private inner class RosterAdapter(var roster: List<Character>) : RecyclerView.Adapter<RosterHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RosterHolder {
            val view = layoutInflater.inflate(R.layout.list_item_player, parent, false)
            return RosterHolder(view)
        }

        override fun getItemCount() = roster.size

        override fun onBindViewHolder(holder: RosterHolder, position: Int) {
            val character = roster[position]
            holder.apply {
                nameTextView.text = character.charName
                classTextView.text = character.charClass.className
                classTextView.setTextColor(character.charClass.color)
                classIcon.setImageResource(character.charClass.resourceID)
            }
        }
    }
}
