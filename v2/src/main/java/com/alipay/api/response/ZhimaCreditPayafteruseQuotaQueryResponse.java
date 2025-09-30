package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreditMoney;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-02 00:42:19
 */
public class ZhimaCreditPayafteruseQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4792145297318162842L;

	/** 
	 * 芝麻总额度
	 */
	@ApiField("total_quota")
	private CreditMoney totalQuota;

	public void setTotalQuota(CreditMoney totalQuota) {
		this.totalQuota = totalQuota;
	}
	public CreditMoney getTotalQuota( ) {
		return this.totalQuota;
	}

}
