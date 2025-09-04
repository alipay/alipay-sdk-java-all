package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动阶段
 *
 * @author auto create
 * @since 1.0, 2025-08-06 14:57:15
 */
public class ActivityPhase extends AlipayObject {

	private static final long serialVersionUID = 4194868415133992133L;

	/**
	 * 0:无领取；
1:可领取；
2:已领取。
	 */
	@ApiField("award_status")
	private Long awardStatus;

	/**
	 * 阶段序号
	 */
	@ApiField("index")
	private Long index;

	/**
	 * LDP编码
	 */
	@ApiField("ldp_code")
	private String ldpCode;

	/**
	 * 目标计数
	 */
	@ApiField("target_count")
	private Long targetCount;

	public Long getAwardStatus() {
		return this.awardStatus;
	}
	public void setAwardStatus(Long awardStatus) {
		this.awardStatus = awardStatus;
	}

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
	}

	public String getLdpCode() {
		return this.ldpCode;
	}
	public void setLdpCode(String ldpCode) {
		this.ldpCode = ldpCode;
	}

	public Long getTargetCount() {
		return this.targetCount;
	}
	public void setTargetCount(Long targetCount) {
		this.targetCount = targetCount;
	}

}
