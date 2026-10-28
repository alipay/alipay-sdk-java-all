package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-09 17:17:53
 */
public class ObjectItem extends AlipayObject {

	private static final long serialVersionUID = 7579117125572715577L;

	/**
	 * null
	 */
	@ApiListField("biz_object_field_info")
	@ApiField("key_value_fields")
	private List<KeyValueFields> bizObjectFieldInfo;

	/**
	 * 业务对象名称
	 */
	@ApiField("biz_object_name")
	private String bizObjectName;

	/**
	 * 业务对象编号（如69码）
	 */
	@ApiField("biz_object_no")
	private String bizObjectNo;

	public List<KeyValueFields> getBizObjectFieldInfo() {
		return this.bizObjectFieldInfo;
	}
	public void setBizObjectFieldInfo(List<KeyValueFields> bizObjectFieldInfo) {
		this.bizObjectFieldInfo = bizObjectFieldInfo;
	}

	public String getBizObjectName() {
		return this.bizObjectName;
	}
	public void setBizObjectName(String bizObjectName) {
		this.bizObjectName = bizObjectName;
	}

	public String getBizObjectNo() {
		return this.bizObjectNo;
	}
	public void setBizObjectNo(String bizObjectNo) {
		this.bizObjectNo = bizObjectNo;
	}

}
