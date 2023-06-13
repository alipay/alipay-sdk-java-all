package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易支付结果查询
 *
 * @author auto create
 * @since 1.0, 2022-08-25 23:33:17
 */
public class AnttechBlockchainDefinSaasPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5765566872694826628L;

	/**
	 * 外部业务平台原始交易号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 付款方外部业务平台会员ID
	 */
	@ApiField("out_payer_id")
	private ReferenceId outPayerId;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public ReferenceId getOutPayerId() {
		return this.outPayerId;
	}
	public void setOutPayerId(ReferenceId outPayerId) {
		this.outPayerId = outPayerId;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

}
