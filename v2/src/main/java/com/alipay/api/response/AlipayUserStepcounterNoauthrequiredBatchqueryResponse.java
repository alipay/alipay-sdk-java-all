package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StepcounterDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.stepcounter.noauthrequired.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 15:57:56
 */
public class AlipayUserStepcounterNoauthrequiredBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8191867845995958481L;

	/** 
	 * 查询到的用户日计步信息
	 */
	@ApiListField("step_info")
	@ApiField("stepcounter_data_info")
	private List<StepcounterDataInfo> stepInfo;

	public void setStepInfo(List<StepcounterDataInfo> stepInfo) {
		this.stepInfo = stepInfo;
	}
	public List<StepcounterDataInfo> getStepInfo( ) {
		return this.stepInfo;
	}

}
