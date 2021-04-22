package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑智慧餐厅精准营销用户人群分组操作接口
 *
 * @author auto create
 * @since 1.0, 2018-04-04 15:13:40
 */
public class KoubeiCateringCrowdgroupConditionSetModel extends AlipayObject {

	private static final long serialVersionUID = 6135538313225138456L;

	/**
	 * 人群规则（创建，更新的时候必填）
	 */
	@ApiListField("condition_model_list")
	@ApiField("condition_item_pattern")
	private List<ConditionItemPattern> conditionModelList;

	/**
	 * isv创建的用户分组id
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 针对用户分组的描述(创建和更新时必填)
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 智慧餐厅用户规则操作创建，删除，查询，更新枚举(CREATE("CREATE", "创建"),DELETE("DELETE", "删除"),RETRIEVE("RETRIEVE", "查询"), UPDATE("UPDATE", "修改"))
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 创建规则人的id号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 智慧餐厅操作人类型，包括("MER", "外部商户")，("MER_OPERATOR", "外部操作员")，("PROVIDER", "外部服务商")，("PROVIDER_STAFF", "外部服务商员工")；不传时默认是MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<ConditionItemPattern> getConditionModelList() {
		return this.conditionModelList;
	}
	public void setConditionModelList(List<ConditionItemPattern> conditionModelList) {
		this.conditionModelList = conditionModelList;
	}

	public String getCrowdGroupId() {
		return this.crowdGroupId;
	}
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
