package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审批单配置信息模型
 *
 * @author auto create
 * @since 1.0, 2025-06-03 16:17:40
 */
public class ApprovalConfigDTO extends AlipayObject {

	private static final long serialVersionUID = 7445181273184478828L;

	/**
	 * 审批单配置项
	 */
	@ApiListField("approval_config_list")
	@ApiField("approval_configm_item_d_t_o")
	private List<ApprovalConfigmItemDTO> approvalConfigList;

	/**
	 * 配置ID
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * OWNER_PAY：个垫
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * OVERTIME：加班
	 */
	@ApiField("scene_category")
	private String sceneCategory;

	/**
	 * TAKE_AWAY：外卖
	 */
	@ApiField("scene_sub_category")
	private String sceneSubCategory;

	public List<ApprovalConfigmItemDTO> getApprovalConfigList() {
		return this.approvalConfigList;
	}
	public void setApprovalConfigList(List<ApprovalConfigmItemDTO> approvalConfigList) {
		this.approvalConfigList = approvalConfigList;
	}

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getSceneCategory() {
		return this.sceneCategory;
	}
	public void setSceneCategory(String sceneCategory) {
		this.sceneCategory = sceneCategory;
	}

	public String getSceneSubCategory() {
		return this.sceneSubCategory;
	}
	public void setSceneSubCategory(String sceneSubCategory) {
		this.sceneSubCategory = sceneSubCategory;
	}

}
