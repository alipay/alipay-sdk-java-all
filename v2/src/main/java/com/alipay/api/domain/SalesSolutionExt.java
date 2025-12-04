package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进方案扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-09-05 14:51:47
 */
public class SalesSolutionExt extends AlipayObject {

	private static final long serialVersionUID = 6111729225919357997L;

	/**
	 * 批量签约的数量（该字段只在先卖进后绑定模式下使用）
	 */
	@ApiField("batch_sign_count")
	private Long batchSignCount;

	/**
	 * 必须是数字格式，单位元，在使用全额付动态价格方案做卖进时，根据该字段传入该次卖进的价格。
	 */
	@ApiField("price")
	private String price;

	public Long getBatchSignCount() {
		return this.batchSignCount;
	}
	public void setBatchSignCount(Long batchSignCount) {
		this.batchSignCount = batchSignCount;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
