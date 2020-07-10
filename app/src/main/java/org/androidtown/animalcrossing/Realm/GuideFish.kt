package org.androidtown.animalcrossing.Realm

import io.realm.RealmObject
import java.util.*

/**
 * 20200705 | gomip | [Realm] : 물고기 모델 생성
 */
open class GuideFish (
    var fish_id           : String  = "",        // 물고기 아이디
    var fish_name         : String  = "",        // 물고기 명
    var appear_place      : String  = "",        // 출현 장소
    var appear_time       : String  = "",        // 출현 시간
    var appear_month      : String  = "",        // 출현 월
    var appear_month_list : String  = "",        // 출현 월 리스트
    var price             : Int     = 0,         // 판매 가격
    var size              : Int     = 0,         // 그림자 크기
    var capture_yn        : String  = "N",       // 포획 여부
    var create_user_name  : String? = null,      // 생성자 명
    var create_dt         : Date?   = null,      // 생성 일자
    var update_user_name  : String? = null,      // 수정자 명
    var update_dt         : Date?   = null       // 수정 일자
) : RealmObject(){

}