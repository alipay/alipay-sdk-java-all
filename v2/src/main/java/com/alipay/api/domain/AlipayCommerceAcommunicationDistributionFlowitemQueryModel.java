package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量分销商品查询
 *
 * @author auto create
 * @since 1.0, 2024-07-11 14:17:28
 */
public class AlipayCommerceAcommunicationDistributionFlowitemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7298131797663798324L;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
