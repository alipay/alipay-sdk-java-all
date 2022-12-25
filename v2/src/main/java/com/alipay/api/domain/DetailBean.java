package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件信息
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:42:03
 */
public class DetailBean extends AlipayObject {

	private static final long serialVersionUID = 1353879353794773855L;

	/**
	 * 自定义附件标识，后续下载附件使用此标识区分。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 页面展示的附件中文描述（collectAttachement值为true时必填）
	 */
	@ApiField("description")
	private String description;

	/**
	 * 展示顺序（collectAttachement值为true时必填）
	 */
	@ApiField("order")
	private Long order;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

}
