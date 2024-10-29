package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApmobileAppDetectResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.app.appreport.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-09 10:35:42
 */
public class AlipayDigitalmgmtAppAppreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1358481761756396869L;

	/** 
	 * 检测结果
	 */
	@ApiField("apmobile_app_detect_result_dto")
	private ApmobileAppDetectResultDTO apmobileAppDetectResultDto;

	public void setApmobileAppDetectResultDto(ApmobileAppDetectResultDTO apmobileAppDetectResultDto) {
		this.apmobileAppDetectResultDto = apmobileAppDetectResultDto;
	}
	public ApmobileAppDetectResultDTO getApmobileAppDetectResultDto( ) {
		return this.apmobileAppDetectResultDto;
	}

}
