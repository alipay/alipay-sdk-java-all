package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进入视频会议室前弹窗提示文案
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:04
 */
public class RemindTextInfo extends AlipayObject {

	private static final long serialVersionUID = 2412526758884827886L;

	/**
	 * 是否包含特殊样式（0：不包含 1：包含）
	 */
	@ApiField("has_special_text")
	private Long hasSpecialText;

	/**
	 * 长度 单位：个数
	 */
	@ApiField("length")
	private Long length;

	/**
	 * 开始索引位置
	 */
	@ApiField("start_index")
	private Long startIndex;

	/**
	 * 弹窗文案
	 */
	@ApiField("text")
	private String text;

	public Long getHasSpecialText() {
		return this.hasSpecialText;
	}
	public void setHasSpecialText(Long hasSpecialText) {
		this.hasSpecialText = hasSpecialText;
	}

	public Long getLength() {
		return this.length;
	}
	public void setLength(Long length) {
		this.length = length;
	}

	public Long getStartIndex() {
		return this.startIndex;
	}
	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
