package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款方身份认证信息。
 *
 * @author auto create
 * @since 1.0, 2018-05-18 14:34:36
 */
public class CertInfo extends AlipayObject {

	private static final long serialVersionUID = 4159763956288657824L;

	/**
	 * 代发时商家上传的收款方证件号码

biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 代发时商家上传的收款方证件类型。

biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("cert_type")
	private String certType;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

}
