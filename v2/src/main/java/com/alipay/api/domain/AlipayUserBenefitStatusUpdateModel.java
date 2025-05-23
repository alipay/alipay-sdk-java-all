package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员合作专区权益状态变更接口
 *
 * @author auto create
 * @since 1.0, 2020-08-17 21:20:39
 */
public class AlipayUserBenefitStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8252778892511585255L;

	/**
	 * 权益的ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * YES表示当前操作的是会员3.0权益，NO表示当前操作的是改版之前的权益
	 */
	@ApiField("benefit_new_flag")
	private String benefitNewFlag;

	/**
	 * 1:上线， 0:下线,  2:失效；
上线状态所有人可见，不可编辑；
下线状态白名单可见，可以编辑；
失效状态所有人不可见，不可编辑。
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBenefitNewFlag() {
		return this.benefitNewFlag;
	}
	public void setBenefitNewFlag(String benefitNewFlag) {
		this.benefitNewFlag = benefitNewFlag;
	}

	public String getBenefitStatus() {
		return this.benefitStatus;
	}
	public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}

}
