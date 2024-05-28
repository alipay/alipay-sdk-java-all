package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚁符多维金额查询条件
 *
 * @author auto create
 * @since 1.0, 2024-04-11 16:35:55
 */
public class MultiDimAuthAmountQuery extends AlipayObject {

	private static final long serialVersionUID = 2874499731996132411L;

	/**
	 * 具体的查询的场景信息，如特付查询场景
	 */
	@ApiField("auth_biz_type")
	private String authBizType;

	/**
	 * 查询的具体维度条件
	 */
	@ApiListField("dim_conditions")
	@ApiField("condition_entry")
	private List<ConditionEntry> dimConditions;

	/**
	 * 蚁符具体的规则包编码信息
	 */
	@ApiField("package_code")
	private String packageCode;

	public String getAuthBizType() {
		return this.authBizType;
	}
	public void setAuthBizType(String authBizType) {
		this.authBizType = authBizType;
	}

	public List<ConditionEntry> getDimConditions() {
		return this.dimConditions;
	}
	public void setDimConditions(List<ConditionEntry> dimConditions) {
		this.dimConditions = dimConditions;
	}

	public String getPackageCode() {
		return this.packageCode;
	}
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

}
