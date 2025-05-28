package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InquiryBizContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medinquiry.record.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-28 15:57:27
 */
public class AlipayCommerceMedicalMedinquiryRecordVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4145658345465949789L;

	/** 
	 * 返回是否存在预问诊病例
	 */
	@ApiField("data")
	private InquiryBizContent data;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	public void setData(InquiryBizContent data) {
		this.data = data;
	}
	public InquiryBizContent getData( ) {
		return this.data;
	}

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
