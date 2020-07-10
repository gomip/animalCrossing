package org.androidtown.animalcrossing.Realm

import io.realm.RealmObject
import java.util.*

/**
 * 20200705 | gomip | [Realm] : 공통 그룹 코드 모델 생성
 */
open class ComGrpCd (
    var com_grp_id          : String  = "",         // 공통 그룹 코드 아이디
    var com_grp_cd          : String  = "",         // 공통 그룹 코드
    var com_grp_cd_name     : String  = "",         // 공통 그룹 코드 명
    var expl                : String? = null,       // 설명
    var use_yn              : String  = "Y",        // 사용여부
    var create_user_name    : String? = null,       // 생성자 명
    var create_dt           : Date?   = null,       // 생성 일자
    var update_user_name    : String? = null,       // 수정자 명
    var update_dt           : Date?   = null        // 수정 일자
) : RealmObject(){

}