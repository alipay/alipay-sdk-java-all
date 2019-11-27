package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部链路批量升级接口
 *
 * @author auto create
 * @since 1.0, 2019-11-07 11:18:57
 */
public class AlipayOpenMiniInnerversionBatchUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 6883597834936996941L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 操作者ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 如果策略值选择百分比，则这里写百分比值，如果选择全量升级，则该字段可不用传值
	 */
	@ApiField("strategy_value")
	private String strategyValue;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 升级策略
	 */
	@ApiField("upgrade_strategy")
	private String upgradeStrategy;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getStrategyValue() {
		return this.strategyValue;
	}
	public void setStrategyValue(String strategyValue) {
		this.strategyValue = strategyValue;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getUpgradeStrategy() {
		return this.upgradeStrategy;
	}
	public void setUpgradeStrategy(String upgradeStrategy) {
		this.upgradeStrategy = upgradeStrategy;
	}

}
