package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信助手服务副标题样式
 *
 * @author auto create
 * @since 1.0, 2026-07-27 10:10:39
 */
public class EpAssistantServiceSubtitleStyle extends AlipayObject {

	private static final long serialVersionUID = 7825235214519213956L;

	/**
	 * 副标题文本颜色编码
	 */
	@ApiField("color")
	private String color;

	/**
	 * CSS属性字体的粗细程度
	 */
	@ApiField("font_weight")
	private String fontWeight;

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getFontWeight() {
		return this.fontWeight;
	}
	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
	}

}
