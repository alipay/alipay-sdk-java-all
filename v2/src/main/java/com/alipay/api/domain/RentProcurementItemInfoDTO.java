package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-01 15:22:57
 */
public class RentProcurementItemInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8383919161271294582L;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private String itemCnt;

	/**
	 * 商户侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户侧商品skuId
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
