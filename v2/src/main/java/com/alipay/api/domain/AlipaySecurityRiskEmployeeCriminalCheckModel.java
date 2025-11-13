package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业用工疑似前科风险核验服务接口
 *
 * @author auto create
 * @since 1.0, 2025-01-10 21:18:18
 */
public class AlipaySecurityRiskEmployeeCriminalCheckModel extends AlipayObject {

	private static final long serialVersionUID = 8697138227618656578L;

	/**
	 * 雇员身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 雇员姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 雇员手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
