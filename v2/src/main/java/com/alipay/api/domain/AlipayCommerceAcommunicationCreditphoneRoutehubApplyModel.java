package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用购运营商侧统一申请接口
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class AlipayCommerceAcommunicationCreditphoneRoutehubApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6389169715346354117L;

	/**
	 * 机构PID
	 */
	@ApiField("inst_pid")
	private String instPid;

	/**
	 * 操作类型	
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 运营商侧订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 转支付退款申请明细
	 */
	@ApiField("refund_apply_biz_detail")
	private RefundApplyBizDetail refundApplyBizDetail;

	/**
	 * 单期还款履约明细
	 */
	@ApiField("repayment_apply_biz_detail")
	private RepaymentApplyBizDetail repaymentApplyBizDetail;

	/**
	 * 签约绑定申请明细
	 */
	@ApiField("sign_apply_biz_detail")
	private SignApplyBizDetail signApplyBizDetail;

	/**
	 * 转支付申请明细
	 */
	@ApiField("transfer_apply_biz_detail")
	private TransferApplyBizDetail transferApplyBizDetail;

	/**
	 * 取消绑定明细
	 */
	@ApiField("unbind_apply_biz_detail")
	private UnbindApplyBizDetail unbindApplyBizDetail;

	public String getInstPid() {
		return this.instPid;
	}
	public void setInstPid(String instPid) {
		this.instPid = instPid;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public RefundApplyBizDetail getRefundApplyBizDetail() {
		return this.refundApplyBizDetail;
	}
	public void setRefundApplyBizDetail(RefundApplyBizDetail refundApplyBizDetail) {
		this.refundApplyBizDetail = refundApplyBizDetail;
	}

	public RepaymentApplyBizDetail getRepaymentApplyBizDetail() {
		return this.repaymentApplyBizDetail;
	}
	public void setRepaymentApplyBizDetail(RepaymentApplyBizDetail repaymentApplyBizDetail) {
		this.repaymentApplyBizDetail = repaymentApplyBizDetail;
	}

	public SignApplyBizDetail getSignApplyBizDetail() {
		return this.signApplyBizDetail;
	}
	public void setSignApplyBizDetail(SignApplyBizDetail signApplyBizDetail) {
		this.signApplyBizDetail = signApplyBizDetail;
	}

	public TransferApplyBizDetail getTransferApplyBizDetail() {
		return this.transferApplyBizDetail;
	}
	public void setTransferApplyBizDetail(TransferApplyBizDetail transferApplyBizDetail) {
		this.transferApplyBizDetail = transferApplyBizDetail;
	}

	public UnbindApplyBizDetail getUnbindApplyBizDetail() {
		return this.unbindApplyBizDetail;
	}
	public void setUnbindApplyBizDetail(UnbindApplyBizDetail unbindApplyBizDetail) {
		this.unbindApplyBizDetail = unbindApplyBizDetail;
	}

}
