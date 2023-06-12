package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.sharetoken.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-25 14:29:09
 */
public class AlipayMarketingSharetokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6216596515984686363L;

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
	 * 吱口令生效时间
	 */
	@ApiListField("start_date")
	@ApiField("date")
	private List<Date> startDate;

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

	public void setStartDate(List<Date> startDate) {
		this.startDate = startDate;
	}
	public List<Date> getStartDate( ) {
		return this.startDate;
	}

}
