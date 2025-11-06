package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户兑换资格查询
 *
 * @author auto create
 * @since 1.0, 2025-07-10 13:57:47
 */
public class AlipayCommerceMedicalCardExchangeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4418994221769544925L;

	/**
	 * 会员卡流水ID
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 16位字符串，无分隔符
	 */
	@ApiField("member_code")
	private String memberCode;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getMemberCode() {
		return this.memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
