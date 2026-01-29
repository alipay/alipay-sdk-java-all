package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转帐分佣-授权解约
 *
 * @author auto create
 * @since 1.0, 2025-04-07 17:11:21
 */
public class AlipayFundAllocSignDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4688573934731882113L;

	/**
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 产品码由支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 转帐分佣产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
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

}
