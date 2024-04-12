package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.sharetoken.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-02 11:16:57
 */
public class AlipayMerchantIndirectSharetokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4872976927914733824L;

	/** 
	 * 业务token,用来串联业务操作行为及分析
	 */
	@ApiField("biz_token")
	private String bizToken;

	/** 
	 * 吱口令失效时间，若为空则表示永久有效
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 吱口令分析引导文案前半段，即示例值中吱口令码值的前一句文案【#吱口令# 长按复制此条消息即可分享，】
	 */
	@ApiField("guide_text_1")
	private String guideText1;

	/** 
	 * 吱口令分析引导文案后半段，即示例值中吱口令码值的后一句文案【，赶紧去分享吧】
	 */
	@ApiField("guide_text_2")
	private String guideText2;

	/** 
	 * 吱口令
	 */
	@ApiField("share_token")
	private String shareToken;

	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}
	public String getBizToken( ) {
		return this.bizToken;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate( ) {
		return this.expireDate;
	}

	public void setGuideText1(String guideText1) {
		this.guideText1 = guideText1;
	}
	public String getGuideText1( ) {
		return this.guideText1;
	}

	public void setGuideText2(String guideText2) {
		this.guideText2 = guideText2;
	}
	public String getGuideText2( ) {
		return this.guideText2;
	}

	public void setShareToken(String shareToken) {
		this.shareToken = shareToken;
	}
	public String getShareToken( ) {
		return this.shareToken;
	}

}
