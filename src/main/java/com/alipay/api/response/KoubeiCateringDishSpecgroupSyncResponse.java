package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.specgroup.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-08 20:55:11
 */
public class KoubeiCateringDishSpecgroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3196951868458394375L;

	/** 
	 * 12323
	 */
	@ApiField("kbdish_spec_group_id")
	private String kbdishSpecGroupId;

	public void setKbdishSpecGroupId(String kbdishSpecGroupId) {
		this.kbdishSpecGroupId = kbdishSpecGroupId;
	}
	public String getKbdishSpecGroupId( ) {
		return this.kbdishSpecGroupId;
	}

}
