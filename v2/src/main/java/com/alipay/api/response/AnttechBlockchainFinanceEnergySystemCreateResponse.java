package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.energy.system.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-02 22:02:08
 */
public class AnttechBlockchainFinanceEnergySystemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4736526196643332277L;

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
