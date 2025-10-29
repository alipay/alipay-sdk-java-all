package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indrreferral.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-05 16:27:22
 */
public class AlipayOverseasOpenIndrreferralCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6377298335662271975L;

	/** 
	 * 推荐码过期时间，超期之后用户仍然可以点击链接跳转，但不会记录推荐关系
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/** 
	 * 推荐跳转链接
	 */
	@ApiField("jump_link")
	private String jumpLink;

	/** 
	 * 生成的推荐码
	 */
	@ApiField("referral_code")
	private String referralCode;

	/** 
	 * 请求结果，代表本次调用是否成功
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}
	public Date getExpiredTime( ) {
		return this.expiredTime;
	}

	public void setJumpLink(String jumpLink) {
		this.jumpLink = jumpLink;
	}
	public String getJumpLink( ) {
		return this.jumpLink;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}
	public String getReferralCode( ) {
		return this.referralCode;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
