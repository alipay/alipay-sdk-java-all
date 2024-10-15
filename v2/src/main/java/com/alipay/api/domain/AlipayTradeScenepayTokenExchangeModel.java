package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付码值交换
 *
 * @author auto create
 * @since 1.0, 2024-06-06 19:52:51
 */
public class AlipayTradeScenepayTokenExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 7376569856261123375L;

	/**
	 * 校园场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 使用的产品对应的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景支付的凭证，有效的场景支付凭证，可以交换出对应的码值
	 */
	@ApiField("scene_pay_token")
	private ScenePayToken scenePayToken;

	/**
	 * 如果卖方是支付宝的直连商户，传入商户PID
	 */
	@ApiField("seller_partner_id")
	private String sellerPartnerId;

	/**
	 * 如果收款方是支付宝间联商户，需要传该值二级商户ID
	 */
	@ApiField("seller_secondary_merchant_id")
	private String sellerSecondaryMerchantId;

	/**
	 * 子场景码
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	/**
	 * 场景支付凭证生成的小程序ID，需要和scene_pay_token生成的小程序ID对应
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public ScenePayToken getScenePayToken() {
		return this.scenePayToken;
	}
	public void setScenePayToken(ScenePayToken scenePayToken) {
		this.scenePayToken = scenePayToken;
	}

	public String getSellerPartnerId() {
		return this.sellerPartnerId;
	}
	public void setSellerPartnerId(String sellerPartnerId) {
		this.sellerPartnerId = sellerPartnerId;
	}

	public String getSellerSecondaryMerchantId() {
		return this.sellerSecondaryMerchantId;
	}
	public void setSellerSecondaryMerchantId(String sellerSecondaryMerchantId) {
		this.sellerSecondaryMerchantId = sellerSecondaryMerchantId;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

}
