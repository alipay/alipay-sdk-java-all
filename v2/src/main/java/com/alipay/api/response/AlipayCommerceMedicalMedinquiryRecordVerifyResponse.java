package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InquiryBizContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medinquiry.record.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 10:52:36
 */
public class AlipayCommerceMedicalMedinquiryRecordVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3423335469385796496L;

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
