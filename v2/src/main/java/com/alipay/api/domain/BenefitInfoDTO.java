package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-23 13:57:41
 */
public class BenefitInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1777866449418537352L;

	/**
	 * 商户侧权益描述
	 */
	@ApiField("benefit_desc")
	private String benefitDesc;

	/**
	 * 商户侧权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 商户侧权益图片链接
	 */
	@ApiField("benefit_img")
	private String benefitImg;

	/**
	 * 商户侧权益名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 权益状态
※需要用户手动领取时设置“未领取”
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

	public String getBenefitDesc() {
		return this.benefitDesc;
	}
	public void setBenefitDesc(String benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBenefitImg() {
		return this.benefitImg;
	}
	public void setBenefitImg(String benefitImg) {
		this.benefitImg = benefitImg;
	}

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public String getBenefitStatus() {
		return this.benefitStatus;
	}
	public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}

}
