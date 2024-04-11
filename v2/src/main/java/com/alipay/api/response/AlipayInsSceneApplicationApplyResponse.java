package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:13
 */
public class AlipayInsSceneApplicationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7793584244668356895L;

	/** 
	 * 投保单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	/** 
	 * 交易操作流水号;收银台付款需要
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 保单详情地址
	 */
	@ApiField("policy_detail_url_4_mobile")
	private String policyDetailUrl4Mobile;

	/** 
	 * 保单详情地址
	 */
	@ApiField("policy_detail_url_4_pc")
	private String policyDetailUrl4Pc;

	/** 
	 * 保单号,同步创建保单的会有，异步创建保单的不返回
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 支付交易订单号,收银台付款需要
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易类型，区分受托和担保交易
	 */
	@ApiField("trade_type")
	private String tradeType;

	/** 
	 * 核保失败原因
	 */
	@ApiField("underwrite_reject_reason")
	private String underwriteRejectReason;

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getApplicationNo( ) {
		return this.applicationNo;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getOperationId( ) {
		return this.operationId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPolicyDetailUrl4Mobile(String policyDetailUrl4Mobile) {
		this.policyDetailUrl4Mobile = policyDetailUrl4Mobile;
	}
	public String getPolicyDetailUrl4Mobile( ) {
		return this.policyDetailUrl4Mobile;
	}

	public void setPolicyDetailUrl4Pc(String policyDetailUrl4Pc) {
		this.policyDetailUrl4Pc = policyDetailUrl4Pc;
	}
	public String getPolicyDetailUrl4Pc( ) {
		return this.policyDetailUrl4Pc;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getTradeType( ) {
		return this.tradeType;
	}

	public void setUnderwriteRejectReason(String underwriteRejectReason) {
		this.underwriteRejectReason = underwriteRejectReason;
	}
	public String getUnderwriteRejectReason( ) {
		return this.underwriteRejectReason;
	}

}
