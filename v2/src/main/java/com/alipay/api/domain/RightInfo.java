package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务权益项列表
 *
 * @author auto create
 * @since 1.0, 2026-08-19 16:35:24
 */
public class RightInfo extends AlipayObject {

	private static final long serialVersionUID = 8633871321667193152L;

	/**
	 * 履约类型
	 */
	@ApiField("fulfillment_type")
	private String fulfillmentType;

	/**
	 * 权益剩余次数
	 */
	@ApiField("remaining_times")
	private String remainingTimes;

	/**
	 * 权益副标题
	 */
	@ApiField("right_subtitle")
	private String rightSubtitle;

	/**
	 * 权益标题
	 */
	@ApiField("right_title")
	private String rightTitle;

	/**
	 * SKU编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * 权益总数
	 */
	@ApiField("total_times")
	private String totalTimes;

	public String getFulfillmentType() {
		return this.fulfillmentType;
	}
	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	public String getRemainingTimes() {
		return this.remainingTimes;
	}
	public void setRemainingTimes(String remainingTimes) {
		this.remainingTimes = remainingTimes;
	}

	public String getRightSubtitle() {
		return this.rightSubtitle;
	}
	public void setRightSubtitle(String rightSubtitle) {
		this.rightSubtitle = rightSubtitle;
	}

	public String getRightTitle() {
		return this.rightTitle;
	}
	public void setRightTitle(String rightTitle) {
		this.rightTitle = rightTitle;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getTotalTimes() {
		return this.totalTimes;
	}
	public void setTotalTimes(String totalTimes) {
		this.totalTimes = totalTimes;
	}

}
