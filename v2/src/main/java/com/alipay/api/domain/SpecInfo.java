package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车车型信息
 *
 * @author auto create
 * @since 1.0, 2024-12-04 10:56:53
 */
public class SpecInfo extends AlipayObject {

	private static final long serialVersionUID = 4618698642848252126L;

	/**
	 * 车型ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 最高价格
	 */
	@ApiField("max_price")
	private String maxPrice;

	/**
	 * 最低价元
	 */
	@ApiField("min_price")
	private String minPrice;

	/**
	 * 车型名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 车系动力信息
	 */
	@ApiField("power_info")
	private String powerInfo;

	/**
	 * 车型价格
	 */
	@ApiField("price")
	private String price;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPowerInfo() {
		return this.powerInfo;
	}
	public void setPowerInfo(String powerInfo) {
		this.powerInfo = powerInfo;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
