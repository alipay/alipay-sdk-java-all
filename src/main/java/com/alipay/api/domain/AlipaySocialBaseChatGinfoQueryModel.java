package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交查询群信息
 *
 * @author auto create
 * @since 1.0, 2019-08-23 16:50:33
 */
public class AlipaySocialBaseChatGinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1194991219334136948L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
