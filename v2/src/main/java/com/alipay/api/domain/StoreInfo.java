package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 飞猪开店结果返回信息
 *
 * @author auto create
 * @since 1.0, 2020-03-23 20:00:58
 */
public class StoreInfo extends AlipayObject {

	private static final long serialVersionUID = 3463372139248814748L;

	/**
	 * 支付宝品牌ID
	 */
	@ApiField("alipay_brand_id")
	private String alipayBrandId;

	/**
	 * 支付宝运营店ID
	 */
	@ApiField("alipay_shop_id")
	private String alipayShopId;

	/**
	 * 门店小程序列表
	 */
	@ApiField("app_infos")
	private Appinfos appInfos;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 操作类型:
飞猪开店  0
飞猪挂接关系调整 1
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 透传信息
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 飞猪POIID
	 */
	@ApiField("fliggy_poi_id")
	private Long fliggyPoiId;

	/**
	 * 小程序描述
	 */
	@ApiField("mini_app_desc")
	private String miniAppDesc;

	/**
	 * 小程序名称
	 */
	@ApiField("mini_app_name")
	private String miniAppName;

	/**
	 * 主账号ID
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 商户中心门店ID
	 */
	@ApiField("store_id")
	private Long storeId;

	/**
	 * 门店状态
	 */
	@ApiField("store_status")
	private Long storeStatus;

	/**
	 * 子账号ID
	 */
	@ApiField("sub_seller_id")
	private Long subSellerId;

	public String getAlipayBrandId() {
		return this.alipayBrandId;
	}
	public void setAlipayBrandId(String alipayBrandId) {
		this.alipayBrandId = alipayBrandId;
	}

	public String getAlipayShopId() {
		return this.alipayShopId;
	}
	public void setAlipayShopId(String alipayShopId) {
		this.alipayShopId = alipayShopId;
	}

	public Appinfos getAppInfos() {
		return this.appInfos;
	}
	public void setAppInfos(Appinfos appInfos) {
		this.appInfos = appInfos;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public Long getBizType() {
		return this.bizType;
	}
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public Long getFliggyPoiId() {
		return this.fliggyPoiId;
	}
	public void setFliggyPoiId(Long fliggyPoiId) {
		this.fliggyPoiId = fliggyPoiId;
	}

	public String getMiniAppDesc() {
		return this.miniAppDesc;
	}
	public void setMiniAppDesc(String miniAppDesc) {
		this.miniAppDesc = miniAppDesc;
	}

	public String getMiniAppName() {
		return this.miniAppName;
	}
	public void setMiniAppName(String miniAppName) {
		this.miniAppName = miniAppName;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public Long getStoreId() {
		return this.storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Long getStoreStatus() {
		return this.storeStatus;
	}
	public void setStoreStatus(Long storeStatus) {
		this.storeStatus = storeStatus;
	}

	public Long getSubSellerId() {
		return this.subSellerId;
	}
	public void setSubSellerId(Long subSellerId) {
		this.subSellerId = subSellerId;
	}

}
