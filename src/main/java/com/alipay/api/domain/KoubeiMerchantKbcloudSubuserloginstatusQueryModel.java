package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询口碑子账号登录的状态
 *
 * @author auto create
 * @since 1.0, 2018-11-19 18:09:27
 */
public class KoubeiMerchantKbcloudSubuserloginstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4486999144218838568L;

	/**
	 * 登录的sessionId；session_id或sub_user_id必须传一个
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 子账号id；session_id或sub_user_id必须传一个
	 */
	@ApiField("sub_user_id")
	private String subUserId;

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSubUserId() {
		return this.subUserId;
	}
	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
	}

}
