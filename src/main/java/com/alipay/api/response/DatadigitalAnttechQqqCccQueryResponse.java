package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.qqq.ccc.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-25 10:31:51
 */
public class DatadigitalAnttechQqqCccQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3732284221377539932L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 市
	 */
	@ApiListField("city_code_open_id")
	@ApiField("string")
	private List<String> cityCodeOpenId;

	/** 
	 * dgf
	 */
	@ApiField("city_cppp_open_id")
	private String cityCpppOpenId;

	/** 
	 * 省份
	 */
	@ApiField("province_code_open_id")
	private String provinceCodeOpenId;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCityCodeOpenId(List<String> cityCodeOpenId) {
		this.cityCodeOpenId = cityCodeOpenId;
	}
	public List<String> getCityCodeOpenId( ) {
		return this.cityCodeOpenId;
	}

	public void setCityCpppOpenId(String cityCpppOpenId) {
		this.cityCpppOpenId = cityCpppOpenId;
	}
	public String getCityCpppOpenId( ) {
		return this.cityCpppOpenId;
	}

	public void setProvinceCodeOpenId(String provinceCodeOpenId) {
		this.provinceCodeOpenId = provinceCodeOpenId;
	}
	public String getProvinceCodeOpenId( ) {
		return this.provinceCodeOpenId;
	}

}
