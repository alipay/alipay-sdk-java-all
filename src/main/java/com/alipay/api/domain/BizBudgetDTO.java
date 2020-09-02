package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁预算DTO
 *
 * @author auto create
 * @since 1.0, 2020-08-31 10:29:46
 */
public class BizBudgetDTO extends AlipayObject {

	private static final long serialVersionUID = 4848742779878832174L;

	/**
	 * 预算业务申请信息
	 */
	@ApiListField("biz_apply_info")
	@ApiField("purchase_apply_info_d_t_o")
	private List<PurchaseApplyInfoDTO> bizApplyInfo;

	/**
	 * 活动预算编码
	 */
	@ApiField("biz_budget_id")
	private String bizBudgetId;

	/**
	 * 活动预算的名称，非用户名，不是敏感字段
	 */
	@ApiField("biz_budget_name")
	private String bizBudgetName;

	public List<PurchaseApplyInfoDTO> getBizApplyInfo() {
		return this.bizApplyInfo;
	}
	public void setBizApplyInfo(List<PurchaseApplyInfoDTO> bizApplyInfo) {
		this.bizApplyInfo = bizApplyInfo;
	}

	public String getBizBudgetId() {
		return this.bizBudgetId;
	}
	public void setBizBudgetId(String bizBudgetId) {
		this.bizBudgetId = bizBudgetId;
	}

	public String getBizBudgetName() {
		return this.bizBudgetName;
	}
	public void setBizBudgetName(String bizBudgetName) {
		this.bizBudgetName = bizBudgetName;
	}

}
