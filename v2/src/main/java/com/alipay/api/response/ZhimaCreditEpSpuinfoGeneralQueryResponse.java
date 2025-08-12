package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpSpuGeneralInfoResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.spuinfo.general.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-23 16:32:20
 */
public class ZhimaCreditEpSpuinfoGeneralQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8435175222614666655L;

	/** 
	 * 企业查询key
	 */
	@ApiField("company_key")
	private String companyKey;

	/** 
	 * 结果集
	 */
	@ApiField("data")
	private EpSpuGeneralInfoResult data;

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getCompanyKey( ) {
		return this.companyKey;
	}

	public void setData(EpSpuGeneralInfoResult data) {
		this.data = data;
	}
	public EpSpuGeneralInfoResult getData( ) {
		return this.data;
	}

}
