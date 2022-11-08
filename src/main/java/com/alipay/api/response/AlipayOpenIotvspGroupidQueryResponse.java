package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.groupid.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-11 17:21:41
 */
public class AlipayOpenIotvspGroupidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5245244351939184412L;

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
