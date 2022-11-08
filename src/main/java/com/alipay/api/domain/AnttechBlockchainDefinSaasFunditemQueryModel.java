package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链B2B资金服务资金订单查询
 *
 * @author auto create
 * @since 1.0, 2022-08-25 21:00:56
 */
public class AnttechBlockchainDefinSaasFunditemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6726544864698843959L;

	/**
	 * 资金操作类型。CAPTURE(请款);CANCEL(撤销/退款);
	 */
	@ApiField("fund_type")
	private String fundType;

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
	 * 外部请求ID，需要支持部分请款/退款的平台必填
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

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
