package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业用工底线风险核验服务接口
 *
 * @author auto create
 * @since 1.0, 2025-01-08 10:50:24
 */
public class AlipaySecurityRiskEmployeeEmpriskCheckModel extends AlipayObject {

	private static final long serialVersionUID = 3343924375929645133L;

	/**
	 * 雇员身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 姓名参数
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号
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
