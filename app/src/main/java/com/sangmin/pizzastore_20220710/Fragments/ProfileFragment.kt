package com.sangmin.pizzastore_20220710.Fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sangmin.pizzastore_20220710.ProfileActivity
import com.sangmin.pizzastore_20220710.R
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment: Fragment() {

//    숫자값으로 코드에 적으면, 이 숫자가 무슨? 어떤 데이터를 받으러 가는지 코드를 읽고 이해하기 어렵다
//    코드의 가독성을 올리기 위해 맴버변수로 바꾼다(변수명을 이해할 수 있게 작성)

    val REQ_FOR_NICKNAME = 1000
    val REQ_FOR_PHONENUM = 1001

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container,false)


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        changeNicBtn.setOnClickListener {
            val myIntent = Intent(requireContext(), ProfileActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)


        }

        changephonNumBtn.setOnClickListener {
            val myIntent = Intent(requireContext(), ProfileActivity::class.java)
            startActivityForResult(myIntent,REQ_FOR_PHONENUM)
        }
    }




//    복귀한 A화면 -> B화면에서 입력한 데이터를 받아서  UI 반영 등 코드 작성
//    requestCode : 어떤 데이터를 가져온건지 구별해주는 숫자(1)에서 작성한 숫자
//    resultCode : 확인버튼을 누른게 맞는가? Activity.Result_OK
//    data? : 결과로 세팅해준 resultintent를 담고 있는 변수
//    data?.get자료형Extra로 넣어둔 데이터를 추출
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQ_FOR_NICKNAME){
            if(resultCode == Activity.RESULT_OK) {
                val changedNick = data?.getStringExtra("nick")
                nicknameTxt.text = changedNick
            }

        }

    }


}