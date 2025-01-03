package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpContactComplextInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.contactinfo.ext.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-20 17:42:07
 */
public class ZhimaCreditEpContactinfoExtQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5313424487797163591L;

	/** 
	 * 企业查询key（入参原样返回）
	 */
	@ApiField("company_key")
	private String companyKey;

	/** 
	 * 企业联系方式综合信息
	 */
	@ApiField("data")
	private EpContactComplextInfo data;

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getCompanyKey( ) {
		return this.companyKey;
	}

	public void setData(EpContactComplextInfo data) {
		this.data = data;
	}
	public EpContactComplextInfo getData( ) {
		return this.data;
	}

}
