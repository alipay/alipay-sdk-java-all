package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:52:38
 */
public class BarLinkInfo extends AlipayObject {

	private static final long serialVersionUID = 5327674248643282334L;

	/**
	 * LOCKER_SUCCESS - 开锁成功，LOCKER_FAIL-开锁失败；
CHECK_FAIL-强制检查失败
	 */
	@ApiField("action_code")
	private String actionCode;

	/**
	 * 显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 跳转链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 导航图标图片url
	 */
	@ApiField("log_url")
	private String logUrl;

	public String getActionCode() {
		return this.actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getLogUrl() {
		return this.logUrl;
	}
	public void setLogUrl(String logUrl) {
		this.logUrl = logUrl;
	}

}
