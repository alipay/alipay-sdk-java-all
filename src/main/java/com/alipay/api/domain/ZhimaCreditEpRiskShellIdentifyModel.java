package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用空壳企业查询
 *
 * @author auto create
 * @since 1.0, 2022-01-20 17:25:27
 */
public class ZhimaCreditEpRiskShellIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 7871892949881242746L;

	/**
	 * 企业统一社会信用代码或者注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

}
