package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开红包按钮容器
 *
 * @author auto create
 * @since 1.0, 2022-09-01 21:02:48
 */
public class GiftTemplateButtonBox extends AlipayObject {

	private static final long serialVersionUID = 6641289775156564113L;

	/**
	 * 开红包按钮，用于拆红包页
	 */
	@ApiField("button_url")
	private String buttonUrl;

	/**
	 * 开红包按钮不可点击状态样式，用于”我的封面“列表页
	 */
	@ApiField("invalid_button_url")
	private String invalidButtonUrl;

	public String getButtonUrl() {
		return this.buttonUrl;
	}
	public void setButtonUrl(String buttonUrl) {
		this.buttonUrl = buttonUrl;
	}

	public String getInvalidButtonUrl() {
		return this.invalidButtonUrl;
	}
	public void setInvalidButtonUrl(String invalidButtonUrl) {
		this.invalidButtonUrl = invalidButtonUrl;
	}

}
