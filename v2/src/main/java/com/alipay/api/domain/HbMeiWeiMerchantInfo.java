package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 美味商家信息
 *
 * @author auto create
 * @since 1.0, 2022-08-15 14:29:53
 */
public class HbMeiWeiMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 8554153255196664289L;

	/**
	 * 商户门店logo地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 商家ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 门店信息
	 */
	@ApiListField("shop_list")
	@ApiField("hb_mei_weishop_info")
	private List<HbMeiWeishopInfo> shopList;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public List<HbMeiWeishopInfo> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<HbMeiWeishopInfo> shopList) {
		this.shopList = shopList;
	}

}
