package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenLogisticsDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.homedeliverylink.auth response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-10 14:47:09
 */
public class AlipayInsSceneEcommerceHomedeliverylinkAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 3871669878476323294L;

	/** 
	 * 行动点描述
	 */
	@ApiField("action_desc")
	private String actionDesc;

	/** 
	 * 行动点副描述
	 */
	@ApiField("action_sub_desc")
	private String actionSubDesc;

	/** 
	 * 授权token
	 */
	@ApiField("authed_token")
	private String authedToken;

	/** 
	 * 寄件url
	 */
	@ApiField("authed_url")
	private String authedUrl;

	/** 
	 * 寄件状态
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/** 
	 * 过期时间
	 */
	@ApiField("expiration")
	private Date expiration;

	/** 
	 * 物流单摘要
	 */
	@ApiField("logistics_digest")
	private InsOpenLogisticsDigestDTO logisticsDigest;

	public void setActionDesc(String actionDesc) {
		this.actionDesc = actionDesc;
	}
	public String getActionDesc( ) {
		return this.actionDesc;
	}

	public void setActionSubDesc(String actionSubDesc) {
		this.actionSubDesc = actionSubDesc;
	}
	public String getActionSubDesc( ) {
		return this.actionSubDesc;
	}

	public void setAuthedToken(String authedToken) {
		this.authedToken = authedToken;
	}
	public String getAuthedToken( ) {
		return this.authedToken;
	}

	public void setAuthedUrl(String authedUrl) {
		this.authedUrl = authedUrl;
	}
	public String getAuthedUrl( ) {
		return this.authedUrl;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getDeliveryStatus( ) {
		return this.deliveryStatus;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Date getExpiration( ) {
		return this.expiration;
	}

	public void setLogisticsDigest(InsOpenLogisticsDigestDTO logisticsDigest) {
		this.logisticsDigest = logisticsDigest;
	}
	public InsOpenLogisticsDigestDTO getLogisticsDigest( ) {
		return this.logisticsDigest;
	}

}
