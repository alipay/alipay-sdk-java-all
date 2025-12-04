package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.specgroup.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:30
 */
public class KoubeiCateringDishSpecgroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8686644597626635267L;

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
