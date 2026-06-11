package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户余额查询
 *
 * @author auto create
 * @since 1.0, 2026-04-01 13:32:45
 */
public class AlipayDataDataserviceAdPrincipaloverviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6127992394885948183L;

	/**
	 * 钱包类型：
通用钱包-INTELLIGENT
外投钱包-XAB_BP
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 资金模式：
共享模式-USER
专享模式-PRINCIPAL
	 */
	@ApiField("charge_mode")
	private String chargeMode;

	/**
	 * 商家标志。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChargeMode() {
		return this.chargeMode;
	}
	public void setChargeMode(String chargeMode) {
		this.chargeMode = chargeMode;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
