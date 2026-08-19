package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-27 10:12:55
 */
public class EpAssistantServiceSubtitleSegment extends AlipayObject {

	private static final long serialVersionUID = 2358453559994976369L;

	/**
	 * 分段文本对应的样式，示例：{"color": "#FF6B35", "fontWeight": "bold"} ，没有样式时此字段可能为null
	 */
	@ApiField("style")
	private EpAssistantServiceSubtitleStyle style;

	/**
	 * 服务卡片副标题分段文本，如果整段文本中有需要特殊格式的，会将文本切割，每段文本关联独立展示样式style
	 */
	@ApiField("text")
	private String text;

	public EpAssistantServiceSubtitleStyle getStyle() {
		return this.style;
	}
	public void setStyle(EpAssistantServiceSubtitleStyle style) {
		this.style = style;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
