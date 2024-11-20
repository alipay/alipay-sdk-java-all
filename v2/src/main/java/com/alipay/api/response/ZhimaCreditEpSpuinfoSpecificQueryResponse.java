package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpSpuSpecificInfoResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.spuinfo.specific.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-23 16:27:22
 */
public class ZhimaCreditEpSpuinfoSpecificQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7834445366881519638L;

	/** 
	 * 企业查询key
	 */
	@ApiField("company_key")
	private String companyKey;

	/** 
	 * 结果集
	 */
	@ApiField("data")
	private EpSpuSpecificInfoResult data;

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getCompanyKey( ) {
		return this.companyKey;
	}

	public void setData(EpSpuSpecificInfoResult data) {
		this.data = data;
	}
	public EpSpuSpecificInfoResult getData( ) {
		return this.data;
	}

}
