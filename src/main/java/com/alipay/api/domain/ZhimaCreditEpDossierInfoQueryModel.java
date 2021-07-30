package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用企业档案工商基础信息查询
 *
 * @author auto create
 * @since 1.0, 2021-05-27 21:35:08
 */
public class ZhimaCreditEpDossierInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8289233328865973791L;

	/**
	 * 企业社会统一信用代码或营业执照注册号
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
