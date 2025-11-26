package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索直达账号模块
 *
 * @author auto create
 * @since 1.0, 2024-08-15 11:28:16
 */
public class SearchBoxAccountModule extends AlipayObject {

	private static final long serialVersionUID = 2428684856714821255L;

	/**
	 * 应用信息列表
	 */
	@ApiListField("app_infos")
	@ApiField("search_box_app_info")
	private List<SearchBoxAppInfo> appInfos;

	/**
	 * 模块配置ID
	 */
	@ApiField("module_id")
	private String moduleId;

	/**
	 * 搜索直达模块类型
	 */
	@ApiField("module_type")
	private String moduleType;

	public List<SearchBoxAppInfo> getAppInfos() {
		return this.appInfos;
	}
	public void setAppInfos(List<SearchBoxAppInfo> appInfos) {
		this.appInfos = appInfos;
	}

	public String getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleType() {
		return this.moduleType;
	}
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

}
