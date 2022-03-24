package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版样式信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:40:20
 */
public class TemplateStyleDTO extends AlipayObject {

	private static final long serialVersionUID = 8448378439498568392L;

	/**
	 * 卡券整体背颜色，用RGB值以rgb(X,X,X)形式表示。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("background_color")
	private String backgroundColor;

	public String getBackgroundColor() {
		return this.backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

}
