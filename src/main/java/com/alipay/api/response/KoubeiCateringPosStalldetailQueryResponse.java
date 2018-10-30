package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StallEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.stalldetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-26 01:21:27
 */
public class KoubeiCateringPosStalldetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1186869327883351227L;

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
