package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租客查询支付宝授权状态
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:49:18
 */
public class AlipayEcoRenthouseRenterIdinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6358565361113658567L;

	/**
	 * 身份证号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
