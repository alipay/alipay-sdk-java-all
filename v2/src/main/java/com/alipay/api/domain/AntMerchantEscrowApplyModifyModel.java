package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 担保商户签约入驻改卡
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:46:26
 */
public class AntMerchantEscrowApplyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7526512751249913442L;

	/**
	 * 支付宝主单号
	 */
	@ApiField("ant_merchant_order_no")
	private String antMerchantOrderNo;

	/**
	 * 银行卡信息
	 */
	@ApiField("card_info")
	private EscrowSettleCardInfo cardInfo;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 平台ppid
	 */
	@ApiField("platform_partner_id")
	private String platformPartnerId;

	/**
	 * 支付宝用户uid，16位2088
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	public String getAntMerchantOrderNo() {
		return this.antMerchantOrderNo;
	}
	public void setAntMerchantOrderNo(String antMerchantOrderNo) {
		this.antMerchantOrderNo = antMerchantOrderNo;
	}

	public EscrowSettleCardInfo getCardInfo() {
		return this.cardInfo;
	}
	public void setCardInfo(EscrowSettleCardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPlatformPartnerId() {
		return this.platformPartnerId;
	}
	public void setPlatformPartnerId(String platformPartnerId) {
		this.platformPartnerId = platformPartnerId;
	}

	public String getSellerUserId() {
		return this.sellerUserId;
	}
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

}
