package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗大健康用户兑换资格取消接口
 *
 * @author auto create
 * @since 1.0, 2025-09-29 17:00:06
 */
public class AlipayCommerceMedicalCommercialMemberCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3611316361483826431L;

	/**
	 * 会员的会员卡号，字符串类型
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 13位手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
