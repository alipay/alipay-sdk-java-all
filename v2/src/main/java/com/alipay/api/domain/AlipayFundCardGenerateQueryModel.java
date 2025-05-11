package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景方查询制卡单据信息
 *
 * @author auto create
 * @since 1.0, 2024-05-28 17:47:47
 */
public class AlipayFundCardGenerateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3375463865971919892L;

	/**
	 * 场景码，DEPOSIT_CERT：充值凭证
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 接收制卡请求落地之后的返回的支付宝制卡单号，条件必填二选一
	 */
	@ApiField("fund_card_generate_no")
	private String fundCardGenerateNo;

	/**
	 * 外部单号，幂等用，条件必填二选一
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

	public String getFundCardGenerateNo() {
		return this.fundCardGenerateNo;
	}
	public void setFundCardGenerateNo(String fundCardGenerateNo) {
		this.fundCardGenerateNo = fundCardGenerateNo;
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
