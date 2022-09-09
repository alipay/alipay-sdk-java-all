package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.lawsuit.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-30 15:09:43
 */
public class ZhimaCreditEpLawsuitDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3125276212736229433L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 企业涉诉详情
	 */
	@ApiField("lawsuit_detail")
	private EpInfo lawsuitDetail;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setLawsuitDetail(EpInfo lawsuitDetail) {
		this.lawsuitDetail = lawsuitDetail;
	}
	public EpInfo getLawsuitDetail( ) {
		return this.lawsuitDetail;
	}

}
