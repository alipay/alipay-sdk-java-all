package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑定制规则查询接口
 *
 * @author auto create
 * @since 1.0, 2020-09-08 20:53:56
 */
public class KoubeiCateringDishCommruleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3362241454158111552L;

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
	 * 口碑定制组明细id
	 */
	@ApiField("group_detail_id")
	private String groupDetailId;

	/**
	 * 查询页码，表示第几页；兼顾老版本，批量查询不传时默认为1
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小，表示每页查询数量，不超过200；兼容老版本，批量查询不传时默认为200
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 口碑的定制规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 口碑规则定制类型 DISH_PROPERTY_GROUP：菜品属性组 SKU_MATERIAL_GROUP：sku加料组 DISH_PROPERTY_DETAIL：菜品属性明细 SKU_MATERIAL_DETAIL：sku加料明细 DISH_SPEC_GROUP:菜品规格组 DISH_SPEC_DETAIL:菜品规格组标签
	 */
	@ApiField("rule_type")
	private String ruleType;

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

	public String getGroupDetailId() {
		return this.groupDetailId;
	}
	public void setGroupDetailId(String groupDetailId) {
		this.groupDetailId = groupDetailId;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
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

}
