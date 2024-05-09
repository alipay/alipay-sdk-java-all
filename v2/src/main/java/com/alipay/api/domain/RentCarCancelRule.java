package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车订单取消规则
 *
 * @author auto create
 * @since 1.0, 2024-04-09 23:02:26
 */
public class RentCarCancelRule extends AlipayObject {

	private static final long serialVersionUID = 1223473993716391984L;

	/**
	 * 规则内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 是否免费取消
	 */
	@ApiField("free_cancel")
	private Boolean freeCancel;

	/**
	 * 取消规则的标题
	 */
	@ApiField("title")
	private String title;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getFreeCancel() {
		return this.freeCancel;
	}
	public void setFreeCancel(Boolean freeCancel) {
		this.freeCancel = freeCancel;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
