package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑定制规则
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:31
 */
public class KbdishCommRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 8524249735825935168L;

	/**
	 * 口碑菜品id/口碑skuId/规格的specId,需要和type一一对应
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 绑定的组id
	 */
	@ApiField("comm_group_id")
	private String commGroupId;

	/**
	 * 创建人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 口碑定制组明细id
	 */
	@ApiField("group_detail_id")
	private String groupDetailId;

	/**
	 * 商户的id,可不传
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 规则id,口碑系统生成,  如果是新增操作，设置为空.  如果是修改，可以根据rule_id来修改，也可以根据 biz_id+rule_type+comm_group_id+group_detail_id 来操作
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 口碑规则定制类型 
DISH_PROPERTY_GROUP：菜品属性组
SKU_MATERIAL_GROUP：sku加料组
DISH_PROPERTY_DETAIL：菜品属性明细
SKU_MATERIAL_DETAIL：sku加料明细
DISH_SPEC_GROUP:菜品规格组
DISH_SPEC_DETAIL:菜品规格组标签
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 规则列表
	 */
	@ApiListField("show_rule_list")
	@ApiField("kbdish_comm_rule_show_info")
	private List<KbdishCommRuleShowInfo> showRuleList;

	/**
	 * 同步类型: add 新增;update 修改;del 删除
	 */
	@ApiField("syn_type")
	private String synType;

	/**
	 * 修改人
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCommGroupId() {
		return this.commGroupId;
	}
	public void setCommGroupId(String commGroupId) {
		this.commGroupId = commGroupId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getGroupDetailId() {
		return this.groupDetailId;
	}
	public void setGroupDetailId(String groupDetailId) {
		this.groupDetailId = groupDetailId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public List<KbdishCommRuleShowInfo> getShowRuleList() {
		return this.showRuleList;
	}
	public void setShowRuleList(List<KbdishCommRuleShowInfo> showRuleList) {
		this.showRuleList = showRuleList;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
