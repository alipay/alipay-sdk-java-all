package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 美味店铺信息对象
 *
 * @author auto create
 * @since 1.0, 2022-08-15 14:29:53
 */
public class HbMeiWeishopInfo extends AlipayObject {

	private static final long serialVersionUID = 6377445652111299966L;

	/**
	 * 所在城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 所在城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 门店logo地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 平均金额,单位为分
	 */
	@ApiField("pirce_per_avg_shop")
	private Long pircePerAvgShop;

	/**
	 * 商圈信息
	 */
	@ApiField("poi_name")
	private String poiName;

	/**
	 * 所在省份code
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 商家经纬度地址
	 */
	@ApiField("shop_gis")
	private String shopGis;

	/**
	 * 商家ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商家名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商家星级
	 */
	@ApiField("star_rate_shop")
	private String starRateShop;

	/**
	 * 1代表有效，0代表无效
	 */
	@ApiField("status")
	private String status;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Long getPircePerAvgShop() {
		return this.pircePerAvgShop;
	}
	public void setPircePerAvgShop(Long pircePerAvgShop) {
		this.pircePerAvgShop = pircePerAvgShop;
	}

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getShopGis() {
		return this.shopGis;
	}
	public void setShopGis(String shopGis) {
		this.shopGis = shopGis;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getStarRateShop() {
		return this.starRateShop;
	}
	public void setStarRateShop(String starRateShop) {
		this.starRateShop = starRateShop;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
