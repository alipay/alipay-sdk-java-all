package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康码验码接口
 *
 * @author auto create
 * @since 1.0, 2021-01-25 18:48:31
 */
public class AlipayEbppIndustryGovHealthcodeVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8213485293845738253L;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 扫描或查询到的健康码码值
	 */
	@ApiField("code_content")
	private String codeContent;

	/**
	 * 区分验码的业务主体，医护天使: MEDICAL_ANGEL; 默认为健康码: HEALTH_CODE
	 */
	@ApiField("industry_type")
	private String industryType;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCodeContent() {
		return this.codeContent;
	}
	public void setCodeContent(String codeContent) {
		this.codeContent = codeContent;
	}

	public String getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

}
