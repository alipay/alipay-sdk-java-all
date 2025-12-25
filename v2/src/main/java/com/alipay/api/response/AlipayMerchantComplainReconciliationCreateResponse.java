package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReconciliationMerchantInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.complain.reconciliation.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-29 11:27:40
 */
public class AlipayMerchantComplainReconciliationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7783255931197832876L;

	/** 
	 * 统一社会信用代码
	 */
	@ApiField("merchant_credit_no")
	private String merchantCreditNo;

	/** 
	 * 商家账号信息列表
	 */
	@ApiListField("merchant_infos")
	@ApiField("reconciliation_merchant_info")
	private List<ReconciliationMerchantInfo> merchantInfos;

	public void setMerchantCreditNo(String merchantCreditNo) {
		this.merchantCreditNo = merchantCreditNo;
	}
	public String getMerchantCreditNo( ) {
		return this.merchantCreditNo;
	}

	public void setMerchantInfos(List<ReconciliationMerchantInfo> merchantInfos) {
		this.merchantInfos = merchantInfos;
	}
	public List<ReconciliationMerchantInfo> getMerchantInfos( ) {
		return this.merchantInfos;
	}

}
