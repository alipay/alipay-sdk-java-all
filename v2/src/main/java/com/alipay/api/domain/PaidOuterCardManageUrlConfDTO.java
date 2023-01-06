package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付费外卡生命周期管理地址
 *
 * @author auto create
 * @since 1.0, 2022-08-25 18:10:57
 */
public class PaidOuterCardManageUrlConfDTO extends AlipayObject {

	private static final long serialVersionUID = 2379811778297193348L;

	/**
	 * 连续购买管理地址。包括查看当前用户连续购买详情，关闭连续购买等功能
	 */
	@ApiField("cycle_manage_url")
	private String cycleManageUrl;

	/**
	 * 付费外卡降级地址
	 */
	@ApiField("downgrade_url")
	private String downgradeUrl;

	/**
	 * 续费外卡退款地址
	 */
	@ApiField("refund_url")
	private String refundUrl;

	/**
	 * 付费外卡续费地址
	 */
	@ApiField("renew_url")
	private String renewUrl;

	/**
	 * 付费外卡升级地址
	 */
	@ApiField("upgrade_url")
	private String upgradeUrl;

	public String getCycleManageUrl() {
		return this.cycleManageUrl;
	}
	public void setCycleManageUrl(String cycleManageUrl) {
		this.cycleManageUrl = cycleManageUrl;
	}

	public String getDowngradeUrl() {
		return this.downgradeUrl;
	}
	public void setDowngradeUrl(String downgradeUrl) {
		this.downgradeUrl = downgradeUrl;
	}

	public String getRefundUrl() {
		return this.refundUrl;
	}
	public void setRefundUrl(String refundUrl) {
		this.refundUrl = refundUrl;
	}

	public String getRenewUrl() {
		return this.renewUrl;
	}
	public void setRenewUrl(String renewUrl) {
		this.renewUrl = renewUrl;
	}

	public String getUpgradeUrl() {
		return this.upgradeUrl;
	}
	public void setUpgradeUrl(String upgradeUrl) {
		this.upgradeUrl = upgradeUrl;
	}

}
