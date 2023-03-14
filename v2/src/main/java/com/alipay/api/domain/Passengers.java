package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Passengers
 *
 * @author auto create
 * @since 1.0, 2021-02-05 10:32:06
 */
public class Passengers extends AlipayObject {

	private static final long serialVersionUID = 3671939491762419849L;

	/**
	 * 身份证
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

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

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
