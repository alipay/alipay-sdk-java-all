package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合规服务处置平台当面付商户处罚状态查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-27 21:02:51
 */
public class AlipayFincoreComplianceRcservcenterRcdisposalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5733811954148425678L;

	/**
	 * 需求code
	 */
	@ApiField("demand_code")
	private String demandCode;

	/**
	 * 主体id
	 */
	@ApiField("entity_id")
	private String entityId;

	public String getDemandCode() {
		return this.demandCode;
	}
	public void setDemandCode(String demandCode) {
		this.demandCode = demandCode;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

}
