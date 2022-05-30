package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 其他金额的详细信息
 *
 * @author auto create
 * @since 1.0, 2018-09-03 17:15:56
 */
public class OtherAmountInfos extends AlipayObject {

	private static final long serialVersionUID = 1641949792592825937L;

	/**
	 * 费用金额
	 */
	@ApiField("price")
	private String price;

	/**
	 * 可枚举的类型。
SERVICE_FEE：服务费；
TABLE_FEE：餐台费；
OTHER：其他费用
	 */
	@ApiField("type")
	private String type;

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
