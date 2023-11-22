package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreativeGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apecreative.group.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:46:42
 */
public class AlipayDigitalopUcdpApecreativeGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7465938891879945988L;

	/** 
	 * ape创意组list
	 */
	@ApiField("creative_group_list")
	private CreativeGroup creativeGroupList;

	public void setCreativeGroupList(CreativeGroup creativeGroupList) {
		this.creativeGroupList = creativeGroupList;
	}
	public CreativeGroup getCreativeGroupList( ) {
		return this.creativeGroupList;
	}

}
