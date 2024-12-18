package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学VCC代付订单处理结果通知OPENAPI
 *
 * @author auto create
 * @since 1.0, 2024-11-04 16:11:56
 */
public class AlipayOverseasOpenPoboNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8821239141453747227L;

	/**
	 * 留学VCC代付单收款方信息
	 */
	@ApiField("beneficiary_info")
	private TuitionISVPoboBeneficiaryInfo beneficiaryInfo;

	/**
	 * 留学vcc代付单买家信息
	 */
	@ApiField("buyer_info")
	private TuitionISVPoboBuyerInfo buyerInfo;

	/**
	 * 售后操作申请
	 */
	@ApiField("manual_operation_apply")
	private IndrPoboManualOperationApplyRequestDTO manualOperationApply;

	/**
	 * 留学vcc，代付订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 留学vcc代付单交易信息
	 */
	@ApiField("payment_info")
	private TuitionISVPoboPaymentInfo paymentInfo;

	/**
	 * 留学vcc代付结果
	 */
	@ApiField("payment_result")
	private TuitionISVPoboPaymentResult paymentResult;

	public TuitionISVPoboBeneficiaryInfo getBeneficiaryInfo() {
		return this.beneficiaryInfo;
	}
	public void setBeneficiaryInfo(TuitionISVPoboBeneficiaryInfo beneficiaryInfo) {
		this.beneficiaryInfo = beneficiaryInfo;
	}

	public TuitionISVPoboBuyerInfo getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(TuitionISVPoboBuyerInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public IndrPoboManualOperationApplyRequestDTO getManualOperationApply() {
		return this.manualOperationApply;
	}
	public void setManualOperationApply(IndrPoboManualOperationApplyRequestDTO manualOperationApply) {
		this.manualOperationApply = manualOperationApply;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public TuitionISVPoboPaymentInfo getPaymentInfo() {
		return this.paymentInfo;
	}
	public void setPaymentInfo(TuitionISVPoboPaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public TuitionISVPoboPaymentResult getPaymentResult() {
		return this.paymentResult;
	}
	public void setPaymentResult(TuitionISVPoboPaymentResult paymentResult) {
		this.paymentResult = paymentResult;
	}

}
