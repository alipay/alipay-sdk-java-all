package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索直达账号模块
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:29:03
 */
public class SearchBoxAccountModule extends AlipayObject {

	private static final long serialVersionUID = 5196823784969728315L;

	/**
	 * 应用信息列表
	 */
	@ApiListField("app_infos")
	@ApiField("search_box_app_info")
	private List<SearchBoxAppInfo> appInfos;

	/**
	 * 模块ID
	 */
	@ApiField("module_id")
	private String moduleId;

	/**
	 * 搜索直达模块类型，BOX_EXCLUSIVE_BASE-基础信息/BOX_EXCLUSIVE_KEYWORD-关键词/BOX_EXCLUSIVE_FUNCTIONS-功能服务/BOX_EXCLUSIVE_ACCOUNTS-关联账号/BOX_ATMOSPHERE_IMAGE-氛围图
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
