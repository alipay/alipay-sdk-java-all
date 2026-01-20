package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链B2B资金服务交易支付
 *
 * @author auto create
 * @since 1.0, 2023-11-22 14:49:31
 */
public class AnttechBlockchainDefinSaasPaymentPayModel extends AlipayObject {

	private static final long serialVersionUID = 4214977894779149661L;

	/**
	 * 支付时间
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 外部业务平台原始交易号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 收款方外部业务平台会员ID
	 */
	@ApiField("out_payee_id")
	private ReferenceId outPayeeId;

	/**
	 * 付款方外部业务平台会员ID
	 */
	@ApiField("out_payer_id")
	private ReferenceId outPayerId;

	/**
	 * 付款明细
	 */
	@ApiField("payer_detail")
	private PayerDetailVO payerDetail;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public Date getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public ReferenceId getOutPayeeId() {
		return this.outPayeeId;
	}
	public void setOutPayeeId(ReferenceId outPayeeId) {
		this.outPayeeId = outPayeeId;
	}

	public ReferenceId getOutPayerId() {
		return this.outPayerId;
	}
	public void setOutPayerId(ReferenceId outPayerId) {
		this.outPayerId = outPayerId;
	}

	public PayerDetailVO getPayerDetail() {
		return this.payerDetail;
	}
	public void setPayerDetail(PayerDetailVO payerDetail) {
		this.payerDetail = payerDetail;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

}
