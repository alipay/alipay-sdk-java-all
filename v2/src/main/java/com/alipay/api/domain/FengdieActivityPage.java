package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凤蝶H5应用中的页面
 *
 * @author auto create
 * @since 1.0, 2019-01-02 11:20:19
 */
public class FengdieActivityPage extends AlipayObject {

	private static final long serialVersionUID = 3798541972267871588L;

	/**
	 * H5页面唯一id，创建H5应用时自动生成
	 */
	@ApiField("id")
	private Long id;

	/**
	 * H5页面名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * H5页面schema数据
	 */
	@ApiListField("schema")
	@ApiField("fengdie_activity_schema_data")
	private List<FengdieActivitySchemaData> schema;

	/**
	 * H5页面预览图
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * H5页面中文标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * H5页面访问地址
	 */
	@ApiField("url")
	private String url;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<FengdieActivitySchemaData> getSchema() {
		return this.schema;
	}
	public void setSchema(List<FengdieActivitySchemaData> schema) {
		this.schema = schema;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
