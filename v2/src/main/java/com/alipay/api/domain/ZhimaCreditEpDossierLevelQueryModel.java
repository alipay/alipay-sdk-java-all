package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信用等级查询
 *
 * @author auto create
 * @since 1.0, 2023-03-20 20:54:14
 */
public class ZhimaCreditEpDossierLevelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3717648364545928466L;

	/**
	 * 企业证件号：：企业社会统一信用代码或营业执照注册号
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
