package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.score.brief.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:44
 */
public class ZhimaCreditScoreBriefGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8813597441377951291L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 准入判断结果  Y(用户的芝麻分大于等于准入分数)，N（用户的芝麻分小于准入分数），N/A（无法评估，例如用户未开通芝麻信用,或芝麻采集的信息不足以评估该用户的信用）
	 */
	@ApiField("is_admittance")
	private String isAdmittance;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setIsAdmittance(String isAdmittance) {
		this.isAdmittance = isAdmittance;
	}
	public String getIsAdmittance( ) {
		return this.isAdmittance;
	}

}
