package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息模型
 *
 * @author auto create
 * @since 1.0, 2023-04-09 17:34:46
 */
public class DeliveryItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1739887349244591144L;

	/**
	 * 商家侧item id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家侧sku id
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}
