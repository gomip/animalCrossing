package org.androidtown.animalcrossing.Realm

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

/**
 * 20200614 | gomip | [Realm] : 사용자 정보 모델 생성
 * 20200712 | gomip | [Realm] : 사용자 아이디 생성
 */
open class UserAccount(
    var slave_id    : String = "",      // 대표 주민 아이디
    var slave_name  : String = "",      // 대표 주민 이름
    var island_name : String = "",      // 섬 이름
    var create_dt   : Date?  = null     // 생성 일자
) : RealmObject(){

}