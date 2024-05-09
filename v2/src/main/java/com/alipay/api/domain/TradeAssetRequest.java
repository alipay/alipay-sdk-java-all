package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付资产详情
 *
 * @author auto create
 * @since 1.0, 2024-04-12 14:32:04
 */
public class TradeAssetRequest extends AlipayObject {

	private static final long serialVersionUID = 7647915657978658371L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 资产金额,单位元
	 */
	@ApiField("asset_amount")
	private String assetAmount;

	/**
	 * 资产类型。具体说明如下：
小程序支付：支付宝小程序内创建订单并支付
APP支付：外部商户APP唤起快捷SDK创建订单并支付。
协议支付：用户与商户签署扣款协议后，商户可通过本接口做后续免密代扣操作。
	 */
	@ApiField("asset_code")
	private String assetCode;

	/**
	 * 业务透传信息
	 */
	@ApiField("portable")
	private String portable;

	/**
	 * 支付说明、订单标题
	 */
	@ApiField("subject")
	private String subject;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAssetAmount() {
		return this.assetAmount;
	}
	public void setAssetAmount(String assetAmount) {
		this.assetAmount = assetAmount;
	}

	public String getAssetCode() {
		return this.assetCode;
	}
	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	public String getPortable() {
		return this.portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
