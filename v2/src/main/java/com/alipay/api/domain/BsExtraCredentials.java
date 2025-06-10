package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 补充材料
 *
 * @author auto create
 * @since 1.0, 2025-03-25 12:45:38
 */
public class BsExtraCredentials extends AlipayObject {

	private static final long serialVersionUID = 4142761361816633693L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 意愿确认单
	 */
	@ApiField("merchant_confirmation_letter")
	private String merchantConfirmationLetter;

	/**
	 * 是否有充电宝
	 */
	@ApiField("power_bank")
	private Boolean powerBank;

	/**
	 * 充电宝图片
	 */
	@ApiField("power_bank_img")
	private String powerBankImg;

	/**
	 * 资源服务商地推小二联系方式
	 */
	@ApiField("supply_isv_contact_phone_no")
	private String supplyIsvContactPhoneNo;

	/**
	 * 充电宝 Leads 的分层信息
	 */
	@ApiField("supply_isv_leads_level")
	private String supplyIsvLeadsLevel;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getMerchantConfirmationLetter() {
		return this.merchantConfirmationLetter;
	}
	public void setMerchantConfirmationLetter(String merchantConfirmationLetter) {
		this.merchantConfirmationLetter = merchantConfirmationLetter;
	}

	public Boolean getPowerBank() {
		return this.powerBank;
	}
	public void setPowerBank(Boolean powerBank) {
		this.powerBank = powerBank;
	}

	public String getPowerBankImg() {
		return this.powerBankImg;
	}
	public void setPowerBankImg(String powerBankImg) {
		this.powerBankImg = powerBankImg;
	}

	public String getSupplyIsvContactPhoneNo() {
		return this.supplyIsvContactPhoneNo;
	}
	public void setSupplyIsvContactPhoneNo(String supplyIsvContactPhoneNo) {
		this.supplyIsvContactPhoneNo = supplyIsvContactPhoneNo;
	}

	public String getSupplyIsvLeadsLevel() {
		return this.supplyIsvLeadsLevel;
	}
	public void setSupplyIsvLeadsLevel(String supplyIsvLeadsLevel) {
		this.supplyIsvLeadsLevel = supplyIsvLeadsLevel;
	}

}
