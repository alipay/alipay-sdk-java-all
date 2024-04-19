package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索直达服务信息模块
 *
 * @author auto create
 * @since 1.0, 2023-07-24 16:33:16
 */
public class SearchBoxServiceModule extends AlipayObject {

	private static final long serialVersionUID = 8284145574498326212L;

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

	/**
	 * 服务信息列表
	 */
	@ApiListField("service_infos")
	@ApiField("search_box_service_info")
	private List<SearchBoxServiceInfo> serviceInfos;

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

	public List<SearchBoxServiceInfo> getServiceInfos() {
		return this.serviceInfos;
	}
	public void setServiceInfos(List<SearchBoxServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;
	}

}
