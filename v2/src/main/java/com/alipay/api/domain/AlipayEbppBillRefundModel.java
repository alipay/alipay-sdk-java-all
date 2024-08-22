package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受理单据撤销接口
 *
 * @author auto create
 * @since 1.0, 2024-08-22 14:28:11
 */
public class AlipayEbppBillRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2499577691141661843L;

	/**
	 * 支付宝流水号。
	 */
	@ApiField("alipay_bill_no")
	private String alipayBillNo;

	/**
	 * 扩展字段，json格式的一系列键值对，示例只是个形式，具体的Key-Value需要根据具体业务另行约定。
无特别约定时，此字段不必传。
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 退款备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
out_order_no与alipay_bill_no二者中至少要传一个
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 退款金额，单位：元
不可超过创单时的金额。
如果scene是TOTAL_FAILURE，则强制要求全额退款，不支持部分退款。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款来源账户。
仅在退款请求对应的业务流水资金已经结算的情况下有用，不指定则不能对已结算业务流水发起退款。
取值可以给定受管控账户2088****************，需要事先在支付宝备案通过方可使用；亦可以填入THIS_ACCOUNT，表示会从当前调用者的账户退款给用户。
	 */
	@ApiField("refund_from")
	private String refundFrom;

	/**
	 * 退款场景，不同场景由不同策略处理。
OVERPAYMENT：退掉用户多支付的金额
PARTIALLY_DONE：业务上部分失败导致退款
TOTAL_FAILURE：完全失败导致的退款
	 */
	@ApiField("scene")
	private String scene;

	public String getAlipayBillNo() {
		return this.alipayBillNo;
	}
	public void setAlipayBillNo(String alipayBillNo) {
		this.alipayBillNo = alipayBillNo;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundFrom() {
		return this.refundFrom;
	}
	public void setRefundFrom(String refundFrom) {
		this.refundFrom = refundFrom;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
