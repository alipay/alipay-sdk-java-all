package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡模板外部权益
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:03:06
 */
public class McardTemplateBenefit extends AlipayObject {

	private static final long serialVersionUID = 7687465932947668537L;

	/**
	 * 权益描述信息
	 */
	@ApiListField("benefit_desc")
	@ApiField("string")
	private List<String> benefitDesc;

	/**
	 * 权益结束时间。
注：在权益开始时间和结束时间范围内的权益才会认为是有效权益进行展示。
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
