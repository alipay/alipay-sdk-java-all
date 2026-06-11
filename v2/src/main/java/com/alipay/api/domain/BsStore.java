package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动门店对象
 *
 * @author auto create
 * @since 1.0, 2026-06-08 15:18:38
 */
public class BsStore extends AlipayObject {

	private static final long serialVersionUID = 6338388218474327612L;

	/**
	 * 门店所在详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店位置所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 门店所在区县信息
	 */
	@ApiField("district")
	private String district;

	/**
	 * 当处理结果为失败FAIL时，该字段标识处理失败的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 门店位置所在纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店位置所在经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * PROCESSING(处理中) / SUCCESS(处理成功，若果门店已经挂靠成功需要幂等返回成功) / FAIL(处理失败)
	 */
	@ApiField("process_status")
	private String processStatus;

	/**
	 * 门店位置所在省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 数字化门店加密ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 数字化门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
