package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序灰度上架
 *
 * @author auto create
 * @since 1.0, 2020-03-17 17:09:42
 */
public class AlipayOpenMiniVersionGrayOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 8565645767318712599L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序投放的端参数，例如投放到支付宝钱包是支付宝端。该参数可选，默认支付宝端，目前仅支持支付宝端，枚举列举：com.alipay.alipaywallet:支付宝端
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序灰度策略值，支持p10，p30，p50，其中p10代表10%的用户，p30代表30%的用户，p50代表50%的用户
	 */
	@ApiField("gray_strategy")
	private String grayStrategy;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getGrayStrategy() {
		return this.grayStrategy;
	}
	public void setGrayStrategy(String grayStrategy) {
		this.grayStrategy = grayStrategy;
	}

}
