package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内部链路小程序灰度上架
 *
 * @author auto create
 * @since 1.0, 2021-10-20 17:43:32
 */
public class AlipayOpenMiniInnerversionGrayPublishModel extends AlipayObject {

	private static final long serialVersionUID = 4227752749555855824L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 待邀测应用列表，灰度插件时使用，如无邀测必要请不要传入
	 */
	@ApiListField("beta_app_id_list")
	@ApiField("string")
	private List<String> betaAppIdList;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 灰度值
	 */
	@ApiField("gray_strategy")
	private String grayStrategy;

	/**
	 * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序所属PID
	 */
	@ApiField("pid")
	private String pid;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public List<String> getBetaAppIdList() {
		return this.betaAppIdList;
	}
	public void setBetaAppIdList(List<String> betaAppIdList) {
		this.betaAppIdList = betaAppIdList;
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

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
