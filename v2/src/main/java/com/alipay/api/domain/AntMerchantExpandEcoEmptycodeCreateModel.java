package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态空码订单创建
 *
 * @author auto create
 * @since 1.0, 2026-06-17 10:52:31
 */
public class AntMerchantExpandEcoEmptycodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3287986692985842348L;

	/**
	 * 交易平台
	 */
	@ApiField("busi_platform")
	private String busiPlatform;

	/**
	 * 空码包装日期
	 */
	@ApiField("code_pack_date")
	private Date codePackDate;

	/**
	 * 卖家编号，取值方式：卖家编号即可
	 */
	@ApiField("eco_code")
	private String ecoCode;

	/**
	 * 码值url链接(必须是支付宝的码值)
	 */
	@ApiField("qrcode_token")
	private String qrcodeToken;

	/**
	 * 店铺名称，取生态供应商店铺名称即可
	 */
	@ApiField("shop_code")
	private String shopCode;

	public String getBusiPlatform() {
		return this.busiPlatform;
	}
	public void setBusiPlatform(String busiPlatform) {
		this.busiPlatform = busiPlatform;
	}

	public Date getCodePackDate() {
		return this.codePackDate;
	}
	public void setCodePackDate(Date codePackDate) {
		this.codePackDate = codePackDate;
	}

	public String getEcoCode() {
		return this.ecoCode;
	}
	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public String getQrcodeToken() {
		return this.qrcodeToken;
	}
	public void setQrcodeToken(String qrcodeToken) {
		this.qrcodeToken = qrcodeToken;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

}
