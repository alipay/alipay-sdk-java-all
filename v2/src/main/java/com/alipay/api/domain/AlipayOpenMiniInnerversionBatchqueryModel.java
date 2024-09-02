package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序版本信息查询
 *
 * @author auto create
 * @since 1.0, 2023-01-09 11:43:47
 */
public class AlipayOpenMiniInnerversionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8589473718561795839L;

	/**
	 * 端参数，可不选，默认支付宝端
枚举列举：支付宝：com.alipay.alipaywallet，高德：com.amap.app
	 */
	@ApiField("bundle_id")
	private String bundleId;

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

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

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
