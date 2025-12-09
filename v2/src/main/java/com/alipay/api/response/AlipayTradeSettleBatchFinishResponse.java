package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.batch.finish response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-19 11:32:04
 */
public class AlipayTradeSettleBatchFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7424877983379998552L;

	/** 
	 * 批次金额,单位分
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
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * FAIL  失败
ACCEPT_SUCCESS  受理成功，等待关账结果通知
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setBatchAmount(String batchAmount) {
		this.batchAmount = batchAmount;
	}
	public String getBatchAmount( ) {
		return this.batchAmount;
	}

	public void setBatchCurrency(String batchCurrency) {
		this.batchCurrency = batchCurrency;
	}
	public String getBatchCurrency( ) {
		return this.batchCurrency;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchId( ) {
		return this.batchId;
	}

	public void setBatchNum(Long batchNum) {
		this.batchNum = batchNum;
	}
	public Long getBatchNum( ) {
		return this.batchNum;
	}

	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}
	public String getBatchType( ) {
		return this.batchType;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getDimension( ) {
		return this.dimension;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
