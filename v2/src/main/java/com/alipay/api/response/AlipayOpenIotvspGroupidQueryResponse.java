package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.groupid.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:09:21
 */
public class AlipayOpenIotvspGroupidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5357866928866366888L;

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
