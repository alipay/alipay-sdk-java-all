package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户确认领券
 *
 * @author auto create
 * @since 1.0, 2021-02-27 20:25:46
 */
public class AlipayMarketingVoucherConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7599338815214218245L;

	/**
	 * 用于决定在用户确认领券后是否重定向。可枚举：true表示需要重定向，false表示不需要重定向，不区分大小写
	 */
	@ApiField("need_redirect")
	private Boolean needRedirect;

	/**
	 * 外部业务单号。用作幂等控制。同一个template_id、user_id、out_biz_no返回相同的发券码
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 重定向地址，用于接收支付宝返回的领取码
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 指定用户确认页面的主题名称。目前提供5套主题，分别为：red, blue, yellow, green, orange
	 */
	@ApiField("theme")
	private String theme;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getNeedRedirect() {
		return this.needRedirect;
	}
	public void setNeedRedirect(Boolean needRedirect) {
		this.needRedirect = needRedirect;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRedirectUri() {
		return this.redirectUri;
	}
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTheme() {
		return this.theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
