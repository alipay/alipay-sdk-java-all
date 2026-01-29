package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.beneficiary.group.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-15 20:22:42
 */
public class AlipayMarketingBeneficiaryGroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5876722121454919936L;

	/** 
	 * 消费券平台返回业务号
	 */
	@ApiField("sync_biz_no")
	private String syncBizNo;

	public void setSyncBizNo(String syncBizNo) {
		this.syncBizNo = syncBizNo;
	}
	public String getSyncBizNo( ) {
		return this.syncBizNo;
	}

}
