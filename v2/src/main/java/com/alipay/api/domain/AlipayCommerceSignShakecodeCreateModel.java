package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微付宝签约吱口令创建
 *
 * @author auto create
 * @since 1.0, 2025-06-19 13:44:45
 */
public class AlipayCommerceSignShakecodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4155134332767972577L;

	/**
	 * 吱口令跳转链接
	 */
	@ApiField("biz_linked_id")
	private String bizLinkedId;

	/**
	 * SHARE_CODE：吱口令；SHORT_URL：短链接，不传默认为：SHARE_CODE
	 */
	@ApiField("type")
	private String type;

	public String getBizLinkedId() {
		return this.bizLinkedId;
	}
	public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
