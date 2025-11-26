package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantSettleInInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.openprocess.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:31:49
 */
public class AlipayCommerceMerchantcardOpenprocessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4732172324262832322L;

	/** 
	 * 查询失败的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 商户入驻信息
	 */
	@ApiField("merchant_settle_in_info")
	private MerchantSettleInInfo merchantSettleInInfo;

	/** 
	 * 查询是否成功
	 */
	@ApiField("query_result")
	private Boolean queryResult;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setMerchantSettleInInfo(MerchantSettleInInfo merchantSettleInInfo) {
		this.merchantSettleInInfo = merchantSettleInInfo;
	}
	public MerchantSettleInInfo getMerchantSettleInInfo( ) {
		return this.merchantSettleInInfo;
	}

	public void setQueryResult(Boolean queryResult) {
		this.queryResult = queryResult;
	}
	public Boolean getQueryResult( ) {
		return this.queryResult;
	}

}
