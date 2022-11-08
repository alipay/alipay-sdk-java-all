package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 招商信息
 *
 * @author auto create
 * @since 1.0, 2022-10-11 17:40:17
 */
public class PlanInfo extends AlipayObject {

	private static final long serialVersionUID = 1266599113449583534L;

	/**
	 * 出资方图片logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 招商方案id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 招商活动名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 券模版信息列表
	 */
	@ApiListField("voucher_template_list")
	@ApiField("yun_task_voucher_template_info")
	private List<YunTaskVoucherTemplateInfo> voucherTemplateList;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public List<YunTaskVoucherTemplateInfo> getVoucherTemplateList() {
		return this.voucherTemplateList;
	}
	public void setVoucherTemplateList(List<YunTaskVoucherTemplateInfo> voucherTemplateList) {
		this.voucherTemplateList = voucherTemplateList;
	}

}
