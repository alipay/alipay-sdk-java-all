package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗大健康用户兑换资格取消接口
 *
 * @author auto create
 * @since 1.0, 2025-08-19 15:21:11
 */
public class AlipayCommerceMedicalCommercialMemberCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7596166172439382956L;

	/**
	 * 会员的会员卡号，字符串类型
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 13位手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
