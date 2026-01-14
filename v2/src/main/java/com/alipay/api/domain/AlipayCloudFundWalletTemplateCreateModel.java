package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云平台开通钱包产品
 *
 * @author auto create
 * @since 1.0, 2024-07-15 18:14:53
 */
public class AlipayCloudFundWalletTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3138215539746598516L;

	/**
	 * 钱包场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 钱包产品code一般为FUND_TRUSTSHIP
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 钱包名称
	 */
	@ApiField("wallet_template_name")
	private String walletTemplateName;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public String getWalletTemplateName() {
		return this.walletTemplateName;
	}
	public void setWalletTemplateName(String walletTemplateName) {
		this.walletTemplateName = walletTemplateName;
	}

}
