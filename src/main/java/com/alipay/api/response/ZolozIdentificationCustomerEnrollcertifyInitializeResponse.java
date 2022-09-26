package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.enrollcertify.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-31 19:11:41
 */
public class ZolozIdentificationCustomerEnrollcertifyInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6175991874788585743L;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 人脸注册id
	 */
	@ApiField("zim_id")
	private String zimId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setZimId(String zimId) {
		this.zimId = zimId;
	}
	public String getZimId( ) {
		return this.zimId;
	}

}
