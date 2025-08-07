package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.energy.system.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-20 19:17:24
 */
public class AnttechBlockchainFinanceEnergySystemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3285584159112247421L;

	/** 
	 * 负荷资源实体Id
	 */
	@ApiField("entity_id")
	private String entityId;

	/** 
	 * 负荷资源实体状态
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
