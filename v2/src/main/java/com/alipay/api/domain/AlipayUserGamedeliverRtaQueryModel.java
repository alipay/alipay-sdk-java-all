package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 游戏CPSRTA查询
 *
 * @author auto create
 * @since 1.0, 2026-08-10 16:02:49
 */
public class AlipayUserGamedeliverRtaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4347412959136557426L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 流量主RTAID
	 */
	@ApiField("rta_id")
	private String rtaId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRtaId() {
		return this.rtaId;
	}
	public void setRtaId(String rtaId) {
		this.rtaId = rtaId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
