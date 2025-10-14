package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上报记录
 *
 * @author auto create
 * @since 1.0, 2024-05-29 22:26:07
 */
public class FeedbackRecord extends AlipayObject {

	private static final long serialVersionUID = 5374564684342721835L;

	/**
	 * 服务编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 标题
	 */
	@ApiField("name")
	private String name;

	/**
	 * 数据类型
	 */
	@ApiField("record_type")
	private String recordType;

	/**
	 * "click"： 点击、
"show"：曝光
	 */
	@ApiField("type_list")
	private String typeList;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getTypeList() {
		return this.typeList;
	}
	public void setTypeList(String typeList) {
		this.typeList = typeList;
	}

}
