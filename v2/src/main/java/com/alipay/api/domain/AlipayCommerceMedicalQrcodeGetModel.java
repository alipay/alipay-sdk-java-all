package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户医保码值接口
 *
 * @author auto create
 * @since 1.0, 2023-11-16 23:00:50
 */
public class AlipayCommerceMedicalQrcodeGetModel extends AlipayObject {

	private static final long serialVersionUID = 2643182421822667135L;

	/**
	 * 就诊人证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 就诊人证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 就诊人姓名
	 */
	@ApiField("username")
	private String username;

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

	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
