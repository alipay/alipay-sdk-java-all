package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格信息，包含价格类型、金额
 *
 * @author auto create
 * @since 1.0, 2019-09-30 17:51:33
 */
public class PriceInformation extends AlipayObject {

	private static final long serialVersionUID = 5135974914577438853L;

	/**
	 * 对应资产的金额，比如88.66等。如果是现金，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 现金MONEY、家庭分FAMILY_POINT、会员分ANT_POINT等
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
