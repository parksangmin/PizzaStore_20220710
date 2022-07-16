package com.sangmin.pizzastore_20220710.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

// viewPager에 의해 피자 프레그먼트가 사라때, mList도 같이 클리어 해준다
// mList.clear()

        mList.add(StoreData("피자헛",4.2, "1588-5588",
             "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))
        mList.add(StoreData("파파존스",4.5, "1577-8080",
            "http://mblogthumb-phinf.pstatic.net/20160530_116/ppanppane_14646177654870uGy9_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%281%29.png?type=w800"))
        mList.add(StoreData("미스터피자",3.8, "1577-0077",
            "https://mblogthumb-phinf.pstatic.net/20160530_62/ppanppane_14646177047843NP3E_PNG/%B9%CC%BD%BA%C5%CD%C7%C7%C0%DA_%B7%CE%B0%ED_%283%29.png?type=w800"))
        mList.add(StoreData("도미노피자",4.0, "1577-3082",
            "https://www.pngplay.com/wp-content/uploads/6/Dominos-Pizza-Logo-Background-PNG-Image.png"))

        mStoreListAdapter = StoreListAdapter(requireContext(), R.layout.store_list_item, mList)
        pizzaStoreListView.adapter = mStoreListAdapter


        pizzaStoreListView.setOnItemClickListener { adapterView, view, i, l ->
//            인테트로 현재 액티비티에서 DetailStoreActivity로 이동하는 코드
            val myIntent = Intent(requireContext(), DetailStoreActivity::class.java)
            myIntent.putExtra("storeData",mList[i])
            startActivity(myIntent)


        }


    }
}