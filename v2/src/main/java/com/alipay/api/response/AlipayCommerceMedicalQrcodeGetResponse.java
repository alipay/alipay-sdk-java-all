package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.qrcode.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-21 10:41:52
 */
public class AlipayCommerceMedicalQrcodeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7524955875131234332L;

	/** 
	 * 就诊人默认参保地映射后的地市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 就诊人默认参保地映射后的城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/** 
	 * 就诊人默认参保地编码
	 */
	@ApiField("ins_city_code")
	private String insCityCode;

	/** 
	 * 就诊人默认参保地名称
	 */
	@ApiField("ins_city_name")
	private String insCityName;

	/** 
	 * 就诊人医保码值
	 */
	@ApiField("qrcode")
	private String qrcode;

	/** 
	 * 就诊人医保码值的关系类型
	 */
	@ApiField("relation_type")
	private String relationType;

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityName( ) {
		return this.cityName;
	}

	public void setInsCityCode(String insCityCode) {
		this.insCityCode = insCityCode;
	}
	public String getInsCityCode( ) {
		return this.insCityCode;
	}

	public void setInsCityName(String insCityName) {
		this.insCityName = insCityName;
	}
	public String getInsCityName( ) {
		return this.insCityName;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public String getQrcode( ) {
		return this.qrcode;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}
	public String getRelationType( ) {
		return this.relationType;
	}

}
