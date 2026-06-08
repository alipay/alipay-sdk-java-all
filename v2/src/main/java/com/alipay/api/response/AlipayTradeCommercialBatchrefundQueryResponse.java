package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommerceRefundDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.commercial.batchrefund.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-03 14:27:32
 */
public class AlipayTradeCommercialBatchrefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5191832825185412516L;

	/** 
	 * 实际退款金额，已成功明细的退款金额之和，单位：元
	 */
	@ApiField("actual_refund_amount")
	private String actualRefundAmount;

	/** 
	 * 批量退款执行批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/** 
	 * 批次创建时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * null
	 */
	@ApiListField("details")
	@ApiField("commerce_refund_detail")
	private List<CommerceRefundDetail> details;

	/** 
	 * 退款失败明细数
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/** 
	 * 退款批次状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 退款成功明细数
	 */
	@ApiField("success_count")
	private Long successCount;

	/** 
	 * 明细总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 批次总退款金额，单位：元
	 */
	@ApiField("total_refund_amount")
	private String totalRefundAmount;

	public void setActualRefundAmount(String actualRefundAmount) {
		this.actualRefundAmount = actualRefundAmount;
	}
	public String getActualRefundAmount( ) {
		return this.actualRefundAmount;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchId( ) {
		return this.batchId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setDetails(List<CommerceRefundDetail> details) {
		this.details = details;
	}
	public List<CommerceRefundDetail> getDetails( ) {
		return this.details;
	}

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}
	public Long getFailCount( ) {
		return this.failCount;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getRefundReason( ) {
		return this.refundReason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalRefundAmount(String totalRefundAmount) {
		this.totalRefundAmount = totalRefundAmount;
	}
	public String getTotalRefundAmount( ) {
		return this.totalRefundAmount;
	}

}
