package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.mindv.troublefreerule.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayIserviceMindvTroublefreeruleConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7487687239839139166L;

	/** 
	 * 返回 true 表示未被防打扰过滤，返回false表示已被过滤
	 */
	@ApiField("result_data")
	private Boolean resultData;

	public void setResultData(Boolean resultData) {
		this.resultData = resultData;
	}
	public Boolean getResultData( ) {
		return this.resultData;
	}

}
