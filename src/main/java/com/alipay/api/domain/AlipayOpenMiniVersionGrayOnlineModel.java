package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序灰度上架
 *
 * @author auto create
 * @since 1.0, 2021-07-06 21:31:54
 */
public class AlipayOpenMiniVersionGrayOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 8598849873195341529L;

	/**
	 * 商家小程序版本号，需为审核通过状态的小程序版本。
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序投放的端参数，例如投放到支付宝钱包是支付宝端。默认支付宝端。支持：
com.alipay.alipaywallet:支付宝端；
com.alipay.iot.xpaas：支付宝IoT端。
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序灰度策略值。枚举支持：p10、p30、p50。其中 p10 代表 10% 的用户，p30 代表 30% 的用户，p50 代表 50% 的用户。
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
