package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CompanyRole;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.role.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-30 15:11:48
 */
public class ZhimaCreditEpRoleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2474271836473921659L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 自然人担任 法人/股东/主要管理人员 的企业信息
	 */
	@ApiField("company_role")
	private CompanyRole companyRole;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCompanyRole(CompanyRole companyRole) {
		this.companyRole = companyRole;
	}
	public CompanyRole getCompanyRole( ) {
		return this.companyRole;
	}

}
