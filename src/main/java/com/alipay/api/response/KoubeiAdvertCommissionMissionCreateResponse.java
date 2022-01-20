package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.mission.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionMissionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3793319339861913722L;

	/** 
	 * 分佣任务ID，需要保存，后续任务管理以及任务认领都需要任务ID
1、如果商户创建分佣任务，则出参会返回任务ID
2、如果服务商代创建分佣任务，由于需要审批，因此出参不返回任务ID，而是需要通过任务查询接口（koubei.advert.commission.mission.query）获取
	 */
	@ApiField("mission_id")
	private String missionId;

	public void setMissionId(String missionId) {
		this.missionId = missionId;
	}
	public String getMissionId( ) {
		return this.missionId;
	}

}
