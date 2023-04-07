package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景服务删除
 *
 * @author auto create
 * @since 1.0, 2020-03-13 16:21:32
 */
public class AntMerchantExpandStoreShopserviceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1536369658993823756L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 线下店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 场景服务ID
	 */
	@ApiField("shop_service_id")
	private String shopServiceId;

	/**
	 * SKU的ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 线上门店ID，插件协议的入参
	 */
	@ApiField("store_open_id")
	private String storeOpenId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopServiceId() {
		return this.shopServiceId;
	}
	public void setShopServiceId(String shopServiceId) {
		this.shopServiceId = shopServiceId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStoreOpenId() {
		return this.storeOpenId;
	}
	public void setStoreOpenId(String storeOpenId) {
		this.storeOpenId = storeOpenId;
	}

}
