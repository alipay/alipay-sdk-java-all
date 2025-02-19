package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批次关账结果的领域对象
 *
 * @author auto create
 * @since 1.0, 2024-04-17 17:00:27
 */
public class BatchFinishInfo extends AlipayObject {

	private static final long serialVersionUID = 3172399148694799955L;

	/**
	 * 批次金额
	 */
	@ApiField("batch_amount")
	private String batchAmount;

	/**
	 * 批次币种,本次成功场景下默认返回CNY
	 */
	@ApiField("batch_currency")
	private String batchCurrency;

	/**
	 * 支付宝侧结算批次id,全局唯一
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 批次明细数量
	 */
	@ApiField("batch_num")
	private Long batchNum;

	/**
	 * 成功:S,失败:F,处理中:P
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/**
	 * 分账:alloc;结算:settle
	 */
	@ApiField("batch_type")
	private String batchType;

	/**
	 * 汇总维度
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 成功时间，在关单成功的情况下才会返回
	 */
	@ApiField("gmt_success")
	private String gmtSuccess;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getBatchAmount() {
		return this.batchAmount;
	}
	public void setBatchAmount(String batchAmount) {
		this.batchAmount = batchAmount;
	}

	public String getBatchCurrency() {
		return this.batchCurrency;
	}
	public void setBatchCurrency(String batchCurrency) {
		this.batchCurrency = batchCurrency;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public Long getBatchNum() {
		return this.batchNum;
	}
	public void setBatchNum(Long batchNum) {
		this.batchNum = batchNum;
	}

	public String getBatchStatus() {
		return this.batchStatus;
	}
	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getBatchType() {
		return this.batchType;
	}
	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getGmtSuccess() {
		return this.gmtSuccess;
	}
	public void setGmtSuccess(String gmtSuccess) {
		this.gmtSuccess = gmtSuccess;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
