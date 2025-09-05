package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收问卷选项信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:33
 */
public class RecycleOption extends AlipayObject {

	private static final long serialVersionUID = 1782527999382169975L;

	/**
	 * 选项code
	 */
	@ApiField("option_code")
	private String optionCode;

	/**
	 * 选项名称
	 */
	@ApiField("option_name")
	private String optionName;

	/**
	 * 问卷选项关系id
	 */
	@ApiField("relation_id")
	private String relationId;

	public String getOptionCode() {
		return this.optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getOptionName() {
		return this.optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getRelationId() {
		return this.relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

}
