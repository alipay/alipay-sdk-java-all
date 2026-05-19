package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.energy.entity.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-28 16:02:43
 */
public class AnttechBlockchainFinanceEnergyEntityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1853111271852392566L;

	/** 
	 * 数科系统中的实体Id， 唯一
	 */
	@ApiField("entity_id")
	private String entityId;

	/** 
	 * 可信实体状态
	 */
	@ApiField("entity_status")
	private String entityStatus;

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getEntityId( ) {
		return this.entityId;
	}

	public void setEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
	}
	public String getEntityStatus( ) {
		return this.entityStatus;
	}

}
