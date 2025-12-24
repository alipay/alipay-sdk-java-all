package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.member.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-12 16:25:07
 */
public class AlipayCommerceMedicalMemberAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5162146514258461256L;

	/** 
	 * 医疗会员token
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * alipay的id
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/** 
	 * 有效 单位（天）
	 */
	@ApiField("duration")
	private Long duration;

	/** 
	 * 过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	public String getAlipayId( ) {
		return this.alipayId;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getDuration( ) {
		return this.duration;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

}
