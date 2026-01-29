package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店数据_单店数据查询
 *
 * @author auto create
 * @since 1.0, 2024-04-12 17:39:04
 */
public class AlipayDataAntsycmShopdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1723739741592676969L;

	/**
	 * 收款账号
	 */
	@ApiField("account_pid")
	private String accountPid;

	/**
	 * 蚂蚁POI，有则传，用于精准匹配
	 */
	@ApiField("ant_poi")
	private String antPoi;

	/**
	 * 商户授权码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区
	 */
	@ApiField("county_name")
	private String countyName;

	/**
	 * 高德poi，有则传，用于精准匹配
	 */
	@ApiField("gaode_poi")
	private String gaodePoi;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 省
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 获取分数类型
	 */
	@ApiListField("score_type")
	@ApiField("string")
	private List<String> scoreType;

	/**
	 * 门店地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public String getAccountPid() {
		return this.accountPid;
	}
	public void setAccountPid(String accountPid) {
		this.accountPid = accountPid;
	}

	public String getAntPoi() {
		return this.antPoi;
	}
	public void setAntPoi(String antPoi) {
		this.antPoi = antPoi;
	}

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountyName() {
		return this.countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getGaodePoi() {
		return this.gaodePoi;
	}
	public void setGaodePoi(String gaodePoi) {
		this.gaodePoi = gaodePoi;
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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public List<String> getScoreType() {
		return this.scoreType;
	}
	public void setScoreType(List<String> scoreType) {
		this.scoreType = scoreType;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
