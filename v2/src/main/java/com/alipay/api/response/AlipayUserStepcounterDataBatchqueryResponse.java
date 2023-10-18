package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StepcounterDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.stepcounter.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:56:45
 */
public class AlipayUserStepcounterDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3365666615851767953L;

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
