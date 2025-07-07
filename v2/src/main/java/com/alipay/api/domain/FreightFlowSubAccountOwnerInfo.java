package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运企付开户时子户归属人信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:15:54
 */
public class FreightFlowSubAccountOwnerInfo extends AlipayObject {

	private static final long serialVersionUID = 5629169549746545192L;

	/**
	 * 证件号码
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 证件类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 归属人名称
	 */
	@ApiField("name")
	private String name;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
