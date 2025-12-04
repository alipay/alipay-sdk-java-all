package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LoanPayAssetResult;
import com.alipay.api.domain.Refuse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanpay.asset.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditLoantradeLoanpayAssetConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2675283134943342375L;

	/** 
	 * 资产
	 */
	@ApiField("asset_result")
	private LoanPayAssetResult assetResult;

	/** 
	 * 不可见不可用信息
	 */
	@ApiField("refuse_msg")
	private Refuse refuseMsg;

	/** 
	 * 是否处理成功，true(成功)，false(失败)。true表示咨询成功，但不代表可见可用
	 */
	@ApiField("success")
	private Boolean success;

	public void setAssetResult(LoanPayAssetResult assetResult) {
		this.assetResult = assetResult;
	}
	public LoanPayAssetResult getAssetResult( ) {
		return this.assetResult;
	}

	public void setRefuseMsg(Refuse refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public Refuse getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
