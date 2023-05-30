package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.customgray.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:56:50
 */
public class AlipayOpenMiniInnerversionCustomgrayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5349177161755138585L;

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
