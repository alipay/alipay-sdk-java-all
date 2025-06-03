package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 加入面板信息
 *
 * @author auto create
 * @since 1.0, 2024-08-12 10:25:05
 */
public class JoinPanelInfo extends AlipayObject {

	private static final long serialVersionUID = 4876973832821321764L;

	/**
	 * 按钮文本
	 */
	@ApiField("button_text")
	private String buttonText;

	/**
	 * 颜色
	 */
	@ApiField("color")
	private String color;

	/**
	 * 额外文本
	 */
	@ApiField("extra_text")
	private String extraText;

	/**
	 * 选边
	 */
	@ApiListField("side")
	@ApiField("string")
	private List<String> side;

	public String getButtonText() {
		return this.buttonText;
	}
	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getExtraText() {
		return this.extraText;
	}
	public void setExtraText(String extraText) {
		this.extraText = extraText;
	}

	public List<String> getSide() {
		return this.side;
	}
	public void setSide(List<String> side) {
		this.side = side;
	}

}
