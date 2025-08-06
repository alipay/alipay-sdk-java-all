package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快窗有礼展示设置
 *
 * @author auto create
 * @since 1.0, 2024-11-04 10:28:02
 */
public class DisplaySetting extends AlipayObject {

	private static final long serialVersionUID = 5613428411338422457L;

	/**
	 * 从枚举中选一个传入
	 */
	@ApiField("color")
	private String color;

	/**
	 * 不填则c端展示时无活动规则文案
	 */
	@ApiField("display_text")
	private String displayText;

	/**
	 * 必填，c端展示时的标题
	 */
	@ApiField("main_tail")
	private String mainTail;

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getDisplayText() {
		return this.displayText;
	}
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public String getMainTail() {
		return this.mainTail;
	}
	public void setMainTail(String mainTail) {
		this.mainTail = mainTail;
	}

}
