package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建资源库标签
 *
 * @author auto create
 * @since 1.0, 2023-05-17 15:06:43
 */
public class AlipayIserviceIsresourceTagmetaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7345234837369743491L;

	/**
	 * 标签名称，业务自定义
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标签名称，租户内唯一，业务方自定义
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签级别，表示标签绑定在那个层级
	 */
	@ApiField("tag_level")
	private String tagLevel;

	/**
	 * 租户，填写固定值CS_HELLOBIKE_MS
	 */
	@ApiField("tenant_instance_id")
	private String tenantInstanceId;

	/**
	 * 值的补充信息，当value_type是ENUM时，必填，格式未json字符串
	 */
	@ApiField("value_comment")
	private String valueComment;

	/**
	 * 值类型，描述标签具体是什么数值类型
	 */
	@ApiField("value_type")
	private String valueType;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagLevel() {
		return this.tagLevel;
	}
	public void setTagLevel(String tagLevel) {
		this.tagLevel = tagLevel;
	}

	public String getTenantInstanceId() {
		return this.tenantInstanceId;
	}
	public void setTenantInstanceId(String tenantInstanceId) {
		this.tenantInstanceId = tenantInstanceId;
	}

	public String getValueComment() {
		return this.valueComment;
	}
	public void setValueComment(String valueComment) {
		this.valueComment = valueComment;
	}

	public String getValueType() {
		return this.valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

}
