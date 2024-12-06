package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡模板权益信息
 *
 * @author auto create
 * @since 1.0, 2024-07-04 16:05:52
 */
public class TemplateBenefitInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1513963735174943379L;

	/**
	 * 权益描述信息
	 */
	@ApiListField("benefit_desc")
	@ApiField("string")
	private List<String> benefitDesc;

	/**
	 * 权益结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 权益开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 权益描述
	 */
	@ApiField("title")
	private String title;

	public List<String> getBenefitDesc() {
		return this.benefitDesc;
	}
	public void setBenefitDesc(List<String> benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
