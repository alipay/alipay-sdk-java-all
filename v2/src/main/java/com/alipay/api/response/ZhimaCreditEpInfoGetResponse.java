package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CompanyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.info.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 14:46:11
 */
public class ZhimaCreditEpInfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6676426991498436392L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 企业工商综合信息
	 */
	@ApiField("company_info")
	private CompanyInfo companyInfo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}
	public CompanyInfo getCompanyInfo( ) {
		return this.companyInfo;
	}

}
