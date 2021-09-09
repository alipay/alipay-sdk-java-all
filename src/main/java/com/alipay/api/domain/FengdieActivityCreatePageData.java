package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凤蝶创建H5页面初始化数据
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:17
 */
public class FengdieActivityCreatePageData extends AlipayObject {

	private static final long serialVersionUID = 3492428755916611576L;

	/**
	 * H5应用中页面名称。指定凤蝶开发工具项目中某个H5应用的页面名称。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 指定name页面默认展示的数据。由Schema文件中的路径和展示的数据结构组成，默认模板中Schema文件路径：bgImage/bgImage；默认模板中此参数的数据结构请参考：默认模板-project-components-bglmage-bjlmage.json文件，bjlmage.json文件中的内容可以编辑。注意：展示的数据结构需要和Schema文件中的路径一致。
	 */
	@ApiField("schema_data")
	private String schemaData;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSchemaData() {
		return this.schemaData;
	}
	public void setSchemaData(String schemaData) {
		this.schemaData = schemaData;
	}

}
