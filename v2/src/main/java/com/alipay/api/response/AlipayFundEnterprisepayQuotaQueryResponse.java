package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountQuotaRespDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 23:11:22
 */
public class AlipayFundEnterprisepayQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5742795246516446254L;

	/** 
	 * 额度详情信息列表
	 */
	@ApiListField("quota_list")
	@ApiField("joint_account_quota_resp_d_t_o")
	private List<JointAccountQuotaRespDTO> quotaList;

	public void setQuotaList(List<JointAccountQuotaRespDTO> quotaList) {
		this.quotaList = quotaList;
	}
	public List<JointAccountQuotaRespDTO> getQuotaList( ) {
		return this.quotaList;
	}

}
