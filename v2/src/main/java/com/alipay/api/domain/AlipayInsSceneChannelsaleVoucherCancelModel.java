package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证失效
 *
 * @author auto create
 * @since 1.0, 2024-07-04 15:45:12
 */
public class AlipayInsSceneChannelsaleVoucherCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1622162533122659697L;

	/**
	 * 渠道商户ID，蚂蚁保分配
	 */
	@ApiField("channel_merchant_id")
	private String channelMerchantId;

	/**
	 * 失效原因
	 */
	@ApiField("invalid_reason")
	private String invalidReason;

	/**
	 * 合作商ID，由蚂蚁保分配
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 凭证编码，发放凭证接口返回
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getChannelMerchantId() {
		return this.channelMerchantId;
	}
	public void setChannelMerchantId(String channelMerchantId) {
		this.channelMerchantId = channelMerchantId;
	}

	public String getInvalidReason() {
		return this.invalidReason;
	}
	public void setInvalidReason(String invalidReason) {
		this.invalidReason = invalidReason;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
