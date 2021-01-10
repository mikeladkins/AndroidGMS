package com.madkins.androidgms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RosterListFragment : Fragment() {

    private lateinit var rosterRecyclerView: RecyclerView
    private var adapter: RosterAdapter? = null

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
        adapter = RosterAdapter() // Pass in the ist of players to the adapter here
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


    }

    private inner class RosterAdapter(
        // TODO: pass in a list of layer objects pulled from a DB to populate the views
    ) : RecyclerView.Adapter<RosterHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RosterHolder {
            val view = layoutInflater.inflate(R.layout.list_item_player, parent, false)
            return RosterHolder(view)
        }

        override fun getItemCount() = 5

        override fun onBindViewHolder(holder: RosterHolder, position: Int) {
            holder.apply {
                nameTextView.text = "Testing name binding"
                classTextView.text = "Testing class binding"
            }
        }
    }
}
