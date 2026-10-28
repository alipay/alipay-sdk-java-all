package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告场景文案查询接口
 *
 * @author auto create
 * @since 1.0, 2026-10-22 11:42:57
 */
public class AlipayCommerceMedicalReportCategorytextQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7446191693342593383L;

	/**
	 * 枚举值	描述
REPORT_NOT_FOUND	报告查不到原因说明
	 */
	@ApiField("biz_category")
	private String bizCategory;

	/**
	 * 枚举值	描述
HEALTH_MANAGER_APP	健康管家App渠道
MINI_PROGRAM	小程序渠道
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * 二级业务场景,空取DRM默认子组
	 */
	@ApiField("biz_subcategory")
	private String bizSubcategory;

	/**
	 * 预览配置工单ID
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 标准机构ID
	 */
	@ApiField("org_id")
	private String orgId;

	public String getBizCategory() {
		return this.bizCategory;
	}
	public void setBizCategory(String bizCategory) {
		this.bizCategory = bizCategory;
	}

	public String getBizSceneCode() {
		return this.bizSceneCode;
	}
	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}

	public String getBizSubcategory() {
		return this.bizSubcategory;
	}
	public void setBizSubcategory(String bizSubcategory) {
		this.bizSubcategory = bizSubcategory;
	}

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}
