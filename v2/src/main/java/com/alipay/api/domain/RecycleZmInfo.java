package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 比价回收下单请求时芝麻信息模型
 *
 * @author auto create
 * @since 1.0, 2023-08-22 17:47:37
 */
public class RecycleZmInfo extends AlipayObject {

	private static final long serialVersionUID = 4521274931883363174L;

	/**
	 * 当用户进入芝麻先享下单页面后，点击左上角的回退按钮，中断开通流程，跳转回商户地址，该字段代表跳转回商家的页面地址。
	 */
	@ApiField("cancel_back_link")
	private String cancelBackLink;

	/**
	 * 是否使用芝麻先享
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 用户芝麻先享开通并下单流程结束后，不区分用户开通并下单成功/失败，跳转回商家页面，该字段代表跳转回商家的页面地址。
	 */
	@ApiField("return_back_link")
	private String returnBackLink;

	public String getCancelBackLink() {
		return this.cancelBackLink;
	}
	public void setCancelBackLink(String cancelBackLink) {
		this.cancelBackLink = cancelBackLink;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getReturnBackLink() {
		return this.returnBackLink;
	}
	public void setReturnBackLink(String returnBackLink) {
		this.returnBackLink = returnBackLink;
	}

}
