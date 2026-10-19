package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当前服务商可查询的员工因公付代扣授权明细
 *
 * @author auto create
 * @since 1.0, 2026-10-08 19:20:12
 */
public class PayAuthInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1459812576219925481L;

	/**
	 * 员工授权的收单商户 PID
	 */
	@ApiField("auth_pid")
	private String authPid;

	/**
	 * 员工对该收单商户 PID 的因公付代扣授权状态。
	 */
	@ApiField("auth_status")
	private String authStatus;

	public String getAuthPid() {
		return this.authPid;
	}
	public void setAuthPid(String authPid) {
		this.authPid = authPid;
	}

	public String getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

}
