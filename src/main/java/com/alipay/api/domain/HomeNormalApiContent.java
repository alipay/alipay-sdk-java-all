package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 详细内容
 *
 * @author auto create
 * @since 1.0, 2020-11-27 13:44:23
 */
public class HomeNormalApiContent extends AlipayObject {

	private static final long serialVersionUID = 8733336735466413331L;

	/**
	 * 毫秒时间戳
	 */
	@ApiField("delivery_time")
	private String deliveryTime;

	/**
	 * 订单跳转链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 如果线下排队，用户是否扫描小票上的二维码
	 */
	@ApiField("is_scan")
	private String isScan;

	/**
	 * 商户详细地址
	 */
	@ApiField("merchant_address")
	private String merchantAddress;

	/**
	 * 商户logo
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 在线点餐地址
	 */
	@ApiField("order_url")
	private String orderUrl;

	/**
	 * 叫号业务填排队码
	 */
	@ApiField("queue_code")
	private String queueCode;

	/**
	 * 排队剩余人数
	 */
	@ApiField("queue_num")
	private String queueNum;

	/**
	 * 排队途径(线上还是线下排队)
	 */
	@ApiField("queue_way")
	private String queueWay;

	/**
	 * 门店的shop_id(唯一)
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getIsScan() {
		return this.isScan;
	}
	public void setIsScan(String isScan) {
		this.isScan = isScan;
	}

	public String getMerchantAddress() {
		return this.merchantAddress;
	}
	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public String getMerchantLogo() {
		return this.merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOrderUrl() {
		return this.orderUrl;
	}
	public void setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl;
	}

	public String getQueueCode() {
		return this.queueCode;
	}
	public void setQueueCode(String queueCode) {
		this.queueCode = queueCode;
	}

	public String getQueueNum() {
		return this.queueNum;
	}
	public void setQueueNum(String queueNum) {
		this.queueNum = queueNum;
	}

	public String getQueueWay() {
		return this.queueWay;
	}
	public void setQueueWay(String queueWay) {
		this.queueWay = queueWay;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
