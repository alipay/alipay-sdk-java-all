package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文章中提到的公司
 *
 * @author auto create
 * @since 1.0, 2021-12-22 17:28:08
 */
public class NewsRelatedCompany extends AlipayObject {

	private static final long serialVersionUID = 8363897818141772959L;

	/**
	 * 公司统一社会编号
	 */
	@ApiField("org_cert_no")
	private String orgCertNo;

	/**
	 * 公司名称
	 */
	@ApiField("org_name")
	private String orgName;

	public String getOrgCertNo() {
		return this.orgCertNo;
	}
	public void setOrgCertNo(String orgCertNo) {
		this.orgCertNo = orgCertNo;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

}
