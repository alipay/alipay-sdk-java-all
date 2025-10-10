package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户资金原路退回
 *
 * @author auto create
 * @since 1.0, 2024-06-28 09:58:17
 */
public class AlipayEbppIndustrySupervisionVostroRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6348373958373992426L;

	/**
	 * 来帐通知中对应的入账账户
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 来帐通知中对应的入账账户 在子户账户创建时的子户庄户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 退款金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 不同的业务场景下对应不同的业务规则
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 对应来帐通知接口的「银行侧来账业务单号 order_no 」
	 */
	@ApiField("org_order_no")
	private String orgOrderNo;

	/**
	 * 商户内部生成的本次原路退请求流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOrgOrderNo() {
		return this.orgOrderNo;
	}
	public void setOrgOrderNo(String orgOrderNo) {
		this.orgOrderNo = orgOrderNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

}
