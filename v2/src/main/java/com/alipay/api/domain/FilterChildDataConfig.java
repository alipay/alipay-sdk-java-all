package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 榜单子条件配置
 *
 * @author auto create
 * @since 1.0, 2024-05-21 14:32:39
 */
public class FilterChildDataConfig extends AlipayObject {

	private static final long serialVersionUID = 4493553615932842126L;

	/**
	 * 参数值
	 */
	@ApiField("param")
	private String param;

	/**
	 * 显示文本
	 */
	@ApiField("text")
	private String text;

	public String getParam() {
		return this.param;
	}
	public void setParam(String param) {
		this.param = param;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
