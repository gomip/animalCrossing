package org.androidtown.animalcrossing.Realm

import io.realm.RealmObject
import java.util.*

/**
 * 20200705 | gomip | [Realm] : 화석 모델 생성
 */
open class GuideFossil(
    var fossil_id         : String  = "",       // 화석 아이디
    var fossil_name       : String  = "",       // 화석 명
    var compose           : Int     = 0,        // 구성 갯수
    var price             : Int     = 0,        // 판매 가격
    var capture_yn        : String  = "N",      // 포획 여부
    var create_user_name  : String? = null,     // 생성자 명
    var create_dt         : Date?   = null,     // 생성 일자
    var update_user_name  : String? = null,     // 수정자 명
    var update_dt         : Date?   = null      // 수정 일자
) : RealmObject(){

}