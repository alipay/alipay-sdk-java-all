package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁物列表，主要包含租赁资产设备信息，租金信息
 *
 * @author auto create
 * @since 1.0, 2023-06-28 19:29:34
 */
public class Leaseholds extends AlipayObject {

	private static final long serialVersionUID = 4645978135781752415L;

	/**
	 * 日租单价，按元/台/天填写
	 */
	@ApiField("daily_rent_price")
	private String dailyRentPrice;

	/**
	 * 设备型号，根据租赁设备型号填写
	 */
	@ApiField("device_model_no")
	private String deviceModelNo;

	/**
	 * 预计租赁数量
	 */
	@ApiField("expected_lease_quantity")
	private String expectedLeaseQuantity;

	/**
	 * 租赁资产ID，框架租赁合同可不填，若有多个则以数组形式上传
	 */
	@ApiListField("lease_asset_ids")
	@ApiField("string")
	private List<String> leaseAssetIds;

	/**
	 * 月租单价，按元/台/月填写
	 */
	@ApiField("month_rent_price")
	private String monthRentPrice;

	public String getDailyRentPrice() {
		return this.dailyRentPrice;
	}
	public void setDailyRentPrice(String dailyRentPrice) {
		this.dailyRentPrice = dailyRentPrice;
	}

	public String getDeviceModelNo() {
		return this.deviceModelNo;
	}
	public void setDeviceModelNo(String deviceModelNo) {
		this.deviceModelNo = deviceModelNo;
	}

	public String getExpectedLeaseQuantity() {
		return this.expectedLeaseQuantity;
	}
	public void setExpectedLeaseQuantity(String expectedLeaseQuantity) {
		this.expectedLeaseQuantity = expectedLeaseQuantity;
	}

	public List<String> getLeaseAssetIds() {
		return this.leaseAssetIds;
	}
	public void setLeaseAssetIds(List<String> leaseAssetIds) {
		this.leaseAssetIds = leaseAssetIds;
	}

	public String getMonthRentPrice() {
		return this.monthRentPrice;
	}
	public void setMonthRentPrice(String monthRentPrice) {
		this.monthRentPrice = monthRentPrice;
	}

}
