package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻认证数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AliTrustCert extends AlipayObject {

	private static final long serialVersionUID = 2763481221386149637L;

	/**
	 * 点击信用认证图标之后的跳转链接
	 */
	@ApiField("forward_url")
	private String forwardUrl;

	/**
	 * 通过信用认证的图标链接
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 当通过信用认证时,取值为"T";否则为"F".
	 */
	@ApiField("is_certified")
	private String isCertified;

	/**
	 * 芝麻认证等级，取值为1,2,3
	 */
	@ApiField("level")
	private String level;

	/**
	 * 当用户未通过芝麻认证时给出的原因提示
	 */
	@ApiField("message")
	private String message;

	public String getForwardUrl() {
		return this.forwardUrl;
	}
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getIsCertified() {
		return this.isCertified;
	}
	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
