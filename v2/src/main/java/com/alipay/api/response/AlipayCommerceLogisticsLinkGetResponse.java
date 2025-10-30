package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.link.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-22 10:47:40
 */
public class AlipayCommerceLogisticsLinkGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2267229832423369296L;

	/** 
	 * 根据请求logistics_wallet_open返回
	 */
	@ApiField("logistics_biz_scene_action")
	private String logisticsBizSceneAction;

	/** 
	 * 标识返回的链接是否加密，true-加密、false-不加密
	 */
	@ApiField("logistics_link_encryption")
	private Boolean logisticsLinkEncryption;

	/** 
	 * 跳转支付宝-我的快递业务场景执行链接
	 */
	@ApiField("logistics_link_url")
	private String logisticsLinkUrl;

	public void setLogisticsBizSceneAction(String logisticsBizSceneAction) {
		this.logisticsBizSceneAction = logisticsBizSceneAction;
	}
	public String getLogisticsBizSceneAction( ) {
		return this.logisticsBizSceneAction;
	}

	public void setLogisticsLinkEncryption(Boolean logisticsLinkEncryption) {
		this.logisticsLinkEncryption = logisticsLinkEncryption;
	}
	public Boolean getLogisticsLinkEncryption( ) {
		return this.logisticsLinkEncryption;
	}

	public void setLogisticsLinkUrl(String logisticsLinkUrl) {
		this.logisticsLinkUrl = logisticsLinkUrl;
	}
	public String getLogisticsLinkUrl( ) {
		return this.logisticsLinkUrl;
	}

}
