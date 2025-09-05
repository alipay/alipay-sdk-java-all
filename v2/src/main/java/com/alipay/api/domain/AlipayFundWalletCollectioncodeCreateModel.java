package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包收款码链接生成
 *
 * @author auto create
 * @since 1.0, 2024-08-26 11:13:02
 */
public class AlipayFundWalletCollectioncodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4716525386613978916L;

	/**
	 * 回跳链接，从收款码页面回跳的地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 产品码，每一个产品都有属于自己的产品码，这里填的参数必须要和签约场景钱包产品码一致
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户钱包id，用户开通钱包后的钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

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

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
