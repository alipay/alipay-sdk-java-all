package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码门店收单身份信息（包含账号信息）
 *
 * @author auto create
 * @since 1.0, 2025-11-07 11:54:16
 */
public class EcTradeIdentityAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 7885924948772799639L;

	/**
	 * 门店收单在企业码业务场景不可用原因
	 */
	@ApiField("invalid_reason")
	private String invalidReason;

	/**
	 * 门店收单账号对应的脱敏登录ID：直连类型为收单账号对应的登录名称；间连类型为M4认证账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 门店收单对应商户的脱敏名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 门店收单账号可用状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店收单对应的收单PID，直连商户为门店所属PID，间连商户为门店所属SMID
	 */
	@ApiField("trade_pid")
	private String tradePid;

	/**
	 * 门店收单对应的支付宝门店ID
	 */
	@ApiField("trade_shop_id")
	private String tradeShopId;

	/**
	 * 门店收单所属商户对应的类型（直连或间连）
	 */
	@ApiField("type")
	private String type;

	public String getInvalidReason() {
		return this.invalidReason;
	}
	public void setInvalidReason(String invalidReason) {
		this.invalidReason = invalidReason;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradePid() {
		return this.tradePid;
	}
	public void setTradePid(String tradePid) {
		this.tradePid = tradePid;
	}

	public String getTradeShopId() {
		return this.tradeShopId;
	}
	public void setTradeShopId(String tradeShopId) {
		this.tradeShopId = tradeShopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
