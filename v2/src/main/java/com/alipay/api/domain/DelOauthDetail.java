package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解除授权明细
 *
 * @author auto create
 * @since 1.0, 2023-11-21 10:09:33
 */
public class DelOauthDetail extends AlipayObject {

	private static final long serialVersionUID = 4862878218769248832L;

	/**
	 * 数据入库的时间
	 */
	@ApiField("del_auth_time")
	private Date delAuthTime;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 授权范围，说明文档：https://opendocs.alipay.com/mini/05dxgc
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public Date getDelAuthTime() {
		return this.delAuthTime;
	}
	public void setDelAuthTime(Date delAuthTime) {
		this.delAuthTime = delAuthTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
