package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsPolicy;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class AlipayInsSceneApplicationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7477661323889212668L;

	/** 
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	/** 
	 * 投保单状态;此状态用于判断投保流程的推进过程.INIT: 初始,UNDERWROTE:已核保, DECLINED:已拒保,CLOSED:已关闭, PAID:已付款,REFUND:已退款,ISSUED:已出单
	 */
	@ApiField("application_status")
	private String applicationStatus;

	/** 
	 * 交易操作流水号;用于跳支付宝收银台付款
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户生成的外部投保业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 保单;当投保单状态不是已出单,保单为空
	 */
	@ApiListField("policys")
	@ApiField("ins_policy")
	private List<InsPolicy> policys;

	/** 
	 * 支付交易订单号;用于跳支付宝收银台付款
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getApplicationNo( ) {
		return this.applicationNo;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getApplicationStatus( ) {
		return this.applicationStatus;
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

	public void setPolicys(List<InsPolicy> policys) {
		this.policys = policys;
	}
	public List<InsPolicy> getPolicys( ) {
		return this.policys;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
