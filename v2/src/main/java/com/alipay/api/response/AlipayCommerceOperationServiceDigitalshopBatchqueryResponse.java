package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.service.digitalshop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-07 17:47:51
 */
public class AlipayCommerceOperationServiceDigitalshopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3522511768422425389L;

	/** 
	 * 请求结果，是个JSON 序列化后字符串。当请求类型query_type是SHOP_MATCH时，格式为：{"matchResultList":[{"subjectId":"2088xx0000000001","channelType":"SG","matched":1},{"subjectId":"2088xx0000000002","channelType":"GD","matched":0}]}，其中subjectId是smid或pid，channelType填GD（高德）或SG（闪购）,mathed为1时，表示匹配，为0时表示不匹配。
	 */
	@ApiField("response_data")
	private String responseData;

	/** 
	 * 服务code，如数字化门店ALIPAY_DIGITALSHOP
	 */
	@ApiField("service_code")
	private String serviceCode;

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

}
