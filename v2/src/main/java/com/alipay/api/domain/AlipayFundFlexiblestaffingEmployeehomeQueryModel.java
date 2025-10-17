package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开卡结果查询
 *
 * @author auto create
 * @since 1.0, 2024-11-18 16:11:28
 */
public class AlipayFundFlexiblestaffingEmployeehomeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1772414919384324487L;

	/**
	 * 协议号，与商户唯一订单号out_biz_no不能同时为空
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商户端唯一订单号，与协议号agreement_no不能同时为空
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
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

}
