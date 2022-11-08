package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业ESG信息查询
 *
 * @author auto create
 * @since 1.0, 2022-09-02 16:30:50
 */
public class ZhimaCreditEpEsgInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6227796552579521175L;

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
