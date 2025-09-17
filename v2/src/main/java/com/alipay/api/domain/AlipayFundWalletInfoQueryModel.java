package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包信息查询
 *
 * @author auto create
 * @since 1.0, 2024-10-28 17:24:39
 */
public class AlipayFundWalletInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8542725247986543163L;

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
	 * 用户场景钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

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
