package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 升级信息
 *
 * @author auto create
 * @since 1.0, 2022-03-29 11:39:46
 */
public class UpgradeInfo extends AlipayObject {

	private static final long serialVersionUID = 7444642287283133933L;

	/**
	 * 升级后
	 */
	@ApiField("upgrade_after")
	private String upgradeAfter;

	/**
	 * 升级前
	 */
	@ApiField("upgrade_before")
	private String upgradeBefore;

	/**
	 * 是否强制升级
	 */
	@ApiField("upgrade_force")
	private Boolean upgradeForce;

	/**
	 * 升级目标
	 */
	@ApiField("upgrade_target")
	private String upgradeTarget;

	public String getUpgradeAfter() {
		return this.upgradeAfter;
	}
	public void setUpgradeAfter(String upgradeAfter) {
		this.upgradeAfter = upgradeAfter;
	}

	public String getUpgradeBefore() {
		return this.upgradeBefore;
	}
	public void setUpgradeBefore(String upgradeBefore) {
		this.upgradeBefore = upgradeBefore;
	}

	public Boolean getUpgradeForce() {
		return this.upgradeForce;
	}
	public void setUpgradeForce(Boolean upgradeForce) {
		this.upgradeForce = upgradeForce;
	}

	public String getUpgradeTarget() {
		return this.upgradeTarget;
	}
	public void setUpgradeTarget(String upgradeTarget) {
		this.upgradeTarget = upgradeTarget;
	}

}
