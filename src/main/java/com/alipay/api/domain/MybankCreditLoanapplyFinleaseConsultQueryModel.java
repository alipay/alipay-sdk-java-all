package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赊呗分月付用户准入查询
 *
 * @author auto create
 * @since 1.0, 2022-10-28 11:31:17
 */
public class MybankCreditLoanapplyFinleaseConsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6362577883668677337L;

	/**
	 * 公司名称
	 */
	@ApiField("corporationname")
	private String corporationname;

	/**
	 * 工商注册号
	 */
	@ApiField("registrationno")
	private String registrationno;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("userid")
	private String userid;

	public String getCorporationname() {
		return this.corporationname;
	}
	public void setCorporationname(String corporationname) {
		this.corporationname = corporationname;
	}

	public String getRegistrationno() {
		return this.registrationno;
	}
	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}

	public String getUserid() {
		return this.userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}
