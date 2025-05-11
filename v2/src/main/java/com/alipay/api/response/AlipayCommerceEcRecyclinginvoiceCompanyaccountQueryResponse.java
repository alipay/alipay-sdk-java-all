package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SpecialAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.companyaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 16:32:31
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4128923482799947145L;

	/** 
	 * 专用账户详细信息
	 */
	@ApiField("special_account_info")
	private SpecialAccountInfo specialAccountInfo;

	/** 
	 * 企业（商户）转帐账户类型
	 */
	@ApiField("special_account_type")
	private String specialAccountType;

	public void setSpecialAccountInfo(SpecialAccountInfo specialAccountInfo) {
		this.specialAccountInfo = specialAccountInfo;
	}
	public SpecialAccountInfo getSpecialAccountInfo( ) {
		return this.specialAccountInfo;
	}

	public void setSpecialAccountType(String specialAccountType) {
		this.specialAccountType = specialAccountType;
	}
	public String getSpecialAccountType( ) {
		return this.specialAccountType;
	}

}
