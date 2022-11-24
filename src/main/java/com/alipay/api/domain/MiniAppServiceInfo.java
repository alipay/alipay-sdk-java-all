package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序服务信息
 *
 * @author auto create
 * @since 1.0, 2020-07-21 14:38:27
 */
public class MiniAppServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 8417386199859235156L;

	/**
	 * 插件发布状态码，暂存100，风控审核200，运营审核300，等待上架400，已预发上架500，已上架501，已下架600，已驳回700
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 是否是内部标，true/false
	 */
	@ApiField("is_inner")
	private Boolean isInner;

	/**
	 * 是否订购，true/false
	 */
	@ApiField("is_order")
	private Boolean isOrder;

	/**
	 * 三方应用appid
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 应用id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 测试插件
	 */
	@ApiField("mini_app_name")
	private String miniAppName;

	/**
	 * 卖家pid
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 卖家名
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 商品CODE
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务图标
	 */
	@ApiField("service_logo")
	private String serviceLogo;

	/**
	 * 服务名
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务简介
	 */
	@ApiField("service_slogan")
	private String serviceSlogan;

	/**
	 * 是否在服务市场透出，SHOW展示、HIDE隐藏
	 */
	@ApiField("show_type")
	private String showType;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public Boolean getIsInner() {
		return this.isInner;
	}
	public void setIsInner(Boolean isInner) {
		this.isInner = isInner;
	}

	public Boolean getIsOrder() {
		return this.isOrder;
	}
	public void setIsOrder(Boolean isOrder) {
		this.isOrder = isOrder;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppName() {
		return this.miniAppName;
	}
	public void setMiniAppName(String miniAppName) {
		this.miniAppName = miniAppName;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceLogo() {
		return this.serviceLogo;
	}
	public void setServiceLogo(String serviceLogo) {
		this.serviceLogo = serviceLogo;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceSlogan() {
		return this.serviceSlogan;
	}
	public void setServiceSlogan(String serviceSlogan) {
		this.serviceSlogan = serviceSlogan;
	}

	public String getShowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}

}
