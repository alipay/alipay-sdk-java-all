package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SimpleMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.mock.complexmodel.api response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicMockComplexmodelApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 1342933416176486287L;

	/** 
	 * 11
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/** 
	 * adc
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * biz_model
	 */
	@ApiField("simple_mock_model")
	private SimpleMockModel simpleMockModel;

	public void setBizNum(Long bizNum) {
		this.bizNum = bizNum;
	}
	public Long getBizNum( ) {
		return this.bizNum;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setSimpleMockModel(SimpleMockModel simpleMockModel) {
		this.simpleMockModel = simpleMockModel;
	}
	public SimpleMockModel getSimpleMockModel( ) {
		return this.simpleMockModel;
	}

}
