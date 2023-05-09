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

	private static final long serialVersionUID = 7844122391495967536L;

	/**
	 * 商圈选择
	 */
	@ApiListField("business_district_infos")
	@ApiField("box_business_district_info")
	private List<BoxBusinessDistrictInfo> businessDistrictInfos;

	/**
	 * 模块ID
	 */
	@ApiField("module_id")
	private String moduleId;

	/**
	 * 搜索直达模块类型，BOX_EXCLUSIVE_BASE-基础信息/BOX_EXCLUSIVE_KEYWORD-关键词/BOX_EXCLUSIVE_FUNCTIONS-功能服务/BOX_EXCLUSIVE_ACCOUNTS-关联账号/BOX_ATMOSPHERE_IMAGE-氛围图/BOX_BUSINESS_DISTRICT-商圈信息/BOX_EXCLUSIVE_AREA_KEYWORD-地域触发词
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
