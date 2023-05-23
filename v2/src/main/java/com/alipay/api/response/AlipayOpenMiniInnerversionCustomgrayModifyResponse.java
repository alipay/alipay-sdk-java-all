package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.customgray.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:21:52
 */
public class AlipayOpenMiniInnerversionCustomgrayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5641917256111512364L;

	/** 
	 * 组id
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
