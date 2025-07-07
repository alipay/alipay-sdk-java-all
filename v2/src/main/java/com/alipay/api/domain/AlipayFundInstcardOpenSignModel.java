package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户结算卡开户
 *
 * @author auto create
 * @since 1.0, 2021-09-29 15:49:15
 */
public class AlipayFundInstcardOpenSignModel extends AlipayObject {

	private static final long serialVersionUID = 1158497995681448762L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 开户机构信息
	 */
	@ApiField("inst_info")
	private InstInfo instInfo;

	/**
	 * 商户身份信息
	 */
	@ApiField("merchant_info")
	private MerchantIdentityParams merchantInfo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public InstInfo getInstInfo() {
		return this.instInfo;
	}
	public void setInstInfo(InstInfo instInfo) {
		this.instInfo = instInfo;
	}

	public MerchantIdentityParams getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(MerchantIdentityParams merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
