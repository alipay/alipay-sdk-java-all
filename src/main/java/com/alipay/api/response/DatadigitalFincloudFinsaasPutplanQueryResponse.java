package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChannelPutPlanDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-05 10:49:52
 */
public class DatadigitalFincloudFinsaasPutplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4879522845657523196L;

	/** 
	 * 投放计划详情对象
	 */
	@ApiField("detail")
	private ChannelPutPlanDetailDTO detail;

	public void setDetail(ChannelPutPlanDetailDTO detail) {
		this.detail = detail;
	}
	public ChannelPutPlanDetailDTO getDetail( ) {
		return this.detail;
	}

}
