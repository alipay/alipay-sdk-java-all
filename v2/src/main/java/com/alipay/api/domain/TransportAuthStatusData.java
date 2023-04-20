package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行授权状态数据
 *
 * @author auto create
 * @since 1.0, 2022-12-06 10:18:54
 */
public class TransportAuthStatusData extends AlipayObject {

	private static final long serialVersionUID = 6554438828273462655L;

	/**
	 * 授权状态。取值枚举为authed、unauthed。分别表示已授权、未授权
	 */
	@ApiField("auth_status")
	private String authStatus;

	/**
	 * 若用户已经授权，根据需要，某些场景下会返回用户授权时间。
	 */
	@ApiField("auth_time")
	private Date authTime;

	/**
	 * 蚂蚁会员id（对外）。当授权状态为已授权时，需要返回本字段。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁会员id。当授权状态为已授权时，需要返回本字段。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public Date getAuthTime() {
		return this.authTime;
	}
	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
