package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RefundHistory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.refundhistory.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-01 16:06:42
 */
public class AlipayCloudCloudbaseWalletRefundhistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4754199837514151326L;

	/** 
	 * 提现记录列表
	 */
	@ApiListField("refund_histories")
	@ApiField("refund_history")
	private List<RefundHistory> refundHistories;

	public void setRefundHistories(List<RefundHistory> refundHistories) {
		this.refundHistories = refundHistories;
	}
	public List<RefundHistory> getRefundHistories( ) {
		return this.refundHistories;
	}

}
