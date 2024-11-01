package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心付开通接口
 *
 * @author auto create
 * @since 1.0, 2024-10-25 11:06:55
 */
public class AlipayCommerceMerchantcardOpenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6884371727551682831L;

	/**
	 * 卡类型
	 */
	@ApiListField("card_types")
	@ApiField("string")
	private List<String> cardTypes;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 是否需要代运营授权
	 */
	@ApiField("need_auth")
	private Boolean needAuth;

	/**
	 * 商户id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 价格关联key
	 */
	@ApiListField("price_infos")
	@ApiField("merchant_price_rel_info")
	private List<MerchantPriceRelInfo> priceInfos;

	/**
	 * 资质
	 */
	@ApiField("settle_in_merchant_license")
	private SettleInMerchantLicense settleInMerchantLicense;

	public List<String> getCardTypes() {
		return this.cardTypes;
	}
	public void setCardTypes(List<String> cardTypes) {
		this.cardTypes = cardTypes;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public Boolean getNeedAuth() {
		return this.needAuth;
	}
	public void setNeedAuth(Boolean needAuth) {
		this.needAuth = needAuth;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<MerchantPriceRelInfo> getPriceInfos() {
		return this.priceInfos;
	}
	public void setPriceInfos(List<MerchantPriceRelInfo> priceInfos) {
		this.priceInfos = priceInfos;
	}

	public SettleInMerchantLicense getSettleInMerchantLicense() {
		return this.settleInMerchantLicense;
	}
	public void setSettleInMerchantLicense(SettleInMerchantLicense settleInMerchantLicense) {
		this.settleInMerchantLicense = settleInMerchantLicense;
	}

}
