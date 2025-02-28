package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.customgray.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:36
 */
public class AlipayOpenMiniInnerversionCustomgrayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8357837645357116638L;

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
