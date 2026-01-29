package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.transfermaterial.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-12 20:27:42
 */
public class AlipayEbppIndustrySupervisionTransfermaterialSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5369873696746246284L;

	/** 
	 * 提交划拨单关联凭证处理结果
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/** 
	 * 外部流水号
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}
	public String getBizStatus( ) {
		return this.bizStatus;
	}

	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}
	public String getOutFlowId( ) {
		return this.outFlowId;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}
