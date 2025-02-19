package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuotaModifyDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.agreement.quota.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 10:35:11
 */
public class AlipayFundAgreementQuotaModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4693649456339717459L;

	/** 
	 * 额度变更结果集合
	 */
	@ApiListField("quota_modify_detail_list")
	@ApiField("quota_modify_detail")
	private List<QuotaModifyDetail> quotaModifyDetailList;

	public void setQuotaModifyDetailList(List<QuotaModifyDetail> quotaModifyDetailList) {
		this.quotaModifyDetailList = quotaModifyDetailList;
	}
	public List<QuotaModifyDetail> getQuotaModifyDetailList( ) {
		return this.quotaModifyDetailList;
	}

}
