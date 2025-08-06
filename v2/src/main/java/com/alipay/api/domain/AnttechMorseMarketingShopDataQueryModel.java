package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店数据-单店数据查询
 *
 * @author auto create
 * @since 1.0, 2023-08-03 15:19:12
 */
public class AnttechMorseMarketingShopDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3542743314819577773L;

	/**
	 * 收款账号
	 */
	@ApiField("account_pid")
	private String accountPid;

	/**
	 * 商户授权码
	 */
	@ApiField("bussiness_code")
	private String bussinessCode;

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
	 * 高德poi或蚂蚁poi等，有则传，用于精准匹配，可扩展其他poi
	 */
	@ApiField("poi_id")
	private String poiId;

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
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getAccountPid() {
		return this.accountPid;
	}
	public void setAccountPid(String accountPid) {
		this.accountPid = accountPid;
	}

	public String getBussinessCode() {
		return this.bussinessCode;
	}
	public void setBussinessCode(String bussinessCode) {
		this.bussinessCode = bussinessCode;
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

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
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
