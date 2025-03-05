package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批次资金模型。
 *
 * @author auto create
 * @since 1.0, 2023-01-30 20:03:19
 */
public class BatchFundItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 6133342252815587199L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private Long batchNo;

	/**
	 * 退款到银行卡处理中的总金额
	 */
	@ApiField("dback_refundtobank_processing_batch_amount")
	private String dbackRefundtobankProcessingBatchAmount;

	/**
	 * 退款到银行卡成功的总金额
	 */
	@ApiField("dback_refundtobank_success_batch_amount")
	private String dbackRefundtobankSuccessBatchAmount;

	/**
	 * 资金明细列表
	 */
	@ApiListField("fund_item_list")
	@ApiField("fund_item_a_o_p_model")
	private List<FundItemAOPModel> fundItemList;

	/**
	 * 批次创建时间
	 */
	@ApiField("gmt_biz_create_date")
	private Date gmtBizCreateDate;

	/**
	 * 资金单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 包含服务费的总金额
	 */
	@ApiField("total_amount_with_service_fee")
	private String totalAmountWithServiceFee;

	public Long getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(Long batchNo) {
		this.batchNo = batchNo;
	}

	public String getDbackRefundtobankProcessingBatchAmount() {
		return this.dbackRefundtobankProcessingBatchAmount;
	}
	public void setDbackRefundtobankProcessingBatchAmount(String dbackRefundtobankProcessingBatchAmount) {
		this.dbackRefundtobankProcessingBatchAmount = dbackRefundtobankProcessingBatchAmount;
	}

	public String getDbackRefundtobankSuccessBatchAmount() {
		return this.dbackRefundtobankSuccessBatchAmount;
	}
	public void setDbackRefundtobankSuccessBatchAmount(String dbackRefundtobankSuccessBatchAmount) {
		this.dbackRefundtobankSuccessBatchAmount = dbackRefundtobankSuccessBatchAmount;
	}

	public List<FundItemAOPModel> getFundItemList() {
		return this.fundItemList;
	}
	public void setFundItemList(List<FundItemAOPModel> fundItemList) {
		this.fundItemList = fundItemList;
	}

	public Date getGmtBizCreateDate() {
		return this.gmtBizCreateDate;
	}
	public void setGmtBizCreateDate(Date gmtBizCreateDate) {
		this.gmtBizCreateDate = gmtBizCreateDate;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTotalAmountWithServiceFee() {
		return this.totalAmountWithServiceFee;
	}
	public void setTotalAmountWithServiceFee(String totalAmountWithServiceFee) {
		this.totalAmountWithServiceFee = totalAmountWithServiceFee;
	}

}
