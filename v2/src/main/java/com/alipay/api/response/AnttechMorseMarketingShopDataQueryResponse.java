package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ShopScoreResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.shop.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 15:19:12
 */
public class AnttechMorseMarketingShopDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8528973592328692989L;

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
	 * 客户poi，如：高德poi
	 */
	@ApiField("poi_id")
	private String poiId;

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
	private ShopScoreResultInfo shopScoreResult;

	/** 
	 * 任务状态
	 */
	@ApiField("task_status")
	private String taskStatus;

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

	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}
	public String getPoiId( ) {
		return this.poiId;
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

	public void setShopScoreResult(ShopScoreResultInfo shopScoreResult) {
		this.shopScoreResult = shopScoreResult;
	}
	public ShopScoreResultInfo getShopScoreResult( ) {
		return this.shopScoreResult;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

}
