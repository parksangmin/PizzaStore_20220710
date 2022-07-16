package com.sangmin.pizzastore_20220710.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.sangmin.pizzastore_20220710.DetailStoreActivity
import com.sangmin.pizzastore_20220710.R
import com.sangmin.pizzastore_20220710.StoreData
import com.sangmin.pizzastore_20220710.adapters.StoreListAdapter
import kotlinx.android.synthetic.main.fragment_pizaa.*

class PizzaFragment: Fragment() {

    lateinit var  mStoreListAdapter: StoreListAdapter
    val mList = ArrayList<StoreData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizaa, container,false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        mList.add(StoreData("피자헛",4.2, "1588-5588"))
        mList.add(StoreData("파파존스",4.5, "1577-8080"))
        mList.add(StoreData("미스터피자",3.8, "1577-0077"))
        mList.add(StoreData("도미노피자",4.0, "1577-3082"))

        mStoreListAdapter = StoreListAdapter(requireContext(), R.layout.store_list_item, mList)
        pizzaStoreListView.adapter = mStoreListAdapter


        pizzaStoreListView.setOnItemClickListener { adapterView, view, i, l ->
            val myIntent = Intent(requireContext(), DetailStoreActivity::class.java)
            myIntent.putExtra("storeData",mList[i])
            startActivity(myIntent)


        }


    }
}