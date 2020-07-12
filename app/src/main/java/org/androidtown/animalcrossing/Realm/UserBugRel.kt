package org.androidtown.animalcrossing.Realm

import io.realm.RealmObject
import java.util.*


/**
 * 20200712 | gomip | [Realm] : 사용자 - 곤충 관계 생성
 */
open class UserBugRel(
    var slave_id          : String  = "",       // 대표 주민 아이디
    var bug_id            : String  = "",       // 곤충 아이디
    var capture_yn        : String  = "N",      // 포획 여부
    var model_yn          : String  = "N",      // 모형 여부
    var create_user_name  : String? = null,     // 생성자 명
    var create_dt         : Date?   = null,     // 생성 일자
    var update_user_name  : String? = null,     // 수정자 명
    var update_dt         : Date?   = null      // 수정 일자
): RealmObject() {

}