package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁信息
 *
 * @author auto create
 * @since 1.0, 2023-09-08 10:45:45
 */
public class LeaseIndustryBean extends AlipayObject {

	private static final long serialVersionUID = 6783946216211915968L;

	/**
	 * 商品可用的城市列表
	 */
	@ApiListField("available_city_list")
	@ApiField("string")
	private List<String> availableCityList;

	/**
	 * 非负数。保留两位小数。币种默认CNY。单位：元
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/**
	 * 租赁商品的新日描述
	 */
	@ApiField("fresh_degree")
	private String freshDegree;

	/**
	 * 商品最小租赁天数
	 */
	@ApiField("rental_date")
	private String rentalDate;

	/**
	 * 商品是否支持租满即送
	 */
	@ApiField("rental_free")
	private String rentalFree;

	/**
	 * 百分比，值范国0.00%-100.00%，保留两位小数
	 */
	@ApiField("shipment_rate")
	private String shipmentRate;

	/**
	 * 商品支持的发货城市列表
	 */
	@ApiField("shipments")
	private String shipments;

	public List<String> getAvailableCityList() {
		return this.availableCityList;
	}
	public void setAvailableCityList(List<String> availableCityList) {
		this.availableCityList = availableCityList;
	}

	public String getDepositAmount() {
		return this.depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getFreshDegree() {
		return this.freshDegree;
	}
	public void setFreshDegree(String freshDegree) {
		this.freshDegree = freshDegree;
	}

	public String getRentalDate() {
		return this.rentalDate;
	}
	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}

	public String getRentalFree() {
		return this.rentalFree;
	}
	public void setRentalFree(String rentalFree) {
		this.rentalFree = rentalFree;
	}

	public String getShipmentRate() {
		return this.shipmentRate;
	}
	public void setShipmentRate(String shipmentRate) {
		this.shipmentRate = shipmentRate;
	}

	public String getShipments() {
		return this.shipments;
	}
	public void setShipments(String shipments) {
		this.shipments = shipments;
	}

}
