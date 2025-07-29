package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺评分明细
 *
 * @author auto create
 * @since 1.0, 2024-08-12 15:01:25
 */
public class ShopRatingInfo extends AlipayObject {

	private static final long serialVersionUID = 2885437935625327478L;

	/**
	 * 物流评分（5分制，单位：分）
	 */
	@ApiField("delivery_score")
	private String deliveryScore;

	/**
	 * 商品描述评分（5分制，单位：分）
	 */
	@ApiField("itemdesc_score")
	private String itemdescScore;

	/**
	 * 服务评分（5分制，单位：分）
	 */
	@ApiField("service_score")
	private String serviceScore;

	public String getDeliveryScore() {
		return this.deliveryScore;
	}
	public void setDeliveryScore(String deliveryScore) {
		this.deliveryScore = deliveryScore;
	}

	public String getItemdescScore() {
		return this.itemdescScore;
	}
	public void setItemdescScore(String itemdescScore) {
		this.itemdescScore = itemdescScore;
	}

	public String getServiceScore() {
		return this.serviceScore;
	}
	public void setServiceScore(String serviceScore) {
		this.serviceScore = serviceScore;
	}

}
