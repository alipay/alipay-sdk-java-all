package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益详情
 *
 * @author auto create
 * @since 1.0, 2025-11-06 09:57:31
 */
public class McBenefitInfo extends AlipayObject {

	private static final long serialVersionUID = 3196448773177213279L;

	/**
	 * 权益code
	 */
	@ApiField("benefit_code")
	private String benefitCode;

	/**
	 * 权益过期时间
	 */
	@ApiField("benefit_expire_time")
	private Date benefitExpireTime;

	/**
	 * 权益名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 权益开通时间
	 */
	@ApiField("benefit_open_time")
	private Date benefitOpenTime;

	/**
	 * 权益状态
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

	/**
	 * 权益总次数
	 */
	@ApiField("benefit_total_count")
	private Long benefitTotalCount;

	/**
	 * 权益使用次数
	 */
	@ApiField("benefit_use_count")
	private Long benefitUseCount;

	public String getBenefitCode() {
		return this.benefitCode;
	}
	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}

	public Date getBenefitExpireTime() {
		return this.benefitExpireTime;
	}
	public void setBenefitExpireTime(Date benefitExpireTime) {
		this.benefitExpireTime = benefitExpireTime;
	}

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public Date getBenefitOpenTime() {
		return this.benefitOpenTime;
	}
	public void setBenefitOpenTime(Date benefitOpenTime) {
		this.benefitOpenTime = benefitOpenTime;
	}

	public String getBenefitStatus() {
		return this.benefitStatus;
	}
	public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}

	public Long getBenefitTotalCount() {
		return this.benefitTotalCount;
	}
	public void setBenefitTotalCount(Long benefitTotalCount) {
		this.benefitTotalCount = benefitTotalCount;
	}

	public Long getBenefitUseCount() {
		return this.benefitUseCount;
	}
	public void setBenefitUseCount(Long benefitUseCount) {
		this.benefitUseCount = benefitUseCount;
	}

}
