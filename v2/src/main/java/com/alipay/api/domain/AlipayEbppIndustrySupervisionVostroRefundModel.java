package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户资金原路退回
 *
 * @author auto create
 * @since 1.0, 2024-05-29 17:02:11
 */
public class AlipayEbppIndustrySupervisionVostroRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8888144943877419171L;

	/**
	 * 网商来帐通知对应子户户号，用于原路退校验
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 网商来帐通知对应子户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 退款金额，当前只支持原单全额退.单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 原网商来帐单号（order_no）
	 */
	@ApiField("org_order_no")
	private String orgOrderNo;

	/**
	 * 业务流水号，相同请求幂等返回
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
