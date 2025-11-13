package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.groupid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 16:47:34
 */
public class AlipayOpenIotvspGroupidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1783223221393592261L;

	/** 
	 * 封闭场景的机构用户库id
	 */
	@ApiField("group_id")
	private String groupId;

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

}
