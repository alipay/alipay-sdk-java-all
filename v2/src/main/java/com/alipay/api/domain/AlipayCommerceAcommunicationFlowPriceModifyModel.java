package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量商品价格变更
 *
 * @author auto create
 * @since 1.0, 2024-02-06 11:08:38
 */
public class AlipayCommerceAcommunicationFlowPriceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1818965728842558887L;

	/**
	 * 支付宝与机构之间的商品id映射码，需要包含关键信息：省份-运营商-面额
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品变更的价格，单位：元
	 */
	@ApiField("price")
	private String price;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
