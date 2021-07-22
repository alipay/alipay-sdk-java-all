package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金预授权单笔操作明细查询接口
 *
 * @author auto create
 * @since 1.0, 2021-07-15 11:34:50
 */
public class AlipayFundAuthOperationDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2694786192539458953L;

	/**
	 * 支付宝授权资金订单号，与商户的授权资金订单号不能同时为空，二者都存在时，以支付宝资金授权订单号为准，该参数与支付宝授权资金操作流水号配对使用。
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 支付宝的授权资金操作流水号，与商户的授权资金操作流水号不能同时为空，二者都存在时，以支付宝的授权资金操作流水号为准，该参数与支付宝授权资金订单号配对使用。
	 */
	@ApiField("operation_id")
	private String operationId;

	/**
	 * 授权资金操作类型，可选值FREEZE/UNFREEZE/PAY，分别对应冻结、解冻、支付明细类型；未传入本参数时，如果仅查询出单笔明细则直接返回，如果查询出多笔则优先返回冻结明细、无冻结明细时返回解冻明细；当传入本参数时，则严格按照该操作类型返回对应明细
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 商户的授权资金订单号，与支付宝的授权资金订单号不能同时为空，二者都存在时，以支付宝的授权资金订单号为准，该参数与商户的授权资金操作流水号配对使用。
该值与资金冻结时 out_order_id一致。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户的授权资金操作流水号，与支付宝的授权资金操作流水号不能同时为空，二者都存在时，以支付宝的授权资金操作流水号为准，该参数与商户的授权资金订单号配对使用。
该值与资金冻结时out_request_no一致
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getOperationId() {
		return this.operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
