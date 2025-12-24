package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销参数对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:16
 */
public class MarketingParamBean extends AlipayObject {

	private static final long serialVersionUID = 6627711238631117797L;

	/**
	 * 商品优惠sku
	 */
	@ApiField("item_discount_sku_id")
	private String itemDiscountSkuId;

	/**
	 * 限购数量 ，单位：个/份
	 */
	@ApiField("limit_cnt")
	private Long limitCnt;

	/**
	 * 原始sku
	 */
	@ApiField("origin_sku_id")
	private String originSkuId;

	public String getItemDiscountSkuId() {
		return this.itemDiscountSkuId;
	}
	public void setItemDiscountSkuId(String itemDiscountSkuId) {
		this.itemDiscountSkuId = itemDiscountSkuId;
	}

	public Long getLimitCnt() {
		return this.limitCnt;
	}
	public void setLimitCnt(Long limitCnt) {
		this.limitCnt = limitCnt;
	}

	public String getOriginSkuId() {
		return this.originSkuId;
	}
	public void setOriginSkuId(String originSkuId) {
		this.originSkuId = originSkuId;
	}

}
