package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 登录记录
 *
 * @author auto create
 * @since 1.0, 2024-04-17 13:50:37
 */
public class LoginRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 4452952973821399595L;

	/**
	 * 退出时间
	 */
	@ApiField("exit_time")
	private Date exitTime;

	/**
	 * 登录时间
	 */
	@ApiField("login_time")
	private Date loginTime;

	/**
	 * 通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	public Date getExitTime() {
		return this.exitTime;
	}
	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
