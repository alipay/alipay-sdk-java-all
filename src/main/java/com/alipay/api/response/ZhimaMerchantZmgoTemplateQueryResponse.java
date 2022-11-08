package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZMGOBasicConfig;
import com.alipay.api.domain.ZMGOExtConfig;
import com.alipay.api.domain.ZMGOObligationConfig;
import com.alipay.api.domain.ZMGOOpenConfig;
import com.alipay.api.domain.ZMGOQuitConfig;
import com.alipay.api.domain.ZMGORightConfig;
import com.alipay.api.domain.ZMGOSettlementConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.zmgo.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-29 17:36:48
 */
public class ZhimaMerchantZmgoTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3684518672849864382L;

	/** 
	 * 芝麻GO模板的基本信息
	 */
	@ApiField("basic_config")
	private ZMGOBasicConfig basicConfig;

	/** 
	 * 芝麻GO模板拓展配置
	 */
	@ApiField("ext_config")
	private ZMGOExtConfig extConfig;

	/** 
	 * 芝麻GO模板义务配置
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

	public void setBasicConfig(ZMGOBasicConfig basicConfig) {
		this.basicConfig = basicConfig;
	}
	public ZMGOBasicConfig getBasicConfig( ) {
		return this.basicConfig;
	}

	public void setExtConfig(ZMGOExtConfig extConfig) {
		this.extConfig = extConfig;
	}
	public ZMGOExtConfig getExtConfig( ) {
		return this.extConfig;
	}

	public void setObligationConfig(ZMGOObligationConfig obligationConfig) {
		this.obligationConfig = obligationConfig;
	}
	public ZMGOObligationConfig getObligationConfig( ) {
		return this.obligationConfig;
	}

	public void setOpenConfig(ZMGOOpenConfig openConfig) {
		this.openConfig = openConfig;
	}
	public ZMGOOpenConfig getOpenConfig( ) {
		return this.openConfig;
	}

	public void setQuitConfig(ZMGOQuitConfig quitConfig) {
		this.quitConfig = quitConfig;
	}
	public ZMGOQuitConfig getQuitConfig( ) {
		return this.quitConfig;
	}

	public void setRightConfig(ZMGORightConfig rightConfig) {
		this.rightConfig = rightConfig;
	}
	public ZMGORightConfig getRightConfig( ) {
		return this.rightConfig;
	}

	public void setSettlementConfig(ZMGOSettlementConfig settlementConfig) {
		this.settlementConfig = settlementConfig;
	}
	public ZMGOSettlementConfig getSettlementConfig( ) {
		return this.settlementConfig;
	}

}
