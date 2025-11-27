package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取物流业务场景链接
 *
 * @author auto create
 * @since 1.0, 2025-10-22 10:47:40
 */
public class AlipayCommerceLogisticsLinkGetModel extends AlipayObject {

	private static final long serialVersionUID = 6381548629756456199L;

	/**
	 * 小件员和驿站结算的支付宝账号
	 */
	@ApiField("expressman_alipay_logon_id")
	private String expressmanAlipayLogonId;

	/**
	 * 物流产品配置生成，用于标识物流业务场景以及执行的动作
	 */
	@ApiField("logistics_biz_scene_action")
	private String logisticsBizSceneAction;

	/**
	 * 商户传入请求端名称，用于区分商户请求来源
	 */
	@ApiField("merchant_request_source")
	private String merchantRequestSource;

	/**
	 * 物流系统生成，用于标识物流商户驿站唯一编码
	 */
	@ApiField("merchant_station_code")
	private String merchantStationCode;

	/**
	 * 商户传入驿站小件员唯一标识
	 */
	@ApiField("merchant_station_expressman_id")
	private String merchantStationExpressmanId;

	/**
	 * 商户传入驿站名称
	 */
	@ApiField("merchant_station_name")
	private String merchantStationName;

	/**
	 * 商户传入驿站门店唯一标识
	 */
	@ApiField("merchant_station_shop_id")
	private String merchantStationShopId;

	public String getExpressmanAlipayLogonId() {
		return this.expressmanAlipayLogonId;
	}
	public void setExpressmanAlipayLogonId(String expressmanAlipayLogonId) {
		this.expressmanAlipayLogonId = expressmanAlipayLogonId;
	}

	public String getLogisticsBizSceneAction() {
		return this.logisticsBizSceneAction;
	}
	public void setLogisticsBizSceneAction(String logisticsBizSceneAction) {
		this.logisticsBizSceneAction = logisticsBizSceneAction;
	}

	public String getMerchantRequestSource() {
		return this.merchantRequestSource;
	}
	public void setMerchantRequestSource(String merchantRequestSource) {
		this.merchantRequestSource = merchantRequestSource;
	}

	public String getMerchantStationCode() {
		return this.merchantStationCode;
	}
	public void setMerchantStationCode(String merchantStationCode) {
		this.merchantStationCode = merchantStationCode;
	}

	public String getMerchantStationExpressmanId() {
		return this.merchantStationExpressmanId;
	}
	public void setMerchantStationExpressmanId(String merchantStationExpressmanId) {
		this.merchantStationExpressmanId = merchantStationExpressmanId;
	}

	public String getMerchantStationName() {
		return this.merchantStationName;
	}
	public void setMerchantStationName(String merchantStationName) {
		this.merchantStationName = merchantStationName;
	}

	public String getMerchantStationShopId() {
		return this.merchantStationShopId;
	}
	public void setMerchantStationShopId(String merchantStationShopId) {
		this.merchantStationShopId = merchantStationShopId;
	}

}
