package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.scene.cooperation.consult response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-14 17:13:54
 */
public class AlipayUserSceneCooperationConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7881718814735294497L;

	/** 
	 * true表示该用户运营有价值；false表示没有价值
	 */
	@ApiField("consult_result")
	private Boolean consultResult;

	public void setConsultResult(Boolean consultResult) {
		this.consultResult = consultResult;
	}
	public Boolean getConsultResult( ) {
		return this.consultResult;
	}

}
