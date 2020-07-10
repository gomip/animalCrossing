package org.androidtown.animalcrossing.Realm

import io.realm.RealmObject
import java.util.*

/**
 * 20200614 | gomip | [Realm] : 사용자 정보 모델 생성
 */
open class UserAccount(
    val slave_name  : String = "",      // 대표 주민 이름
    val island_name : String = "",      // 섬 이름
    val create_dt   : Date?  = null     // 생성 일자
) : RealmObject(){

}