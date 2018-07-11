package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金预授权明细撤销接口
 *
 * @author auto create
 * @since 1.0, 2016-11-29 15:55:57
 */
public class AlipayFundAuthOperationCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3822583162346551512L;

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
	 * 商户的授权资金订单号，与支付宝的授权资金订单号不能同时为空，二者都存在时，以支付宝的授权资金订单号为准，该参数与商户的授权资金操作流水号配对使用。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户的授权资金操作流水号，与支付宝的授权资金操作流水号不能同时为空，二者都存在时，以支付宝的授权资金操作流水号为准，该参数与商户的授权资金订单号配对使用。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户对本次撤销操作的附言描述，长度不超过100个字母或50个汉字
	 */
	@ApiField("remark")
	private String remark;

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

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
