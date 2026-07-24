package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构查询快递可预约时间
 *
 * @author auto create
 * @since 1.0, 2026-06-04 15:37:54
 */
public class XingheLendassistCarfinExpressappointmentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4821529955832381621L;

	/**
	 * 地区国标码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 城市国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 抵押单号
	 */
	@ApiField("mortgage_no")
	private String mortgageNo;

	/**
	 * 省份国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getMortgageNo() {
		return this.mortgageNo;
	}
	public void setMortgageNo(String mortgageNo) {
		this.mortgageNo = mortgageNo;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
