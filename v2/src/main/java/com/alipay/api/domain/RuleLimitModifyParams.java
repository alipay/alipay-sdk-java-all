package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 规则编辑参数
 *
 * @author auto create
 * @since 1.0, 2023-08-07 10:33:42
 */
public class RuleLimitModifyParams extends AlipayObject {

	private static final long serialVersionUID = 7779326172298915537L;

	/**
	 * 规则内容集合
	 */
	@ApiListField("limit_list")
	@ApiField("rule_limit_content")
	private List<RuleLimitContent> limitList;

	/**
	 * 规则操作类型，ADD:新增一个商圈门店规则，DELETE：删除商圈下门店规则
	 */
	@ApiField("limit_modify_type")
	private String limitModifyType;

	public List<RuleLimitContent> getLimitList() {
		return this.limitList;
	}
	public void setLimitList(List<RuleLimitContent> limitList) {
		this.limitList = limitList;
	}

	public String getLimitModifyType() {
		return this.limitModifyType;
	}
	public void setLimitModifyType(String limitModifyType) {
		this.limitModifyType = limitModifyType;
	}

}
