package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.orderfundtransfer.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-24 10:57:41
 */
public class AlipayEbppIndustrySupervisionOrderfundtransferModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2712763749157668561L;

	/** 
	 * 修改金额业务状态
	 */
	@ApiField("modify_status")
	private String modifyStatus;

	/** 
	 * 修改的划拨单请求流水号
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/** 
	 * 关联订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setModifyStatus(String modifyStatus) {
		this.modifyStatus = modifyStatus;
	}
	public String getModifyStatus( ) {
		return this.modifyStatus;
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
