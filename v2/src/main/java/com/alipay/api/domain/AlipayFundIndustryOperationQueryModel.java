package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业基金订单查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-22 16:18:40
 */
public class AlipayFundIndustryOperationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6177931843138344418L;

	/**
	 * 支付宝流水号（fascore流水号）
支持申购、申购撤销、赎回等流水的查询
	 */
	@ApiField("operation_id")
	private String operationId;

	/**
	 * 支付外部请求号
支持申购、赎回流水的查询
	 */
	@ApiField("pay_out_request_no")
	private String payOutRequestNo;

	/**
	 * 申购撤销流水的外部请求号
（查询申购撤销流水时，需要传入对应的申购单外部请求号/申购单支付宝流水号）
	 */
	@ApiField("refund_out_request_no")
	private String refundOutRequestNo;

	public String getOperationId() {
		return this.operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getPayOutRequestNo() {
		return this.payOutRequestNo;
	}
	public void setPayOutRequestNo(String payOutRequestNo) {
		this.payOutRequestNo = payOutRequestNo;
	}

	public String getRefundOutRequestNo() {
		return this.refundOutRequestNo;
	}
	public void setRefundOutRequestNo(String refundOutRequestNo) {
		this.refundOutRequestNo = refundOutRequestNo;
	}

}
