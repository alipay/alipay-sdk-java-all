package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-27 10:42:50
 */
public class AssistantCompanySimpleInfo extends AlipayObject {

	private static final long serialVersionUID = 5313455492691487159L;

	/**
	 * 企业的完整名称，后续会根据名称获取企业信息，会优先使用统一社会信用代码，若无统一社会信用代码，则使用名称。若名称也无法匹配，则不会对当前在进行处理。
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 企业的统一社会信用代码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

}
