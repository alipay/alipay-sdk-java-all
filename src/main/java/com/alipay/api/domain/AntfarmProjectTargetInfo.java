package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁庄园捐赠项目标的物信息
 *
 * @author auto create
 * @since 1.0, 2021-06-23 19:03:06
 */
public class AntfarmProjectTargetInfo extends AlipayObject {

	private static final long serialVersionUID = 1362416894523718333L;

	/**
	 * 标的物当前捐赠的数量
	 */
	@ApiField("current_donation_count")
	private Long currentDonationCount;

	/**
	 * 捐赠标的物 id
	 */
	@ApiField("donation_target_id")
	private String donationTargetId;

	/**
	 * 捐赠标的物名称
	 */
	@ApiField("donation_target_name")
	private String donationTargetName;

	/**
	 * 标的物额度
	 */
	@ApiField("quota")
	private Long quota;

	public Long getCurrentDonationCount() {
		return this.currentDonationCount;
	}
	public void setCurrentDonationCount(Long currentDonationCount) {
		this.currentDonationCount = currentDonationCount;
	}

	public String getDonationTargetId() {
		return this.donationTargetId;
	}
	public void setDonationTargetId(String donationTargetId) {
		this.donationTargetId = donationTargetId;
	}

	public String getDonationTargetName() {
		return this.donationTargetName;
	}
	public void setDonationTargetName(String donationTargetName) {
		this.donationTargetName = donationTargetName;
	}

	public Long getQuota() {
		return this.quota;
	}
	public void setQuota(Long quota) {
		this.quota = quota;
	}

}
