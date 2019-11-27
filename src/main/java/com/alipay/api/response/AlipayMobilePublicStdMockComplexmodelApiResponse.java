package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SimpleMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.complexmodel.api response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicStdMockComplexmodelApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 6428895746411236646L;

	/** 
	 * biz_model
	 */
	@ApiField("biz_model")
	private SimpleMockModel bizModel;

	/** 
	 * 11
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/** 
	 * ADC
	 */
	@ApiField("biz_type")
	private String bizType;

	public void setBizModel(SimpleMockModel bizModel) {
		this.bizModel = bizModel;
	}
	public SimpleMockModel getBizModel( ) {
		return this.bizModel;
	}

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

}
