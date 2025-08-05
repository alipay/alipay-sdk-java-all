package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.share.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-11 10:36:39
 */
public class AlipayPayCodecShareTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8231848441914185138L;

	/** 
	 * 吱口令失效时间，若为空则表示永久有效
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 吱口令引导文案一，示例值中的：『#吱口令# 长按复制此条消息即可分享，』
	 */
	@ApiField("guider_str_1")
	private String guiderStr1;

	/** 
	 * 吱口令引导文案二，示例值中的：『，赶紧去分享吧』
	 */
	@ApiField("guider_str_2")
	private String guiderStr2;

	/** 
	 * 吱口令
	 */
	@ApiField("share_token")
	private String shareToken;

	/** 
	 * 口令生效时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate( ) {
		return this.expireDate;
	}

	public void setGuiderStr1(String guiderStr1) {
		this.guiderStr1 = guiderStr1;
	}
	public String getGuiderStr1( ) {
		return this.guiderStr1;
	}

	public void setGuiderStr2(String guiderStr2) {
		this.guiderStr2 = guiderStr2;
	}
	public String getGuiderStr2( ) {
		return this.guiderStr2;
	}

	public void setShareToken(String shareToken) {
		this.shareToken = shareToken;
	}
	public String getShareToken( ) {
		return this.shareToken;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate( ) {
		return this.startDate;
	}

}
