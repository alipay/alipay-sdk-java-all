package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销信息
 *
 * @author auto create
 * @since 1.0, 2023-12-05 18:48:35
 */
public class VoucherVerifyInfo extends AlipayObject {

	private static final long serialVersionUID = 7134429422687242133L;

	/**
	 * 卡号，例如年卡卡号
年卡商品时，此字段必填
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 有效期，例如年卡有效期至2023-10-01 00:00:00
年卡商品时，此字段必填
	 */
	@ApiField("expiry_date")
	private Date expiryDate;

	/**
	 * 外部商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部凭证id
	 */
	@ApiField("out_voucher_id")
	private String outVoucherId;

	/**
	 * 服务链接地址
年卡商品时，此字段必填
	 */
	@ApiField("service_link_url")
	private String serviceLinkUrl;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutVoucherId() {
		return this.outVoucherId;
	}
	public void setOutVoucherId(String outVoucherId) {
		this.outVoucherId = outVoucherId;
	}

	public String getServiceLinkUrl() {
		return this.serviceLinkUrl;
	}
	public void setServiceLinkUrl(String serviceLinkUrl) {
		this.serviceLinkUrl = serviceLinkUrl;
	}

}
