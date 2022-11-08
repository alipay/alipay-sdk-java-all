package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云店招商报名记录
 *
 * @author auto create
 * @since 1.0, 2022-03-24 13:23:59
 */
public class YunTaskRecruitEnrolledInfo extends AlipayObject {

	private static final long serialVersionUID = 1499412336176662798L;

	/**
	 * 出资方LOGO
	 */
	@ApiField("investor_logo")
	private String investorLogo;

	/**
	 * 任务激励出资方pid
	 */
	@ApiField("investor_pid")
	private String investorPid;

	/**
	 * 招商计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 招商方案名
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 券列表
	 */
	@ApiListField("voucher_templates")
	@ApiField("yun_task_voucher_template_info")
	private List<YunTaskVoucherTemplateInfo> voucherTemplates;

	public String getInvestorLogo() {
		return this.investorLogo;
	}
	public void setInvestorLogo(String investorLogo) {
		this.investorLogo = investorLogo;
	}

	public String getInvestorPid() {
		return this.investorPid;
	}
	public void setInvestorPid(String investorPid) {
		this.investorPid = investorPid;
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

	public List<YunTaskVoucherTemplateInfo> getVoucherTemplates() {
		return this.voucherTemplates;
	}
	public void setVoucherTemplates(List<YunTaskVoucherTemplateInfo> voucherTemplates) {
		this.voucherTemplates = voucherTemplates;
	}

}
