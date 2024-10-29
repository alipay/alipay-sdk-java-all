package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.energy.station.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-06 17:17:09
 */
public class AnttechBlockchainFinanceEnergyStationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2257386476568114342L;

	/** 
	 * 站点实体ID
	 */
	@ApiField("entity_id")
	private String entityId;

	/** 
	 * 站点实体状态
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
