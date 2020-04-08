package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-07 16:59:02
 */
public class AlipayOpenPublicLifeAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8712136656515926973L;

	/** 
	 * 过期时间，在过期时间之前需要拿refresh_token重新换取新的token使用
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 生活号id，用于表示此生活号唯一性
	 */
	@ApiField("public_id")
	private String publicId;

	/** 
	 * 刷新令牌，当返回值中过期时间快到了，可以通过此令牌来重新刷新令牌，时间自动延长一年
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/** 
	 * 授权token，通过授权token可以代替已生成的生活号id进行代理操作，例如发送广播等
	 */
	@ApiField("token")
	private String token;

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId( ) {
		return this.publicId;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getRefreshToken( ) {
		return this.refreshToken;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
