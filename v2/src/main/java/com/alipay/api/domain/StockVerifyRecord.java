package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证券核对记录
 *
 * @author auto create
 * @since 1.0, 2022-11-29 10:21:48
 */
public class StockVerifyRecord extends AlipayObject {

	private static final long serialVersionUID = 6784335323241716392L;

	/**
	 * 核对不一致-总数
	 */
	@ApiField("diff_count")
	private Long diffCount;

	/**
	 * 核对不一致-相关离线总金额
	 */
	@ApiField("diff_offline_amt")
	private String diffOfflineAmt;

	/**
	 * 核对不一致-相关在线总金额
	 */
	@ApiField("diff_online_amt")
	private String diffOnlineAmt;

	/**
	 * 离线缺数据-总数
	 */
	@ApiField("offline_miss_count")
	private Long offlineMissCount;

	/**
	 * 离线缺数据-相关在线总金额
	 */
	@ApiField("offline_miss_online_amt")
	private String offlineMissOnlineAmt;

	/**
	 * 在线缺失-总数
	 */
	@ApiField("online_miss_count")
	private String onlineMissCount;

	/**
	 * 在线缺失数据-相关离线总金额
	 */
	@ApiField("online_miss_offline_amt")
	private String onlineMissOfflineAmt;

	/**
	 * 成功总金额
	 */
	@ApiField("success_amt")
	private String successAmt;

	/**
	 * 核对成功总数
	 */
	@ApiField("success_count")
	private Long successCount;

	/**
	 * 核对日期
	 */
	@ApiField("verify_date")
	private String verifyDate;

	public Long getDiffCount() {
		return this.diffCount;
	}
	public void setDiffCount(Long diffCount) {
		this.diffCount = diffCount;
	}

	public String getDiffOfflineAmt() {
		return this.diffOfflineAmt;
	}
	public void setDiffOfflineAmt(String diffOfflineAmt) {
		this.diffOfflineAmt = diffOfflineAmt;
	}

	public String getDiffOnlineAmt() {
		return this.diffOnlineAmt;
	}
	public void setDiffOnlineAmt(String diffOnlineAmt) {
		this.diffOnlineAmt = diffOnlineAmt;
	}

	public Long getOfflineMissCount() {
		return this.offlineMissCount;
	}
	public void setOfflineMissCount(Long offlineMissCount) {
		this.offlineMissCount = offlineMissCount;
	}

	public String getOfflineMissOnlineAmt() {
		return this.offlineMissOnlineAmt;
	}
	public void setOfflineMissOnlineAmt(String offlineMissOnlineAmt) {
		this.offlineMissOnlineAmt = offlineMissOnlineAmt;
	}

	public String getOnlineMissCount() {
		return this.onlineMissCount;
	}
	public void setOnlineMissCount(String onlineMissCount) {
		this.onlineMissCount = onlineMissCount;
	}

	public String getOnlineMissOfflineAmt() {
		return this.onlineMissOfflineAmt;
	}
	public void setOnlineMissOfflineAmt(String onlineMissOfflineAmt) {
		this.onlineMissOfflineAmt = onlineMissOfflineAmt;
	}

	public String getSuccessAmt() {
		return this.successAmt;
	}
	public void setSuccessAmt(String successAmt) {
		this.successAmt = successAmt;
	}

	public Long getSuccessCount() {
		return this.successCount;
	}
	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}

	public String getVerifyDate() {
		return this.verifyDate;
	}
	public void setVerifyDate(String verifyDate) {
		this.verifyDate = verifyDate;
	}

}
