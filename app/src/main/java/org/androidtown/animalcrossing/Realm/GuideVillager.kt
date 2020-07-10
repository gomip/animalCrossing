package org.androidtown.animalcrossing.Realm

import io.realm.RealmObject
import java.util.*

/**
 * 20200705 | gomip | [Realm] : 주민 모델 생성
 */
open class GuideVillager (
    var villager_id       : String  = "",       // 주민 아이디
    var vilager_name      : String  = "",       // 주민 명
    var gender_cd         : String  = "",       // 성 구분 코드
    var personality_cd    : String  = "",       // 성격 코드
    var species_cd        : String  = "",       // 동물 종류
    var bday              : String  = "",       // 생일
    var village_yn        : String  = "N",      // 주민 여부
    var fav_yn            : String  = "N",      // 선호 주민 구분
    var create_user_name  : String? = null,     // 생성자 명
    var create_dt         : Date?   = null,     // 생성 일자
    var update_user_name  : String? = null,     // 수정자 명
    var update_dt         : Date?   = null      // 수정 일자
) : RealmObject(){

}