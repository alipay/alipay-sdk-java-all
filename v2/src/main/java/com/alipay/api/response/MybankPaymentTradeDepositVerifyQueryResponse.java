package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.deposit.verify.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:11:55
 */
public class MybankPaymentTradeDepositVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5184552621555776156L;

	/** 
	 * 申请日期，格式是yyyyMMddHHmmss
	 */
	@ApiField("apply_date")
	private String applyDate;

	/** 
	 * 认证申请间隔时间（分钟）
	 */
	@ApiField("apply_interval")
	private Long applyInterval;

	/** 
	 * 打款验证已申请次数
	 */
	@ApiField("apply_times")
	private Long applyTimes;

	/** 
	 * 验款失效日期，格式是yyyyMMddHHmmss
	 */
	@ApiField("match_exp_date")
	private String matchExpDate;

	/** 
	 * 已验款次数
	 */
	@ApiField("match_times")
	private Long matchTimes;

	/** 
	 * 每日最多打款验证申请次数
	 */
	@ApiField("max_apply_times_daily")
	private Long maxApplyTimesDaily;

	/** 
	 * 最多验款次数
	 */
	@ApiField("max_match_times")
	private Long maxMatchTimes;

	/** 
	 * 打款失败原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 打款验证当前状态：
ACCEPT - 已受理
SUCCESS - 验证成功
FAIL - 验证失败
REMITTING - 打款中
REMITTED - 已打款，待验款
REMIT_REFUND - 打款失败（退汇）
REMIT_FAIL - 打款失败
EXPIRED - 申请已过期失效
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 打款验证ID 打款验证受理后生成的一个唯一标识
	 */
	@ApiField("verify_id")
	private String verifyId;

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getApplyDate( ) {
		return this.applyDate;
	}

	public void setApplyInterval(Long applyInterval) {
		this.applyInterval = applyInterval;
	}
	public Long getApplyInterval( ) {
		return this.applyInterval;
	}

	public void setApplyTimes(Long applyTimes) {
		this.applyTimes = applyTimes;
	}
	public Long getApplyTimes( ) {
		return this.applyTimes;
	}

	public void setMatchExpDate(String matchExpDate) {
		this.matchExpDate = matchExpDate;
	}
	public String getMatchExpDate( ) {
		return this.matchExpDate;
	}

	public void setMatchTimes(Long matchTimes) {
		this.matchTimes = matchTimes;
	}
	public Long getMatchTimes( ) {
		return this.matchTimes;
	}

	public void setMaxApplyTimesDaily(Long maxApplyTimesDaily) {
		this.maxApplyTimesDaily = maxApplyTimesDaily;
	}
	public Long getMaxApplyTimesDaily( ) {
		return this.maxApplyTimesDaily;
	}

	public void setMaxMatchTimes(Long maxMatchTimes) {
		this.maxMatchTimes = maxMatchTimes;
	}
	public Long getMaxMatchTimes( ) {
		return this.maxMatchTimes;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}
	public String getVerifyId( ) {
		return this.verifyId;
	}

}
