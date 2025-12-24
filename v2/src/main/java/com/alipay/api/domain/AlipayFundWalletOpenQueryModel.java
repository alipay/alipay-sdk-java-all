package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询钱包开通结果
 *
 * @author auto create
 * @since 1.0, 2025-06-17 22:38:52
 */
public class AlipayFundWalletOpenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6733663769566857423L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码，每一个产品都有属于自己的产品码，这里填的参数必须要和签约场景钱包产品码一致
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 钱包模板id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

}
