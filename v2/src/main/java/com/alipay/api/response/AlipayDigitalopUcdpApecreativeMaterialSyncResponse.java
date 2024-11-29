package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apecreative.material.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:50
 */
public class AlipayDigitalopUcdpApecreativeMaterialSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2583878766999785223L;

	/** 
	 * 如果有创意组id 传进来的，就直接返回，如果是新建的，返回的是新建的创意组id
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
