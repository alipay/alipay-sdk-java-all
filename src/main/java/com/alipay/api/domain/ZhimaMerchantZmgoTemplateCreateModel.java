package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户创建芝麻GO模板接口
 *
 * @author auto create
 * @since 1.0, 2022-07-22 16:29:56
 */
public class ZhimaMerchantZmgoTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7894896727247131775L;

	/**
	 * 芝麻GO模板的基本信息1配置
	 */
	@ApiField("basic_config")
	private ZMGOBasicConfig basicConfig;

	/**
	 * 芝麻GO模板拓展配置
	 */
	@ApiField("ext_config")
	private ZMGOExtConfig extConfig;

	/**
	 * 芝麻GO模板义务配置，若为承诺模式，必传
	 */
	@ApiField("obligation_config")
	private ZMGOObligationConfig obligationConfig;

	/**
	 * 芝麻GO模板的开通信息配置
	 */
	@ApiField("open_config")
	private ZMGOOpenConfig openConfig;

	/**
	 * 芝麻GO模板的退出信息配置
	 */
	@ApiField("quit_config")
	private ZMGOQuitConfig quitConfig;

	/**
	 * 芝麻GO模板的权利信息配置
	 */
	@ApiField("right_config")
	private ZMGORightConfig rightConfig;

	/**
	 * 芝麻GO模板的结算信息配置
	 */
	@ApiField("settlement_config")
	private ZMGOSettlementConfig settlementConfig;

	public ZMGOBasicConfig getBasicConfig() {
		return this.basicConfig;
	}
	public void setBasicConfig(ZMGOBasicConfig basicConfig) {
		this.basicConfig = basicConfig;
	}

	public ZMGOExtConfig getExtConfig() {
		return this.extConfig;
	}
	public void setExtConfig(ZMGOExtConfig extConfig) {
		this.extConfig = extConfig;
	}

	public ZMGOObligationConfig getObligationConfig() {
		return this.obligationConfig;
	}
	public void setObligationConfig(ZMGOObligationConfig obligationConfig) {
		this.obligationConfig = obligationConfig;
	}

	public ZMGOOpenConfig getOpenConfig() {
		return this.openConfig;
	}
	public void setOpenConfig(ZMGOOpenConfig openConfig) {
		this.openConfig = openConfig;
	}

	public ZMGOQuitConfig getQuitConfig() {
		return this.quitConfig;
	}
	public void setQuitConfig(ZMGOQuitConfig quitConfig) {
		this.quitConfig = quitConfig;
	}

	public ZMGORightConfig getRightConfig() {
		return this.rightConfig;
	}
	public void setRightConfig(ZMGORightConfig rightConfig) {
		this.rightConfig = rightConfig;
	}

	public ZMGOSettlementConfig getSettlementConfig() {
		return this.settlementConfig;
	}
	public void setSettlementConfig(ZMGOSettlementConfig settlementConfig) {
		this.settlementConfig = settlementConfig;
	}

}
