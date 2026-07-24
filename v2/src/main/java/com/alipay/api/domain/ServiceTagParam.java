package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-12 15:32:55
 */
public class ServiceTagParam extends AlipayObject {

	private static final long serialVersionUID = 2859414673424597678L;

	/**
	 * 服务标签编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 标签元数据说明信息
	 */
	@ApiField("content")
	private String content;

	/**
	 * 服务标签的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务标签的子类
	 */
	@ApiField("sub_type")
	private String subType;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

}
