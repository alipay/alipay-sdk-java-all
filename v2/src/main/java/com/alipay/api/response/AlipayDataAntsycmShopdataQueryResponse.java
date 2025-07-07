package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ShopScoreResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.antsycm.shopdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 16:12:55
 */
public class AlipayDataAntsycmShopdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2721951546443233482L;

	/** 
	 * 蚂蚁poi
	 */
	@ApiField("ant_poi")
	private String antPoi;

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
	 * 高德poi
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
	 * 省
	 */
	@ApiField("province_name")
	private String provinceName;

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
	 * 门店得分结果
	 */
	@ApiField("shop_score_result")
	private ShopScoreResultInfoDTO shopScoreResult;

	/** 
	 * 任务状态
	 */
	@ApiField("task_status")
	private String taskStatus;

	public void setAntPoi(String antPoi) {
		this.antPoi = antPoi;
	}
	public String getAntPoi( ) {
		return this.antPoi;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityName( ) {
		return this.cityName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public String getCountyName( ) {
		return this.countyName;
	}

	public void setGaodePoi(String gaodePoi) {
		this.gaodePoi = gaodePoi;
	}
	public String getGaodePoi( ) {
		return this.gaodePoi;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceName( ) {
		return this.provinceName;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopAddress( ) {
		return this.shopAddress;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setShopScoreResult(ShopScoreResultInfoDTO shopScoreResult) {
		this.shopScoreResult = shopScoreResult;
	}
	public ShopScoreResultInfoDTO getShopScoreResult( ) {
		return this.shopScoreResult;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

}
