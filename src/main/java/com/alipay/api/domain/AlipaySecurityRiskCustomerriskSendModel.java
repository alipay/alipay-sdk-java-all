package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户数据同步
 *
 * @author auto create
 * @since 1.0, 2017-05-26 21:53:59
 */
public class AlipaySecurityRiskCustomerriskSendModel extends AlipayObject {

	private static final long serialVersionUID = 5677221126377339899L;

	/**
	 * 身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
