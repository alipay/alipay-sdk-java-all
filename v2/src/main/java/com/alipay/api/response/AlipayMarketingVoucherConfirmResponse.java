package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 13:56:40
 */
public class AlipayMarketingVoucherConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1711246323531769571L;

	/** 
	 * 用于决定在用户确认领券后是否重定向。可枚举：true表示需要重定向，false表示不需要重定向
	 */
	@ApiField("need_redirect")
	private Boolean needRedirect;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 重定向地址，用于接收支付宝返回的领取码，必须使用utf-8编码
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/** 
	 * 发券码。如果发生异常sendCode为空
	 */
	@ApiField("send_code")
	private String sendCode;

	/** 
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 指定的用户确认页面主题名称
	 */
	@ApiField("theme")
	private String theme;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setNeedRedirect(Boolean needRedirect) {
		this.needRedirect = needRedirect;
	}
	public Boolean getNeedRedirect( ) {
		return this.needRedirect;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}
	public String getRedirectUri( ) {
		return this.redirectUri;
	}

	public void setSendCode(String sendCode) {
		this.sendCode = sendCode;
	}
	public String getSendCode( ) {
		return this.sendCode;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getTheme( ) {
		return this.theme;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
