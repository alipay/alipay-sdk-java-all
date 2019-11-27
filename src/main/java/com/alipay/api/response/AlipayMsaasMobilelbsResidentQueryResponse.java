package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mobilelbs.resident.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMsaasMobilelbsResidentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7368347392457289615L;

	/** 
	 * 内容投放平台
	 */
	@ApiListField("appkey")
	@ApiField("string")
	private List<String> appkey;

	/** 
	 * 城市名称
	 */
	@ApiListField("city")
	@ApiField("string")
	private List<String> city;

	/** 
	 * 城市编码
	 */
	@ApiListField("citycode")
	@ApiField("string")
	private List<String> citycode;

	/** 
	 * 城市名称简写
	 */
	@ApiListField("citysimplename")
	@ApiField("string")
	private List<String> citysimplename;

	/** 
	 * 国名
	 */
	@ApiListField("country")
	@ApiField("string")
	private List<String> country;

	/** 
	 * 国家码
	 */
	@ApiListField("countrycode")
	@ApiField("string")
	private List<String> countrycode;

	/** 
	 * 区县
	 */
	@ApiListField("district")
	@ApiField("string")
	private List<String> district;

	/** 
	 * 区域编码
	 */
	@ApiListField("districtcode")
	@ApiField("string")
	private List<String> districtcode;

	/** 
	 * 区县名称简称
	 */
	@ApiListField("districtsimplename")
	@ApiField("string")
	private List<String> districtsimplename;

	/** 
	 * 纬度
	 */
	@ApiListField("latitude")
	@ApiField("string")
	private List<String> latitude;

	/** 
	 * 经度
	 */
	@ApiListField("longitude")
	@ApiField("string")
	private List<String> longitude;

	/** 
	 * 省，直辖市
	 */
	@ApiListField("province")
	@ApiField("string")
	private List<String> province;

	/** 
	 * 省，直辖市编码
	 */
	@ApiListField("provincecode")
	@ApiField("string")
	private List<String> provincecode;

	/** 
	 * 省，直辖市简写
	 */
	@ApiField("provincesimplename")
	private String provincesimplename;

	/** 
	 * 支付宝用户的唯一userId
	 */
	@ApiListField("user_id")
	@ApiField("string")
	private List<String> userId;

	public void setAppkey(List<String> appkey) {
		this.appkey = appkey;
	}
	public List<String> getAppkey( ) {
		return this.appkey;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}
	public List<String> getCity( ) {
		return this.city;
	}

	public void setCitycode(List<String> citycode) {
		this.citycode = citycode;
	}
	public List<String> getCitycode( ) {
		return this.citycode;
	}

	public void setCitysimplename(List<String> citysimplename) {
		this.citysimplename = citysimplename;
	}
	public List<String> getCitysimplename( ) {
		return this.citysimplename;
	}

	public void setCountry(List<String> country) {
		this.country = country;
	}
	public List<String> getCountry( ) {
		return this.country;
	}

	public void setCountrycode(List<String> countrycode) {
		this.countrycode = countrycode;
	}
	public List<String> getCountrycode( ) {
		return this.countrycode;
	}

	public void setDistrict(List<String> district) {
		this.district = district;
	}
	public List<String> getDistrict( ) {
		return this.district;
	}

	public void setDistrictcode(List<String> districtcode) {
		this.districtcode = districtcode;
	}
	public List<String> getDistrictcode( ) {
		return this.districtcode;
	}

	public void setDistrictsimplename(List<String> districtsimplename) {
		this.districtsimplename = districtsimplename;
	}
	public List<String> getDistrictsimplename( ) {
		return this.districtsimplename;
	}

	public void setLatitude(List<String> latitude) {
		this.latitude = latitude;
	}
	public List<String> getLatitude( ) {
		return this.latitude;
	}

	public void setLongitude(List<String> longitude) {
		this.longitude = longitude;
	}
	public List<String> getLongitude( ) {
		return this.longitude;
	}

	public void setProvince(List<String> province) {
		this.province = province;
	}
	public List<String> getProvince( ) {
		return this.province;
	}

	public void setProvincecode(List<String> provincecode) {
		this.provincecode = provincecode;
	}
	public List<String> getProvincecode( ) {
		return this.provincecode;
	}

	public void setProvincesimplename(String provincesimplename) {
		this.provincesimplename = provincesimplename;
	}
	public String getProvincesimplename( ) {
		return this.provincesimplename;
	}

	public void setUserId(List<String> userId) {
		this.userId = userId;
	}
	public List<String> getUserId( ) {
		return this.userId;
	}

}
