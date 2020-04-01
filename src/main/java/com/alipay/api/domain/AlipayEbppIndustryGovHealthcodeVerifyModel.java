package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康码验码接口
 *
 * @author auto create
 * @since 1.0, 2020-03-11 16:34:26
 */
public class AlipayEbppIndustryGovHealthcodeVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3171978795857398351L;

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

}
