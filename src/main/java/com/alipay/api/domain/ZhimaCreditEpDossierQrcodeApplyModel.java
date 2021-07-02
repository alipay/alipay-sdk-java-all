package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用企业档案页二维码接口
 *
 * @author auto create
 * @since 1.0, 2021-06-28 11:55:31
 */
public class ZhimaCreditEpDossierQrcodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6481296434728584172L;

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
