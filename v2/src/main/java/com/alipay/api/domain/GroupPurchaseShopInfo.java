package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 团购业务店铺信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class GroupPurchaseShopInfo extends AlipayObject {

	private static final long serialVersionUID = 7643196963573796621L;

	/**
	 * 店铺银行卡信息
	 */
	@ApiListField("bank_cards")
	@ApiField("group_purchase_bank_card")
	private List<GroupPurchaseBankCard> bankCards;

	/**
	 * 品牌id，通过BP站品牌工具箱可以获取品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 经营类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 主营类目编码
	 */
	@ApiListField("main_business_category")
	@ApiField("string")
	private List<String> mainBusinessCategory;

	/**
	 * 经营模式
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 类目资质组合列表
	 */
	@ApiListField("qualification_combines")
	@ApiField("category_qualification_combine_info")
	private List<CategoryQualificationCombineInfo> qualificationCombines;

	/**
	 * 店铺结算信息
	 */
	@ApiListField("settle_infos")
	@ApiField("group_purchase_settle_info")
	private List<GroupPurchaseSettleInfo> settleInfos;

	/**
	 * 门店信息
	 */
	@ApiListField("shop_models")
	@ApiField("group_purchase_shop_model")
	private List<GroupPurchaseShopModel> shopModels;

	/**
	 * 商家店铺ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 店铺名字
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 店铺类型
	 */
	@ApiField("store_type")
	private String storeType;

	public List<GroupPurchaseBankCard> getBankCards() {
		return this.bankCards;
	}
	public void setBankCards(List<GroupPurchaseBankCard> bankCards) {
		this.bankCards = bankCards;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public List<String> getMainBusinessCategory() {
		return this.mainBusinessCategory;
	}
	public void setMainBusinessCategory(List<String> mainBusinessCategory) {
		this.mainBusinessCategory = mainBusinessCategory;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public List<CategoryQualificationCombineInfo> getQualificationCombines() {
		return this.qualificationCombines;
	}
	public void setQualificationCombines(List<CategoryQualificationCombineInfo> qualificationCombines) {
		this.qualificationCombines = qualificationCombines;
	}

	public List<GroupPurchaseSettleInfo> getSettleInfos() {
		return this.settleInfos;
	}
	public void setSettleInfos(List<GroupPurchaseSettleInfo> settleInfos) {
		this.settleInfos = settleInfos;
	}

	public List<GroupPurchaseShopModel> getShopModels() {
		return this.shopModels;
	}
	public void setShopModels(List<GroupPurchaseShopModel> shopModels) {
		this.shopModels = shopModels;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreType() {
		return this.storeType;
	}
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

}
