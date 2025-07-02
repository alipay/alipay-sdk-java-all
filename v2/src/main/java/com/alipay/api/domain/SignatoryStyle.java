package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约合同模板配置保存服务，矩形框内容样式。
 *
 * @author auto create
 * @since 1.0, 2023-06-19 19:09:41
 */
public class SignatoryStyle extends AlipayObject {

	private static final long serialVersionUID = 7726669618918894167L;

	/**
	 * 字体对应，默认且目前仅支持1（宋体）。
	 */
	@ApiField("font")
	private Long font;

	/**
	 * 字体大小，非必填，默认12。
	 */
	@ApiField("font_size")
	private Long fontSize;

	/**
	 * 组件高度，非必填，有默认值。
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 文本颜色，非必填，默认#000000
	 */
	@ApiField("text_color")
	private String textColor;

	/**
	 * 组件宽度，非必填，可使用默认值。
	 */
	@ApiField("width")
	private Long width;

	public Long getFont() {
		return this.font;
	}
	public void setFont(Long font) {
		this.font = font;
	}

	public Long getFontSize() {
		return this.fontSize;
	}
	public void setFontSize(Long fontSize) {
		this.fontSize = fontSize;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public String getTextColor() {
		return this.textColor;
	}
	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
