package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * fengdie schema 数据
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:59:38
 */
public class FengdieActivitySchemaModel extends AlipayObject {

	private static final long serialVersionUID = 5429878896151518996L;

	/**
	 * 指定 schema 具体数据， 格式为 schema 数据 JSON 序列化后字符串，参照模板包中 schema_path 同名的 json 文件
	 */
	@ApiField("schema_data")
	private String schemaData;

	/**
	 * schema文件相对模板包根目录的路径，不需要写后缀".schema"
	 */
	@ApiField("schema_path")
	private String schemaPath;

	public String getSchemaData() {
		return this.schemaData;
	}
	public void setSchemaData(String schemaData) {
		this.schemaData = schemaData;
	}

	public String getSchemaPath() {
		return this.schemaPath;
	}
	public void setSchemaPath(String schemaPath) {
		this.schemaPath = schemaPath;
	}

}
