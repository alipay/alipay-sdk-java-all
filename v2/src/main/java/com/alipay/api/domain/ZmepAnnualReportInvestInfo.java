package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业工商年报对外投资信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:26
 */
public class ZmepAnnualReportInvestInfo extends AlipayObject {

	private static final long serialVersionUID = 2523229242449917939L;

	/**
	 * 注册号/统一社会信用代码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 投资设立企业或购买股权企业名称
	 */
	@ApiField("invest_ep_name")
	private String investEpName;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getInvestEpName() {
		return this.investEpName;
	}
	public void setInvestEpName(String investEpName) {
		this.investEpName = investEpName;
	}

}
