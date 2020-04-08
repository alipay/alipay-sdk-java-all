package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.group.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-29 10:51:49
 */
public class AlipayCommerceIotGroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5134433212522593674L;

	/** 
	 * 分组创建成功的id
	 */
	@ApiField("group_id")
	private Long groupId;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getGroupId( ) {
		return this.groupId;
	}

}
