package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序灰度上架
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:16:49
 */
public class AlipayOpenMiniVersionGrayOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 3616628696146541918L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

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

	public String getGrayStrategy() {
		return this.grayStrategy;
	}
	public void setGrayStrategy(String grayStrategy) {
		this.grayStrategy = grayStrategy;
	}

}
