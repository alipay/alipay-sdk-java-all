package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付吱口令生成
 *
 * @author auto create
 * @since 1.0, 2026-05-11 17:07:45
 */
public class AlipayCommerceLogisticsFreightflowShakecodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1796142832238852127L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 物流编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 需要生成吱口令的url,前缀必须为https://u.alipay.cn/
	 */
	@ApiField("target_url")
	private String targetUrl;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

}
