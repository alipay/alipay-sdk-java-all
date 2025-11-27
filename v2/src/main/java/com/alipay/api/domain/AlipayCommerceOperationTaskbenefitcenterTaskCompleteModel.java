package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 完成任务通知
 *
 * @author auto create
 * @since 1.0, 2025-10-23 13:57:41
 */
public class AlipayCommerceOperationTaskbenefitcenterTaskCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 6496925384467631557L;

	/**
	 * null
	 */
	@ApiListField("benefit_list")
	@ApiField("benefit_info_d_t_o")
	private List<BenefitInfoDTO> benefitList;

	/**
	 * 任务CODE
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 任务模板CODE
	 */
	@ApiField("task_template_code")
	private String taskTemplateCode;

	/**
	 * 用户唯一标识
※支付宝跳转到商户页面的链接会拼接上该参数
	 */
	@ApiField("user_unique_code")
	private String userUniqueCode;

	public List<BenefitInfoDTO> getBenefitList() {
		return this.benefitList;
	}
	public void setBenefitList(List<BenefitInfoDTO> benefitList) {
		this.benefitList = benefitList;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskTemplateCode() {
		return this.taskTemplateCode;
	}
	public void setTaskTemplateCode(String taskTemplateCode) {
		this.taskTemplateCode = taskTemplateCode;
	}

	public String getUserUniqueCode() {
		return this.userUniqueCode;
	}
	public void setUserUniqueCode(String userUniqueCode) {
		this.userUniqueCode = userUniqueCode;
	}

}
