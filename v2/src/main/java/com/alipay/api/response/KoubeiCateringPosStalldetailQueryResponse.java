package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StallEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.stalldetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosStalldetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1733749865327797779L;

	/** 
	 * 档口模型
	 */
	@ApiField("stall_entity")
	private StallEntity stallEntity;

	public void setStallEntity(StallEntity stallEntity) {
		this.stallEntity = stallEntity;
	}
	public StallEntity getStallEntity( ) {
		return this.stallEntity;
	}

}
