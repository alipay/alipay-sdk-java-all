package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用购ISV统一结果回调接口
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class AlipayCommerceAcommunicationCreditphoneRoutehubCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 8211629123997581759L;

	/**
	 * 结果事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 运营商侧订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款结果回调明细
	 */
	@ApiField("refund_callback_biz_detail")
	private RefundCallbackBizDetail refundCallbackBizDetail;

	/**
	 * 还款结果回调明细
	 */
	@ApiField("repayment_callback_biz_detail")
	private RepaymentCallbackBizDetail repaymentCallbackBizDetail;

	/**
	 * 签约结果明细
	 */
	@ApiField("sign_callback_biz_detail")
	private SignCallbackBizDetail signCallbackBizDetail;

	/**
	 * 代扣结果回调明细
	 */
	@ApiField("transfer_callback_biz_detail")
	private TransferCallbackBizDetail transferCallbackBizDetail;

	/**
	 * 解约结果回调明细
	 */
	@ApiField("unbind_callback_biz_detail")
	private UnbindCallbackBizDetail unbindCallbackBizDetail;

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public RefundCallbackBizDetail getRefundCallbackBizDetail() {
		return this.refundCallbackBizDetail;
	}
	public void setRefundCallbackBizDetail(RefundCallbackBizDetail refundCallbackBizDetail) {
		this.refundCallbackBizDetail = refundCallbackBizDetail;
	}

	public RepaymentCallbackBizDetail getRepaymentCallbackBizDetail() {
		return this.repaymentCallbackBizDetail;
	}
	public void setRepaymentCallbackBizDetail(RepaymentCallbackBizDetail repaymentCallbackBizDetail) {
		this.repaymentCallbackBizDetail = repaymentCallbackBizDetail;
	}

	public SignCallbackBizDetail getSignCallbackBizDetail() {
		return this.signCallbackBizDetail;
	}
	public void setSignCallbackBizDetail(SignCallbackBizDetail signCallbackBizDetail) {
		this.signCallbackBizDetail = signCallbackBizDetail;
	}

	public TransferCallbackBizDetail getTransferCallbackBizDetail() {
		return this.transferCallbackBizDetail;
	}
	public void setTransferCallbackBizDetail(TransferCallbackBizDetail transferCallbackBizDetail) {
		this.transferCallbackBizDetail = transferCallbackBizDetail;
	}

	public UnbindCallbackBizDetail getUnbindCallbackBizDetail() {
		return this.unbindCallbackBizDetail;
	}
	public void setUnbindCallbackBizDetail(UnbindCallbackBizDetail unbindCallbackBizDetail) {
		this.unbindCallbackBizDetail = unbindCallbackBizDetail;
	}

}
