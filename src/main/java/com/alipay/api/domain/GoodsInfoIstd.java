package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品汇总信息
 *
 * @author auto create
 * @since 1.0, 2021-03-05 09:59:50
 */
public class GoodsInfoIstd extends AlipayObject {

	private static final long serialVersionUID = 2169424792593632691L;

	/**
	 * 交货信息，用于骑手交付商品
	 */
	@ApiField("delivery_info")
	private String deliveryInfo;

	/**
	 * 一级品类类目
	 */
	@ApiField("first_class")
	private String firstClass;

	/**
	 * 商品高度，单位为cm
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 商品长度，单位为cm
	 */
	@ApiField("length")
	private Long length;

	/**
	 * 取货信息，用于骑手到店取货
	 */
	@ApiField("pickup_info")
	private String pickupInfo;

	/**
	 * 总价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 二级品类类目
	 */
	@ApiField("second_class")
	private String secondClass;

	/**
	 * 货物重量，单位为kg，精确到小数点后两位
	 */
	@ApiField("weight")
	private String weight;

	/**
	 * 商品宽度，单位为cm
	 */
	@ApiField("width")
	private Long width;

	public String getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(String deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public String getFirstClass() {
		return this.firstClass;
	}
	public void setFirstClass(String firstClass) {
		this.firstClass = firstClass;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getLength() {
		return this.length;
	}
	public void setLength(Long length) {
		this.length = length;
	}

	public String getPickupInfo() {
		return this.pickupInfo;
	}
	public void setPickupInfo(String pickupInfo) {
		this.pickupInfo = pickupInfo;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSecondClass() {
		return this.secondClass;
	}
	public void setSecondClass(String secondClass) {
		this.secondClass = secondClass;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
