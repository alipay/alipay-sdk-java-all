package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.specgroup.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:49:00
 */
public class KoubeiCateringDishSpecgroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6399326354778875953L;

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
