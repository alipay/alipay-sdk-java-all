package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 持卡人信息
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:05:05
 */
public class CardUserInfo extends AlipayObject {

	private static final long serialVersionUID = 1754892441133531864L;

	/**
	 * 用户唯一标识, 根据user_id_type类型来定 （目前暂支持支付宝userId）

支付宝userId说明：支付宝用户号是以2088开头的16位纯数字组成
	 */
	@ApiField("user_uni_id")
	private String userUniId;

	/**
	 * ID类型：UID， 即传值UID即可
	 */
	@ApiField("user_uni_id_type")
	private String userUniIdType;

	public String getUserUniId() {
		return this.userUniId;
	}
	public void setUserUniId(String userUniId) {
		this.userUniId = userUniId;
	}

	public String getUserUniIdType() {
		return this.userUniIdType;
	}
	public void setUserUniIdType(String userUniIdType) {
		this.userUniIdType = userUniIdType;
	}

}
