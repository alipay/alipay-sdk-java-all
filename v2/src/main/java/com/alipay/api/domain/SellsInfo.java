package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品销售信息详情
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:58:46
 */
public class SellsInfo extends AlipayObject {

	private static final long serialVersionUID = 1243441282985731847L;

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

	/**
	 * 虚拟销量范围，模糊提供的销量信息，单位件。
	 */
	@ApiField("virtual_sells_range")
	private String virtualSellsRange;

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

	public String getVirtualSellsRange() {
		return this.virtualSellsRange;
	}
	public void setVirtualSellsRange(String virtualSellsRange) {
		this.virtualSellsRange = virtualSellsRange;
	}

}
