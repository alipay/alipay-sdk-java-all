package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Product;
import com.alipay.api.domain.Sale;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.fuelling.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoMycarFuellingShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4766987856533372921L;

	/** 
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 国标6位城市编号
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 国标6位区编号
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 纬度，高德坐标系，最好找到高德POI标识，取得标识的维度填入
	 */
	@ApiField("lat")
	private String lat;

	/** 
	 * 经度，高德坐标系,最好找到高德POI标识，取得标识的经度填入
	 */
	@ApiField("lon")
	private String lon;

	/** 
	 * 外部门店编号
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/** 
	 * ISV提供的门店支付链接地址，如果支付链接地址为空，默认使用用户的当面付链接地址。注意：链接地址必须使用https://或alipays://协议。
	 */
	@ApiField("pay_url")
	private String payUrl;

	/** 
	 * 高德POI信息唯一ID
	 */
	@ApiField("poi_id")
	private String poiId;

	/** 
	 * 商品信息集合，JSON格式
	 */
	@ApiListField("product")
	@ApiField("product")
	private List<Product> product;

	/** 
	 * 国标6位省份编号
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 促销信息集合，JSON格式
	 */
	@ApiListField("sale")
	@ApiField("sale")
	private List<Sale> sale;

	/** 
	 * 车主平台内部门店编号
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 门店状态，0：有效；1：停用；
	 */
	@ApiField("shop_status")
	private String shopStatus;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLat( ) {
		return this.lat;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getLon( ) {
		return this.lon;
	}

	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}
	public String getOutShopId( ) {
		return this.outShopId;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}
	public String getPoiId( ) {
		return this.poiId;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public List<Product> getProduct( ) {
		return this.product;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setSale(List<Sale> sale) {
		this.sale = sale;
	}
	public List<Sale> getSale( ) {
		return this.sale;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getShopStatus( ) {
		return this.shopStatus;
	}

}
