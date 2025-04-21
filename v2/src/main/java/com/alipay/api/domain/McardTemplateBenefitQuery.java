package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益查询结果模型
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:03:56
 */
public class McardTemplateBenefitQuery extends AlipayObject {

	private static final long serialVersionUID = 2111979971196369815L;

	/**
	 * 权益描述信息
	 */
	@ApiField("benefit_desc")
	private String benefitDesc;

	/**
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 权益结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 会员卡模板权益扩展信息：JSON格式; openUrl 说明：跳转到商户的优惠活动页面
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 权益开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 会员卡模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 权益标题
	 */
	@ApiField("title")
	private String title;

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

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
