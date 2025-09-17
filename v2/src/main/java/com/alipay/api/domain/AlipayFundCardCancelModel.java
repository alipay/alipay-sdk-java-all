package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景方发起卡作废
 *
 * @author auto create
 * @since 1.0, 2024-05-28 17:47:29
 */
public class AlipayFundCardCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1292769214925826546L;

	/**
	 * 场景码，DEPOSIT_CERT：充值凭证
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 指定卡号作废
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 外部单号，幂等用
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
