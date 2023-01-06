package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppVersionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.version.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:21:43
 */
public class AlipayOpenMiniVersionListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1428954288872328797L;

	/** 
	 * 版本列表，根据版本号倒叙排列，即版本号大的在前面；如果不存在任何版本，返回空列表
	 */
	@ApiListField("app_version_infos")
	@ApiField("app_version_info")
	private List<AppVersionInfo> appVersionInfos;

	/** 
	 * 小程序支付宝端每个状态的最新版本号列表(历史返回值，已不推荐使用，逐渐废弃)
	 */
	@ApiListField("app_versions")
	@ApiField("string")
	private List<String> appVersions;

	public void setAppVersionInfos(List<AppVersionInfo> appVersionInfos) {
		this.appVersionInfos = appVersionInfos;
	}
	public List<AppVersionInfo> getAppVersionInfos( ) {
		return this.appVersionInfos;
	}

	public void setAppVersions(List<String> appVersions) {
		this.appVersions = appVersions;
	}
	public List<String> getAppVersions( ) {
		return this.appVersions;
	}

}
