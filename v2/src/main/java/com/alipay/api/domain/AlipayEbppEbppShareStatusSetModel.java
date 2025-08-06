package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活缴费三方共享状态同步
 *
 * @author auto create
 * @since 1.0, 2025-06-23 18:03:31
 */
public class AlipayEbppEbppShareStatusSetModel extends AlipayObject {

	private static final long serialVersionUID = 1152413654667314427L;

	/**
	 * 主分享人支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 三方流程号
	 */
	@ApiField("out_process_id")
	private String outProcessId;

	/**
	 * 支付宝流水号
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("share_open_id")
	private String shareOpenId;

	/**
	 * 被分享人支付宝UID
	 */
	@ApiField("share_uid")
	private String shareUid;

	/**
	 * 共享权益失效时间
	 */
	@ApiField("share_user_benefit_expire")
	private Date shareUserBenefitExpire;

	/**
	 * 共享权益开始时间
	 */
	@ApiField("share_user_benefit_start")
	private Date shareUserBenefitStart;

	/**
	 * 共享状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 主共享人支付宝UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutProcessId() {
		return this.outProcessId;
	}
	public void setOutProcessId(String outProcessId) {
		this.outProcessId = outProcessId;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getShareOpenId() {
		return this.shareOpenId;
	}
	public void setShareOpenId(String shareOpenId) {
		this.shareOpenId = shareOpenId;
	}

	public String getShareUid() {
		return this.shareUid;
	}
	public void setShareUid(String shareUid) {
		this.shareUid = shareUid;
	}

	public Date getShareUserBenefitExpire() {
		return this.shareUserBenefitExpire;
	}
	public void setShareUserBenefitExpire(Date shareUserBenefitExpire) {
		this.shareUserBenefitExpire = shareUserBenefitExpire;
	}

	public Date getShareUserBenefitStart() {
		return this.shareUserBenefitStart;
	}
	public void setShareUserBenefitStart(Date shareUserBenefitStart) {
		this.shareUserBenefitStart = shareUserBenefitStart;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
