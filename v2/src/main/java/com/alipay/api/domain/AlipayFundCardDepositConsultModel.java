package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金卡充值前置咨询接口
 *
 * @author auto create
 * @since 1.0, 2024-07-02 10:30:14
 */
public class AlipayFundCardDepositConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7583318126831574856L;

	/**
	 * 场景码，DEPOSIT_CERT：充值凭证
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 指定卡号咨询
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
