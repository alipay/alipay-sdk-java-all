package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付费外卡模版配置
 *
 * @author auto create
 * @since 1.0, 2022-08-25 18:10:57
 */
public class PaidOuterCardTemplateConfDTO extends AlipayObject {

	private static final long serialVersionUID = 8615721599767648934L;

	/**
	 * 连续售卖配置
	 */
	@ApiField("cycle_selling_conf")
	private PaidOuterCardCycleSellConfDTO cycleSellingConf;

	/**
	 * 生命周期管理地址
	 */
	@ApiField("manage_url_conf")
	private PaidOuterCardManageUrlConfDTO manageUrlConf;

	/**
	 * 售卖基础配置
	 */
	@ApiField("open_selling_conf")
	private PaidOuterCardSellingConfDTO openSellingConf;

	public PaidOuterCardCycleSellConfDTO getCycleSellingConf() {
		return this.cycleSellingConf;
	}
	public void setCycleSellingConf(PaidOuterCardCycleSellConfDTO cycleSellingConf) {
		this.cycleSellingConf = cycleSellingConf;
	}

	public PaidOuterCardManageUrlConfDTO getManageUrlConf() {
		return this.manageUrlConf;
	}
	public void setManageUrlConf(PaidOuterCardManageUrlConfDTO manageUrlConf) {
		this.manageUrlConf = manageUrlConf;
	}

	public PaidOuterCardSellingConfDTO getOpenSellingConf() {
		return this.openSellingConf;
	}
	public void setOpenSellingConf(PaidOuterCardSellingConfDTO openSellingConf) {
		this.openSellingConf = openSellingConf;
	}

}
