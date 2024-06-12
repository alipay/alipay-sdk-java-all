package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户引导配置
 *
 * @author auto create
 * @since 1.0, 2023-09-19 12:03:24
 */
public class CustomerGuide extends AlipayObject {

	private static final long serialVersionUID = 3616273361741772525L;

	/**
	 * 券可用的小程序appId，卡包详情页可跳转到该appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 指定跳转到mini_app_id时的具体页面路径。
	 */
	@ApiField("mini_app_path")
	private String miniAppPath;

	/**
	 * 代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id。接口参数是列表类型。
	 */
	@ApiListField("real_shop_ids")
	@ApiField("string")
	private List<String> realShopIds;

	/**
	 * 小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。
	 */
	@ApiListField("service_codes")
	@ApiField("string")
	private List<String> serviceCodes;

	/**
	 * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id  接口参数是列表类型。
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 该字段后续废弃。券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id。接口参数是列表类型。
	 */
	@ApiListField("store_ids")
	@ApiField("string")
	private List<String> storeIds;

	/**
	 * 券发放引导信息。
	 */
	@ApiField("voucher_send_guide")
	private VoucherSendGuide voucherSendGuide;

	/**
	 * 券核销引导
	 */
	@ApiField("voucher_use_guide")
	private VoucherUseGuide voucherUseGuide;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppPath() {
		return this.miniAppPath;
	}
	public void setMiniAppPath(String miniAppPath) {
		this.miniAppPath = miniAppPath;
	}

	public List<String> getRealShopIds() {
		return this.realShopIds;
	}
	public void setRealShopIds(List<String> realShopIds) {
		this.realShopIds = realShopIds;
	}

	public List<String> getServiceCodes() {
		return this.serviceCodes;
	}
	public void setServiceCodes(List<String> serviceCodes) {
		this.serviceCodes = serviceCodes;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public List<String> getStoreIds() {
		return this.storeIds;
	}
	public void setStoreIds(List<String> storeIds) {
		this.storeIds = storeIds;
	}

	public VoucherSendGuide getVoucherSendGuide() {
		return this.voucherSendGuide;
	}
	public void setVoucherSendGuide(VoucherSendGuide voucherSendGuide) {
		this.voucherSendGuide = voucherSendGuide;
	}

	public VoucherUseGuide getVoucherUseGuide() {
		return this.voucherUseGuide;
	}
	public void setVoucherUseGuide(VoucherUseGuide voucherUseGuide) {
		this.voucherUseGuide = voucherUseGuide;
	}

}
