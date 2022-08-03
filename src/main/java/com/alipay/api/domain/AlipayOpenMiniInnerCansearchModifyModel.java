package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改可搜索配置
 *
 * @author auto create
 * @since 1.0, 2022-07-26 14:32:42
 */
public class AlipayOpenMiniInnerCansearchModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5154184547522347584L;

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
