package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业变更信息模型
 *
 * @author auto create
 * @since 1.0, 2024-03-01 10:44:17
 */
public class EpChangeInfo extends AlipayObject {

	private static final long serialVersionUID = 5235387863713768869L;

	/**
	 * 订阅的变更监听项
	 */
	@ApiField("change_field_code")
	private String changeFieldCode;

	/**
	 * 变更监听项的中文描述
	 */
	@ApiField("change_field_desc")
	private String changeFieldDesc;

	/**
	 * 变更类型
	 */
	@ApiField("change_type")
	private String changeType;

	/**
	 * 变更后信息
	 */
	@ApiField("new_value")
	private String newValue;

	/**
	 * 变更前信息
	 */
	@ApiField("old_value")
	private String oldValue;

	/**
	 * 数据来源
	 */
	@ApiField("source")
	private String source;

	public String getChangeFieldCode() {
		return this.changeFieldCode;
	}
	public void setChangeFieldCode(String changeFieldCode) {
		this.changeFieldCode = changeFieldCode;
	}

	public String getChangeFieldDesc() {
		return this.changeFieldDesc;
	}
	public void setChangeFieldDesc(String changeFieldDesc) {
		this.changeFieldDesc = changeFieldDesc;
	}

	public String getChangeType() {
		return this.changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getNewValue() {
		return this.newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getOldValue() {
		return this.oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
