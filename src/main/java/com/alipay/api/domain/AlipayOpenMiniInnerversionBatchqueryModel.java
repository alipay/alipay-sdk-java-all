package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序版本信息查询
 *
 * @author auto create
 * @since 1.0, 2019-05-27 19:24:42
 */
public class AlipayOpenMiniInnerversionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7397828343151279232L;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序版本号
	 */
	@ApiListField("version_list")
	@ApiField("mini_app_version_query_info")
	private List<MiniAppVersionQueryInfo> versionList;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public List<MiniAppVersionQueryInfo> getVersionList() {
		return this.versionList;
	}
	public void setVersionList(List<MiniAppVersionQueryInfo> versionList) {
		this.versionList = versionList;
	}

}
