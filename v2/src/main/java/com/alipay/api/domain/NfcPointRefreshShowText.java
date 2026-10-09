package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展示文案
 *
 * @author auto create
 * @since 1.0, 2026-10-09 15:27:54
 */
public class NfcPointRefreshShowText extends AlipayObject {

	private static final long serialVersionUID = 4714743766599213419L;

	/**
	 * 底部小字文案
	 */
	@ApiField("bottom_text")
	private String bottomText;

	/**
	 * 中央核心文案
	 */
	@ApiField("middle_smart_text")
	private String middleSmartText;

	/**
	 * 顶部标题文案
	 */
	@ApiField("title_text")
	private String titleText;

	public String getBottomText() {
		return this.bottomText;
	}
	public void setBottomText(String bottomText) {
		this.bottomText = bottomText;
	}

	public String getMiddleSmartText() {
		return this.middleSmartText;
	}
	public void setMiddleSmartText(String middleSmartText) {
		this.middleSmartText = middleSmartText;
	}

	public String getTitleText() {
		return this.titleText;
	}
	public void setTitleText(String titleText) {
		this.titleText = titleText;
	}

}
