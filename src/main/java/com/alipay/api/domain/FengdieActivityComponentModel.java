package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凤蝶站点组件model
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:59:38
 */
public class FengdieActivityComponentModel extends AlipayObject {

	private static final long serialVersionUID = 4129591349114827999L;

	/**
	 * 指定组件数据，默认为 schema 默认数据
	 */
	@ApiListField("component_data")
	@ApiField("fengdie_activity_schema_model")
	private List<FengdieActivitySchemaModel> componentData;

	/**
	 * 组件名称，即组件目录下 package.json 文件的 fengdie.name 字段（极少个别模板包fengdie.name和组件文件夹名称不一致，请联系模板开发者修改为一致）
	 */
	@ApiField("name")
	private String name;

	public List<FengdieActivitySchemaModel> getComponentData() {
		return this.componentData;
	}
	public void setComponentData(List<FengdieActivitySchemaModel> componentData) {
		this.componentData = componentData;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
