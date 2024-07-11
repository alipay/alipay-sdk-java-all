package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子借条用户信息同步
 *
 * @author auto create
 * @since 1.0, 2024-05-24 11:10:55
 */
public class AlipayEcoContractsLoanAuthSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7726192926313375872L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 用户授权状态，true代表同意授权，false代表不同意授权
	 */
	@ApiField("auth_status")
	private Boolean authStatus;

	/**
	 * 免费份额发放时间，时间戳格式，单位为毫秒
	 */
	@ApiField("free_portion_grant_time")
	private Long freePortionGrantTime;

	/**
	 * 免费份额使用时间，时间戳格式，单位为毫秒
	 */
	@ApiField("free_portion_used_time")
	private Long freePortionUsedTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部商户下用户的唯一标识
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 同步请求id，幂等使用
	 */
	@ApiField("sync_request_id")
	private String syncRequestId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Boolean getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(Boolean authStatus) {
		this.authStatus = authStatus;
	}

	public Long getFreePortionGrantTime() {
		return this.freePortionGrantTime;
	}
	public void setFreePortionGrantTime(Long freePortionGrantTime) {
		this.freePortionGrantTime = freePortionGrantTime;
	}

	public Long getFreePortionUsedTime() {
		return this.freePortionUsedTime;
	}
	public void setFreePortionUsedTime(Long freePortionUsedTime) {
		this.freePortionUsedTime = freePortionUsedTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getSyncRequestId() {
		return this.syncRequestId;
	}
	public void setSyncRequestId(String syncRequestId) {
		this.syncRequestId = syncRequestId;
	}

}
