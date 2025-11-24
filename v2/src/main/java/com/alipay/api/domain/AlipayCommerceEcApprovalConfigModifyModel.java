package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审批单配置创建
 *
 * @author auto create
 * @since 1.0, 2025-06-03 16:17:40
 */
public class AlipayCommerceEcApprovalConfigModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3425276358547784483L;

	/**
	 * 审批单配置项
	 */
	@ApiListField("approval_config_list")
	@ApiField("approval_configm_item_d_t_o")
	private List<ApprovalConfigmItemDTO> approvalConfigList;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 二级场景
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

	/**
	 * 支付类型
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 一级场景
	 */
	@ApiField("scene")
	private String scene;

	public List<ApprovalConfigmItemDTO> getApprovalConfigList() {
		return this.approvalConfigList;
	}
	public void setApprovalConfigList(List<ApprovalConfigmItemDTO> approvalConfigList) {
		this.approvalConfigList = approvalConfigList;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getExpenseTypeSubCategory() {
		return this.expenseTypeSubCategory;
	}
	public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
		this.expenseTypeSubCategory = expenseTypeSubCategory;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
