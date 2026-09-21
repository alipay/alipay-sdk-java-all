package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ThirdPartyRefundResultList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.thirdparty.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-15 10:47:56
 */
public class AlipayMarketingThirdpartyOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8528777413959965793L;

	/** 
	 * 退款处理失败订单数
	 */
	@ApiField("failed_count")
	private Long failedCount;

	/** 
	 * 退款订单明细
	 */
	@ApiField("refund_result_list")
	private ThirdPartyRefundResultList refundResultList;

	/** 
	 * 退款处理成功订单数
	 */
	@ApiField("success_count")
	private Long successCount;

	/** 
	 * 平台订单编号列表
	 */
	@ApiField("total")
	private Long total;

	public void setFailedCount(Long failedCount) {
		this.failedCount = failedCount;
	}
	public Long getFailedCount( ) {
		return this.failedCount;
	}

	public void setRefundResultList(ThirdPartyRefundResultList refundResultList) {
		this.refundResultList = refundResultList;
	}
	public ThirdPartyRefundResultList getRefundResultList( ) {
		return this.refundResultList;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
