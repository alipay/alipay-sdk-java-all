package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpContactComplextInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.contactinfo.base.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-20 17:47:08
 */
public class ZhimaCreditEpContactinfoBaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6634878831695754242L;

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
