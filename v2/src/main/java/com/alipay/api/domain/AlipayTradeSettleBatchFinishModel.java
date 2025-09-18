package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批次预分账或预结算完结
 *
 * @author auto create
 * @since 1.0, 2024-04-19 11:30:27
 */
public class AlipayTradeSettleBatchFinishModel extends AlipayObject {

	private static final long serialVersionUID = 1623185293657184973L;

	/**
	 * 批次金额，单位元，支持小数点后2位
	 */
	@ApiField("batch_amount")
	private String batchAmount;

	/**
	 * 批次币种,默认填写为CNY,表示人民币
	 */
	@ApiField("batch_currency")
	private String batchCurrency;

	/**
	 * 结算对手方信息,当前仅支持smid
	 */
	@ApiField("batch_detail_info")
	private BatchDetailUserInfo batchDetailInfo;

	/**
	 * 批次明细数量
	 */
	@ApiField("batch_num")
	private Long batchNum;

	/**
	 * 分账:alloc;结算:settle
	 */
	@ApiField("batch_type")
	private String batchType;

	/**
	 * 业务汇总维度，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复，如果重复则返回该维度下对应的结算批次的状态
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 结算请求外部流水号，32个字符以内、可包含字母、数字、下划线；需保证在商户端不重复，如果重复则返回该流水号对应的结算单据的状态。
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

	public BatchDetailUserInfo getBatchDetailInfo() {
		return this.batchDetailInfo;
	}
	public void setBatchDetailInfo(BatchDetailUserInfo batchDetailInfo) {
		this.batchDetailInfo = batchDetailInfo;
	}

	public Long getBatchNum() {
		return this.batchNum;
	}
	public void setBatchNum(Long batchNum) {
		this.batchNum = batchNum;
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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
