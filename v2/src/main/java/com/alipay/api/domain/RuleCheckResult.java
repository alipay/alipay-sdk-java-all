package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-24 11:52:50
 */
public class RuleCheckResult extends AlipayObject {

	private static final long serialVersionUID = 5179662178864869819L;

	/**
	 * 枚举：BLOCK（阻断）/WARN（警告）
	 */
	@ApiField("action")
	private String action;

	/**
	 * 规则内容
	 */
	@ApiField("display_text")
	private String displayText;

	/**
	 * 规则标题
	 */
	@ApiField("display_title")
	private String displayTitle;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getDisplayText() {
		return this.displayText;
	}
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public String getDisplayTitle() {
		return this.displayTitle;
	}
	public void setDisplayTitle(String displayTitle) {
		this.displayTitle = displayTitle;
	}

}
