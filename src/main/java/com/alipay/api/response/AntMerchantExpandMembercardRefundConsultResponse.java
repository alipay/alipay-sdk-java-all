package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberCardRefundDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.membercard.refund.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 18:12:56
 */
public class AntMerchantExpandMembercardRefundConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5668886338792433633L;

	/** 
	 * 退卡明细
	 */
	@ApiListField("details")
	@ApiField("member_card_refund_detail")
	private List<MemberCardRefundDetail> details;

	/** 
	 * 退款总金额
	 */
	@ApiField("refund_total_amount")
	private String refundTotalAmount;

	/** 
	 * 退权益金总金额
	 */
	@ApiField("refund_total_benefit_amount")
	private String refundTotalBenefitAmount;

	/** 
	 * 退优惠总金额
	 */
	@ApiField("refund_total_discount_amount")
	private String refundTotalDiscountAmount;

	/** 
	 * 退券总金额
	 */
	@ApiField("refund_total_voucher_amount")
	private String refundTotalVoucherAmount;

	/** 
	 * 余额
	 */
	@ApiField("total_balance")
	private String totalBalance;

	/** 
	 * 本金余额
	 */
	@ApiField("total_principal_balance")
	private String totalPrincipalBalance;

	public void setDetails(List<MemberCardRefundDetail> details) {
		this.details = details;
	}
	public List<MemberCardRefundDetail> getDetails( ) {
		return this.details;
	}

	public void setRefundTotalAmount(String refundTotalAmount) {
		this.refundTotalAmount = refundTotalAmount;
	}
	public String getRefundTotalAmount( ) {
		return this.refundTotalAmount;
	}

	public void setRefundTotalBenefitAmount(String refundTotalBenefitAmount) {
		this.refundTotalBenefitAmount = refundTotalBenefitAmount;
	}
	public String getRefundTotalBenefitAmount( ) {
		return this.refundTotalBenefitAmount;
	}

	public void setRefundTotalDiscountAmount(String refundTotalDiscountAmount) {
		this.refundTotalDiscountAmount = refundTotalDiscountAmount;
	}
	public String getRefundTotalDiscountAmount( ) {
		return this.refundTotalDiscountAmount;
	}

	public void setRefundTotalVoucherAmount(String refundTotalVoucherAmount) {
		this.refundTotalVoucherAmount = refundTotalVoucherAmount;
	}
	public String getRefundTotalVoucherAmount( ) {
		return this.refundTotalVoucherAmount;
	}

	public void setTotalBalance(String totalBalance) {
		this.totalBalance = totalBalance;
	}
	public String getTotalBalance( ) {
		return this.totalBalance;
	}

	public void setTotalPrincipalBalance(String totalPrincipalBalance) {
		this.totalPrincipalBalance = totalPrincipalBalance;
	}
	public String getTotalPrincipalBalance( ) {
		return this.totalPrincipalBalance;
	}

}
