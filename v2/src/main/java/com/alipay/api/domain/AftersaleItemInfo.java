package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品列表
 *
 * @author auto create
 * @since 1.0, 2024-07-22 10:21:35
 */
public class AftersaleItemInfo extends AlipayObject {

	private static final long serialVersionUID = 2643676454146874171L;

	/**
	 * 商品数量,单位:"个"
	 */
	@ApiField("item_cnt")
	private String itemCnt;

	/**
	 * 外部商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部skuid
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public String getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
	}

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
