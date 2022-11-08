package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改可搜索配置
 *
 * @author auto create
 * @since 1.0, 2022-08-05 14:25:14
 */
public class AlipayOpenMiniInnerCansearchModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8521613149342449723L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 配置是否可搜索
	 */
	@ApiField("can_search")
	private Boolean canSearch;

	/**
	 * 开发者id(平替操作员id)
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 操作员id
	 */
	@ApiField("operate_id")
	private String operateId;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public Boolean getCanSearch() {
		return this.canSearch;
	}
	public void setCanSearch(Boolean canSearch) {
		this.canSearch = canSearch;
	}

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOperateId() {
		return this.operateId;
	}
	public void setOperateId(String operateId) {
		this.operateId = operateId;
	}

}
