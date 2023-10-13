package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地点信息
 *
 * @author auto create
 * @since 1.0, 2022-11-17 20:03:46
 */
public class JourneyLocation extends AlipayObject {

	private static final long serialVersionUID = 5359625938943124845L;

	/**
	 * 支付宝域内aoiId
	 */
	@ApiField("aoi_id")
	private String aoiId;

	/**
	 * 城市名
	 */
	@ApiField("city")
	private String city;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 支付宝侧地点id
	 */
	@ApiField("location_id")
	private String locationId;

	/**
	 * 地点id类型
	 */
	@ApiField("location_id_type")
	private String locationIdType;

	/**
	 * 商户侧行政区划代码
	 */
	@ApiField("merchant_division_id")
	private String merchantDivisionId;

	/**
	 * (废弃)商户侧地点id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户侧poi信息
	 */
	@ApiField("merchant_poi")
	private String merchantPoi;

	/**
	 * 地点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支付宝域内poiId
	 */
	@ApiField("poi_id")
	private String poiId;

	public String getAoiId() {
		return this.aoiId;
	}
	public void setAoiId(String aoiId) {
		this.aoiId = aoiId;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getLocationId() {
		return this.locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationIdType() {
		return this.locationIdType;
	}
	public void setLocationIdType(String locationIdType) {
		this.locationIdType = locationIdType;
	}

	public String getMerchantDivisionId() {
		return this.merchantDivisionId;
	}
	public void setMerchantDivisionId(String merchantDivisionId) {
		this.merchantDivisionId = merchantDivisionId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantPoi() {
		return this.merchantPoi;
	}
	public void setMerchantPoi(String merchantPoi) {
		this.merchantPoi = merchantPoi;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

}
