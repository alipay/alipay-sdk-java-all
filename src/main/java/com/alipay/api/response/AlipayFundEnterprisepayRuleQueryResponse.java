package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantLimit;
import com.alipay.api.domain.JointAccountQuotaDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-23 23:11:45
 */
public class AlipayFundEnterprisepayRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4442328692934268725L;

	/** 
	 * 商户限制信息，包含商户限制类型以及被限制对象的SMID或者PID
	 */
	@ApiField("merchant_limit")
	private MerchantLimit merchantLimit;

	/** 
	 * 额度列表：包含额度类型和额度上限
	 */
	@ApiListField("quota_list")
	@ApiField("joint_account_quota_d_t_o")
	private List<JointAccountQuotaDTO> quotaList;

	public void setMerchantLimit(MerchantLimit merchantLimit) {
		this.merchantLimit = merchantLimit;
	}
	public MerchantLimit getMerchantLimit( ) {
		return this.merchantLimit;
	}

	public void setQuotaList(List<JointAccountQuotaDTO> quotaList) {
		this.quotaList = quotaList;
	}
	public List<JointAccountQuotaDTO> getQuotaList( ) {
		return this.quotaList;
	}

}
