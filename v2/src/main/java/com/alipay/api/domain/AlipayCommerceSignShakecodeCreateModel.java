package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微付宝签约吱口令创建
 *
 * @author auto create
 * @since 1.0, 2024-10-30 15:45:19
 */
public class AlipayCommerceSignShakecodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3469379113998478439L;

	/**
	 * 吱口令跳转链接
	 */
	@ApiField("biz_linked_id")
	private String bizLinkedId;

	public String getBizLinkedId() {
		return this.bizLinkedId;
	}
	public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}

}
