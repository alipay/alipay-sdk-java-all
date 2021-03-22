package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益信息
 *
 * @author auto create
 * @since 1.0, 2018-09-19 14:12:57
 */
public class BenefitQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 7716375554784378594L;

	/**
	 * 权益描述
	 */
	@ApiField("benefit_desc")
	private String benefitDesc;

	/**
	 * 权益名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 权益面额
	 */
	@ApiField("beneft_price")
	private String beneftPrice;

	/**
	 * 权益结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 其他信息，为key-value格式，格式为json
	 */
	@ApiField("other_infos")
	private String otherInfos;

	/**
	 * 每人限领数量
	 */
	@ApiField("person_limit")
	private String personLimit;

	/**
	 * 权益开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 总数量
	 */
	@ApiField("total_quantity")
	private String totalQuantity;

	public String getBenefitDesc() {
		return this.benefitDesc;
	}
	public void setBenefitDesc(String benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public String getBeneftPrice() {
		return this.beneftPrice;
	}
	public void setBeneftPrice(String beneftPrice) {
		this.beneftPrice = beneftPrice;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getOtherInfos() {
		return this.otherInfos;
	}
	public void setOtherInfos(String otherInfos) {
		this.otherInfos = otherInfos;
	}

	public String getPersonLimit() {
		return this.personLimit;
	}
	public void setPersonLimit(String personLimit) {
		this.personLimit = personLimit;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTotalQuantity() {
		return this.totalQuantity;
	}
	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
