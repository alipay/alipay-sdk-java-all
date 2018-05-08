package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租客查询支付宝授权状态
 *
 * @author auto create
 * @since 1.0, 2018-03-27 15:37:07
 */
public class AlipayEcoRenthouseRenterIdinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8689645424126696584L;

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
