package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金退款
 *
 * @author auto create
 * @since 1.0, 2019-01-10 20:56:05
 */
public class AlipayFundTransRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4764286381876323212L;

	/**
	 * JSON格式，传递业务扩展参数，使用前请与支付宝工程师联系！
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 该笔支付在支付宝系统内部的单据ID。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 标识一次退款请求，一笔退款失败后重新提交，要采用原来的退款单号。总退款金额不能超过用户实际支付金额。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款备注
	 */
	@ApiField("remark")
	private String remark;

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
