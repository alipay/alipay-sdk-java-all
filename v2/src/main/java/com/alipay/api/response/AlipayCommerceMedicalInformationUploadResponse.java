package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.information.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:32:01
 */
public class AlipayCommerceMedicalInformationUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4776599427334938555L;

	/** 
	 * 报备成功时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 根据各地人社局返回为准，与入参数request_content对应的业务响应数据。
	 */
	@ApiField("response_content")
	private String responseContent;

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}
	public String getResponseContent( ) {
		return this.responseContent;
	}

}
