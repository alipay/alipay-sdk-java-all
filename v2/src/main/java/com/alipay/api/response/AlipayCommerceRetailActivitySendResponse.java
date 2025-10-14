package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PrizeInstanceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.activity.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-12 13:42:26
 */
public class AlipayCommerceRetailActivitySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4574199355845274887L;

	/** 
	 * 奖品实例的信息
	 */
	@ApiField("prize_instance_info")
	private PrizeInstanceInfo prizeInstanceInfo;

	/** 
	 * 权益发放状态
	 */
	@ApiField("send_success")
	private Boolean sendSuccess;

	public void setPrizeInstanceInfo(PrizeInstanceInfo prizeInstanceInfo) {
		this.prizeInstanceInfo = prizeInstanceInfo;
	}
	public PrizeInstanceInfo getPrizeInstanceInfo( ) {
		return this.prizeInstanceInfo;
	}

	public void setSendSuccess(Boolean sendSuccess) {
		this.sendSuccess = sendSuccess;
	}
	public Boolean getSendSuccess( ) {
		return this.sendSuccess;
	}

}
