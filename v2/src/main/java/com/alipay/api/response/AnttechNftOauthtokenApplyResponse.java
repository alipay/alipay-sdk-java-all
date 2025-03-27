package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.oauthtoken.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-19 11:57:29
 */
public class AnttechNftOauthtokenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6758457259478548784L;

	/** 
	 * 后续调用接口鉴权的token，有效期30天
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * accessToken到期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 鲸探用户ID标识，OpenApi场景使用的加密格式
	 */
	@ApiField("open_user_id")
	private String openUserId;

	/** 
	 * refreshToken到期时间
	 */
	@ApiField("refresh_expire_time")
	private Date refreshExpireTime;

	/** 
	 * 刷新token，有效期90天
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/** 
	 * 请求消息id，全链路唯一标记，建议打印，排查问题需提供
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setOpenUserId(String openUserId) {
		this.openUserId = openUserId;
	}
	public String getOpenUserId( ) {
		return this.openUserId;
	}

	public void setRefreshExpireTime(Date refreshExpireTime) {
		this.refreshExpireTime = refreshExpireTime;
	}
	public Date getRefreshExpireTime( ) {
		return this.refreshExpireTime;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getRefreshToken( ) {
		return this.refreshToken;
	}

	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}
	public String getReqMsgId( ) {
		return this.reqMsgId;
	}

}
