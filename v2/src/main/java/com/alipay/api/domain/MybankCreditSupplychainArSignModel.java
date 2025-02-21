package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赊呗卖家签约
 *
 * @author auto create
 * @since 1.0, 2019-04-11 17:13:05
 */
public class MybankCreditSupplychainArSignModel extends AlipayObject {

	private static final long serialVersionUID = 2765879648968439632L;

	/**
	 * 协议产品码
	 */
	@ApiField("ar_pd_code")
	private String arPdCode;

	/**
	 * 请求幂等控制ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 站点，目前只支持AL
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 场景来源
	 */
	@ApiField("trade_source")
	private String tradeSource;

	public String getArPdCode() {
		return this.arPdCode;
	}
	public void setArPdCode(String arPdCode) {
		this.arPdCode = arPdCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

	public String getTradeSource() {
		return this.tradeSource;
	}
	public void setTradeSource(String tradeSource) {
		this.tradeSource = tradeSource;
	}

}
