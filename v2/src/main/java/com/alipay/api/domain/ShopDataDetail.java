package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息批量查询详细
 *
 * @author auto create
 * @since 1.0, 2023-07-17 19:34:26
 */
public class ShopDataDetail extends AlipayObject {

	private static final long serialVersionUID = 7879984346551546579L;

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

	public ShopScoreResultInfo getShopScoreResult() {
		return this.shopScoreResult;
	}
	public void setShopScoreResult(ShopScoreResultInfo shopScoreResult) {
		this.shopScoreResult = shopScoreResult;
	}

}
