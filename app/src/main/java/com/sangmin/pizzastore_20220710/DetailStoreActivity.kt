package com.sangmin.pizzastore_20220710

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_store.*
import kotlinx.android.synthetic.main.activity_detail_store.phoneNumTxt
import kotlinx.android.synthetic.main.fragment_profile.*

class DetailStoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_store)



//      Intent의 첨부된 데이터 받아오는 코드
        val storeData = intent.getSerializableExtra("storeData") as StoreData


//        받아온 데이터를 참조해서 UI에 반영
        storenameTxt.text = storeData.name
        scoreTxt.text = storeData.score.toString()
        phoneNumTxt.text = storeData.phoneNum


//         주문하기 버튼을 눌렀을 때
        callBtn.setOnClickListener {
            val myUri = Uri.parse("tel:${phoneNumTxt.text}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }


//  전화 걸기(CALL) - 통화 버튼 눌러주기까지 진행, 바로 전화 연결
//        Call 기능의 경우, DIAL과는 다르게 개발자가 사용자의 재산을 사용하는 행위
//        사용자가 이 기능을 써도 된다고 허가를 해준 상태에서만 정상 동작
//        권한을 획득할 필요가 있다 => 차후에 라이브러리를 활용해서 진행
//        앱이 죽지만, 문법적으로는 틀린게 없는 상태태
//        그래서 굳이 이걸 잘 안쓴다(다이얼을 많이 쓴다)
    //       callBtn.setOnClickListener {
//            val myUri = Uri.parse("tel:${phoneNumTxt.text}")
//            val myIntent = Intent(Intent.ACTION_CALL, myUri)
//            startActivity(myIntent)
//        }

    }
}