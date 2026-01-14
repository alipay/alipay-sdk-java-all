package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业用工失信限高风险核验服务接口
 *
 * @author auto create
 * @since 1.0, 2025-01-08 10:50:46
 */
public class AlipaySecurityRiskEmployeeCreditlimitCheckModel extends AlipayObject {

	private static final long serialVersionUID = 1753781456991243676L;

	/**
	 * 雇员身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 姓名参数
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
