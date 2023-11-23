package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据交易流水创建企业商户关系
 *
 * @author auto create
 * @since 1.0, 2023-06-06 10:52:51
 */
public class AlipayEbppInvoiceEnterpriseMerchantrelationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8864919695893625274L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 传入操作人员标识
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 门店信息
	 */
	@ApiField("shop_info")
	private EcShopInfo shopInfo;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public EcShopInfo getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(EcShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
