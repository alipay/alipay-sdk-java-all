package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设置门店结算信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 10:08:57
 */
public class AntMerchantExpandAstoreshopSettleAddModel extends AlipayObject {

	private static final long serialVersionUID = 3572991722782796327L;

	/**
	 * 银行卡信息（特殊可选），结算到卡时必填
	 */
	@ApiField("bank_cards")
	private ShopBankCard bankCards;

	/**
	 * 需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiListField("fund_proofs_pic")
	@ApiField("string")
	private List<String> fundProofsPic;

	/**
	 * 资金关系类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiField("legal_back_pic")
	private String legalBackPic;

	/**
	 * 需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiField("legal_front_pic")
	private String legalFrontPic;

	/**
	 * 需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiField("license_pic")
	private String licensePic;

	/**
	 * 是否承诺收单账号信息准确。具体承诺信息可查看<a href="https://gw.alipayobjects.com/os/bmw-prod/922bafa8-a712-4f79-aa32-6f08d7359a5c.docx">门店信息承诺函</a>。 Y 是 N 否
	 */
	@ApiField("promise")
	private String promise;

	/**
	 * 门店结算信息
	 */
	@ApiListField("settle_infos")
	@ApiField("shop_settle_info")
	private List<ShopSettleInfo> settleInfos;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public ShopBankCard getBankCards() {
		return this.bankCards;
	}
	public void setBankCards(ShopBankCard bankCards) {
		this.bankCards = bankCards;
	}

	public List<String> getFundProofsPic() {
		return this.fundProofsPic;
	}
	public void setFundProofsPic(List<String> fundProofsPic) {
		this.fundProofsPic = fundProofsPic;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getLegalBackPic() {
		return this.legalBackPic;
	}
	public void setLegalBackPic(String legalBackPic) {
		this.legalBackPic = legalBackPic;
	}

	public String getLegalFrontPic() {
		return this.legalFrontPic;
	}
	public void setLegalFrontPic(String legalFrontPic) {
		this.legalFrontPic = legalFrontPic;
	}

	public String getLicensePic() {
		return this.licensePic;
	}
	public void setLicensePic(String licensePic) {
		this.licensePic = licensePic;
	}

	public String getPromise() {
		return this.promise;
	}
	public void setPromise(String promise) {
		this.promise = promise;
	}

	public List<ShopSettleInfo> getSettleInfos() {
		return this.settleInfos;
	}
	public void setSettleInfos(List<ShopSettleInfo> settleInfos) {
		this.settleInfos = settleInfos;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
