package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗先享订单关闭接口
 *
 * @author auto create
 * @since 1.0, 2019-01-22 11:08:51
 */
public class AlipayPcreditHuabeiAuthOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8453278913357651761L;

	/**
	 * 支付宝侧花呗冻结、解冻操作单据id。在原先的冻结或者解冻接口调用中同步返回给商户，或者通过商户通知返回给商户。推荐优先使用本参数。
	 */
	@ApiField("auth_opt_id")
	private String authOptId;

	/**
	 * 商户自定义的操作员信息，仅作记录用，无实际业务用途。
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户原先调用冻结、解冻接口传入的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAuthOptId() {
		return this.authOptId;
	}
	public void setAuthOptId(String authOptId) {
		this.authOptId = authOptId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
