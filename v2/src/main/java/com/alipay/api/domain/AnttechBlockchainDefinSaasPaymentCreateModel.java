package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建交易
 *
 * @author auto create
 * @since 1.0, 2022-08-25 22:24:12
 */
public class AnttechBlockchainDefinSaasPaymentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5693137811724115521L;

	/**
	 * 收单交易，acquire_order和fund_order不能同时为空
	 */
	@ApiField("acquire_order")
	private AcquireOrder acquireOrder;

	/**
	 * 资金模式，SALE销售模式用于即时到账业务；AUTH_CAPTURE预授权模式用于担保交易业务；
	 */
	@ApiField("fund_mode")
	private String fundMode;

	/**
	 * 纯资金交易，充值，转账，提现等。acquire_order和fund_order不能同时为空
	 */
	@ApiField("fund_order")
	private FundOrder fundOrder;

	/**
	 * 交易类型。ACQUIRE 收单业务；DEPOSIT 纯资金充值业务；TRANSFER 纯资金转账业务；WITHDRAW 纯资金提现业务
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部请求ID，可选
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public AcquireOrder getAcquireOrder() {
		return this.acquireOrder;
	}
	public void setAcquireOrder(AcquireOrder acquireOrder) {
		this.acquireOrder = acquireOrder;
	}

	public String getFundMode() {
		return this.fundMode;
	}
	public void setFundMode(String fundMode) {
		this.fundMode = fundMode;
	}

	public FundOrder getFundOrder() {
		return this.fundOrder;
	}
	public void setFundOrder(FundOrder fundOrder) {
		this.fundOrder = fundOrder;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutRequestId() {
		return this.outRequestId;
	}
	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

}
