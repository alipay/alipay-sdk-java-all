package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行用户账号查询接口
 *
 * @author auto create
 * @since 1.0, 2024-05-22 10:11:29
 */
public class AlipayUserDtbankcustAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2142284376863771845L;

	/**
	 * 用户登录账号ID，logon_id，phone_id不能同时为空，二选一
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 用户手机号，logon_id，phone_id不能同时为空，二选一
	 */
	@ApiField("phone_id")
	private String phoneId;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getPhoneId() {
		return this.phoneId;
	}
	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}

}
