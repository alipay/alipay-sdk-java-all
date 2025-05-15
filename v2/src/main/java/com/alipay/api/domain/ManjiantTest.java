package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ffff
 *
 * @author auto create
 * @since 1.0, 2025-04-25 18:22:27
 */
public class ManjiantTest extends AlipayObject {

	private static final long serialVersionUID = 8625223181551385868L;

	/**
	 * defe
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * dddd
	 */
	@ApiField("open_id_json")
	private String openIdJson;

	/**
	 * 22222222
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOpenIdJson() {
		return this.openIdJson;
	}
	public void setOpenIdJson(String openIdJson) {
		this.openIdJson = openIdJson;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
