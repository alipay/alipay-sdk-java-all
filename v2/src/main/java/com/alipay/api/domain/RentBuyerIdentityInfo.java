package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份信息，用于订单签约时身份校验
 *
 * @author auto create
 * @since 1.0, 2026-06-01 00:08:13
 */
public class RentBuyerIdentityInfo extends AlipayObject {

	private static final long serialVersionUID = 2874234948784436463L;

	/**
	 * 买家姓名信息
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 买家身份证号
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 买家手机号
	 */
	@ApiField("tel_number")
	private String telNumber;

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getTelNumber() {
		return this.telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

}
