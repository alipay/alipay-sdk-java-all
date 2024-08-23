package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗卖家实时准入风控
 *
 * @author auto create
 * @since 1.0, 2023-02-13 15:00:31
 */
public class AlipayPcreditHuabeiSelleradmitRealtimeCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 3176174332245777597L;

	/**
	 * 支付宝id
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 请求来源应用名
	 */
	@ApiField("from_app")
	private String fromApp;

	/**
	 * 店铺所属行业
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 店铺主营类目，多个逗号分隔
	 */
	@ApiField("main_category")
	private String mainCategory;

	/**
	 * 卖家店铺归属平台
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 卖家准入场景
	 */
	@ApiField("seller_admit_scene")
	private String sellerAdmitScene;

	/**
	 * 卖家店铺id
	 */
	@ApiField("seller_id")
	private String sellerId;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getFromApp() {
		return this.fromApp;
	}
	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getMainCategory() {
		return this.mainCategory;
	}
	public void setMainCategory(String mainCategory) {
		this.mainCategory = mainCategory;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getSellerAdmitScene() {
		return this.sellerAdmitScene;
	}
	public void setSellerAdmitScene(String sellerAdmitScene) {
		this.sellerAdmitScene = sellerAdmitScene;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

}
