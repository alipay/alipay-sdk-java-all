package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 购物车活动对象
 *
 * @author auto create
 * @since 1.0, 2025-06-27 14:17:14
 */
public class CartActivityBean extends AlipayObject {

	private static final long serialVersionUID = 6571969987982596188L;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 优惠限购数量
	 */
	@ApiField("limit_cnt")
	private Long limitCnt;

	/**
	 * 商品原价【人民币】
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 原价SkuId
	 */
	@ApiField("original_sku_id")
	private String originalSkuId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Long getLimitCnt() {
		return this.limitCnt;
	}
	public void setLimitCnt(Long limitCnt) {
		this.limitCnt = limitCnt;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOriginalSkuId() {
		return this.originalSkuId;
	}
	public void setOriginalSkuId(String originalSkuId) {
		this.originalSkuId = originalSkuId;
	}

}
