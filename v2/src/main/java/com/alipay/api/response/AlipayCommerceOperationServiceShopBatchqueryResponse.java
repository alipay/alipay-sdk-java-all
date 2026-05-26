package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.service.shop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-20 11:02:45
 */
public class AlipayCommerceOperationServiceShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3525685718377129315L;

	/** 
	 * 请求结果，是个JSON 序列化后大字段。
	 */
	@ApiField("response_data")
	private String responseData;

	/** 
	 * 服务code，如高德扫街榜传AMAP_NFC_SPEAKER_COOP
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 主体id
	 */
	@ApiField("subject_id")
	private String subjectId;

	/** 
	 * 主体类型，枚举值：ALPAY_USER（商户）、SMID（二级商户）、POIMID（门店）、LEADS_ID（leadsId）、BIZ_TID、TAG_ID、SN、EMAIL、PHONE、APP
	 */
	@ApiField("subject_type")
	private String subjectType;

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	public String getResponseData( ) {
		return this.responseData;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectId( ) {
		return this.subjectId;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}
	public String getSubjectType( ) {
		return this.subjectType;
	}

}
