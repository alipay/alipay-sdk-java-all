package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板权益内容
 *
 * @author auto create
 * @since 1.0, 2018-04-16 19:42:00
 */
public class TemplateRightsContentDTO extends AlipayObject {

	private static final long serialVersionUID = 1453516211678813237L;

	/**
	 * 权益内容详情
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 权益内容标题
	 */
	@ApiField("title")
	private String title;

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
