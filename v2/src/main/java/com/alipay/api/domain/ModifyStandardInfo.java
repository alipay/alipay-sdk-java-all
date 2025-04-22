package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 使用规则修改信息
 *
 * @author auto create
 * @since 1.0, 2024-12-24 20:10:18
 */
public class ModifyStandardInfo extends AlipayObject {

	private static final long serialVersionUID = 8617615939917944128L;

	/**
	 * 要添加的条件列表
	 */
	@ApiListField("add_condition_list")
	@ApiField("standard_condition_info")
	private List<StandardConditionInfo> addConditionList;

	/**
	 * 消费模式
	 */
	@ApiField("consume_mode")
	private String consumeMode;

	/**
	 * 待删除的条件id列表
	 */
	@ApiListField("delete_condition_id_list")
	@ApiField("string")
	private List<String> deleteConditionIdList;

	/**
	 * 修改的条件列表
	 */
	@ApiListField("modify_condition_list")
	@ApiField("standard_condition_info")
	private List<StandardConditionInfo> modifyConditionList;

	/**
	 * 使用规则绑定的开票规则id
	 */
	@ApiField("open_rule_id")
	private String openRuleId;

	/**
	 * 支付策略 当笔消费金额大于规则可用余额时，用于控制支付策略。COMBINATION表示支持因公资产和个人资产组合支付，PERSONAL表示整单个人支付。
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 个人收款码转账是否支持因公付。可选值：0（不支持）、1（支持）
	 */
	@ApiField("personal_qrcode_mode")
	private Long personalQrcodeMode;

	/**
	 * 使用规则描述
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 修改的使用规则id
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * 使用规则名称
	 */
	@ApiField("standard_name")
	private String standardName;

	public List<StandardConditionInfo> getAddConditionList() {
		return this.addConditionList;
	}
	public void setAddConditionList(List<StandardConditionInfo> addConditionList) {
		this.addConditionList = addConditionList;
	}

	public String getConsumeMode() {
		return this.consumeMode;
	}
	public void setConsumeMode(String consumeMode) {
		this.consumeMode = consumeMode;
	}

	public List<String> getDeleteConditionIdList() {
		return this.deleteConditionIdList;
	}
	public void setDeleteConditionIdList(List<String> deleteConditionIdList) {
		this.deleteConditionIdList = deleteConditionIdList;
	}

	public List<StandardConditionInfo> getModifyConditionList() {
		return this.modifyConditionList;
	}
	public void setModifyConditionList(List<StandardConditionInfo> modifyConditionList) {
		this.modifyConditionList = modifyConditionList;
	}

	public String getOpenRuleId() {
		return this.openRuleId;
	}
	public void setOpenRuleId(String openRuleId) {
		this.openRuleId = openRuleId;
	}

	public String getPaymentPolicy() {
		return this.paymentPolicy;
	}
	public void setPaymentPolicy(String paymentPolicy) {
		this.paymentPolicy = paymentPolicy;
	}

	public Long getPersonalQrcodeMode() {
		return this.personalQrcodeMode;
	}
	public void setPersonalQrcodeMode(Long personalQrcodeMode) {
		this.personalQrcodeMode = personalQrcodeMode;
	}

	public String getStandardDesc() {
		return this.standardDesc;
	}
	public void setStandardDesc(String standardDesc) {
		this.standardDesc = standardDesc;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getStandardName() {
		return this.standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

}
