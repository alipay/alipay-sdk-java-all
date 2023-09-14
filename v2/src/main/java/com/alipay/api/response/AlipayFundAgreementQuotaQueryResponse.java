package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuotaQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.agreement.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:49:16
 */
public class AlipayFundAgreementQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5818858997394562271L;

	/** 
	 * 单个协议的额度查询结果
	 */
	@ApiListField("quota_query_response_list")
	@ApiField("quota_query_response")
	private List<QuotaQueryResponse> quotaQueryResponseList;

	public void setQuotaQueryResponseList(List<QuotaQueryResponse> quotaQueryResponseList) {
		this.quotaQueryResponseList = quotaQueryResponseList;
	}
	public List<QuotaQueryResponse> getQuotaQueryResponseList( ) {
		return this.quotaQueryResponseList;
	}

}
