package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnergyQueryRsp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.activity.recycle.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-16 09:56:52
 */
public class AlipayEcoActivityRecycleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6129922418714495827L;

	/** 
	 * 能量返回结果列表
	 */
	@ApiListField("energy_list")
	@ApiField("energy_query_rsp")
	private List<EnergyQueryRsp> energyList;

	public void setEnergyList(List<EnergyQueryRsp> energyList) {
		this.energyList = energyList;
	}
	public List<EnergyQueryRsp> getEnergyList( ) {
		return this.energyList;
	}

}
