package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FaceAbilityExtInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.faceability.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-15 10:03:49
 */
public class ZolozAuthenticationCustomerFaceabilityIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6513641919111814955L;

	/** 
	 * 能力接口返回值
	 */
	@ApiField("biz_info")
	private FaceAbilityExtInfo bizInfo;

	public void setBizInfo(FaceAbilityExtInfo bizInfo) {
		this.bizInfo = bizInfo;
	}
	public FaceAbilityExtInfo getBizInfo( ) {
		return this.bizInfo;
	}

}
