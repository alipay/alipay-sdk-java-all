package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品销售信息详情
 *
 * @author auto create
 * @since 1.0, 2025-04-02 15:27:56
 */
public class SellsInfo extends AlipayObject {

	private static final long serialVersionUID = 5472779625841675876L;

	/**
	 * 商品客户自填销量
	 */
	@ApiField("customer_sells")
	private Long customerSells;

	/**
	 * 商品展示销量
	 */
	@ApiField("display_sells")
	private Long displaySells;

	/**
	 * 商品真实销量
	 */
	@ApiField("real_sells")
	private Long realSells;

	public Long getCustomerSells() {
		return this.customerSells;
	}
	public void setCustomerSells(Long customerSells) {
		this.customerSells = customerSells;
	}

	public Long getDisplaySells() {
		return this.displaySells;
	}
	public void setDisplaySells(Long displaySells) {
		this.displaySells = displaySells;
	}

	public Long getRealSells() {
		return this.realSells;
	}
	public void setRealSells(Long realSells) {
		this.realSells = realSells;
	}

}
