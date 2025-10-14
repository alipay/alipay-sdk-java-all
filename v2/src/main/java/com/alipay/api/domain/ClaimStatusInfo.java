package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 案件信息
 *
 * @author auto create
 * @since 1.0, 2024-09-19 17:51:07
 */
public class ClaimStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 2352514359335687843L;

	/**
	 * 理赔金额
	 */
	@ApiField("claim_amount")
	private String claimAmount;

	/**
	 * 打款支付宝账户名，案件状态为打款成功时必传
	 */
	@ApiField("pay_account_name")
	private String payAccountName;

	/**
	 * 打款时间，案件状态为打款成功时必传
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 0--退款后快赔追偿
1--理赔中
2--已理赔
3--打款成功
92--理赔失败
	 */
	@ApiField("status")
	private Long status;

	public String getClaimAmount() {
		return this.claimAmount;
	}
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getPayAccountName() {
		return this.payAccountName;
	}
	public void setPayAccountName(String payAccountName) {
		this.payAccountName = payAccountName;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
