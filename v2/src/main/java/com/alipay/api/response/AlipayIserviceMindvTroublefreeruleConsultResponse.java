package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.mindv.troublefreerule.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:09:36
 */
public class AlipayIserviceMindvTroublefreeruleConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1675251541769346448L;

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
