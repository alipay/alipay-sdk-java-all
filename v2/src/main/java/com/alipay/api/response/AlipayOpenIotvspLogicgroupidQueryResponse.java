package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.logicgroupid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:57:35
 */
public class AlipayOpenIotvspLogicgroupidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4873155921582463494L;

	/** 
	 * 开发场景的机构用户库id
	 */
	@ApiField("logic_group_id")
	private String logicGroupId;

	public void setLogicGroupId(String logicGroupId) {
		this.logicGroupId = logicGroupId;
	}
	public String getLogicGroupId( ) {
		return this.logicGroupId;
	}

}
