package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索直达商圈模块信息
 *
 * @author auto create
 * @since 1.0, 2023-01-06 10:42:29
 */
public class BoxBusinessDistrictModule extends AlipayObject {

	private static final long serialVersionUID = 4375286318121927184L;

	/**
	 * 商圈选择
	 */
	@ApiListField("business_district_infos")
	@ApiField("box_business_district_info")
	private List<BoxBusinessDistrictInfo> businessDistrictInfos;

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

	public List<BoxBusinessDistrictInfo> getBusinessDistrictInfos() {
		return this.businessDistrictInfos;
	}
	public void setBusinessDistrictInfos(List<BoxBusinessDistrictInfo> businessDistrictInfos) {
		this.businessDistrictInfos = businessDistrictInfos;
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
