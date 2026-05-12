package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端外渠道ETC设备信息同步
 *
 * @author auto create
 * @since 1.0, 2026-05-09 10:48:33
 */
public class AlipayCommerceTransportEtcSnSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6244474555668669145L;

	/**
	 * etc卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 订单渠道来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * ETC设备发货时间
	 */
	@ApiField("delivery_time")
	private Date deliveryTime;

	/**
	 * ETC设备的序列号
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 合作方身份ID
	 */
	@ApiField("isv_id")
	private String isvId;

	/**
	 * 电商渠道业务订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 电商渠道购买ETC支付完成时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 合作发行方ID,四位发行方id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 店铺业务编码
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 电商店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Date getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getIsvId() {
		return this.isvId;
	}
	public void setIsvId(String isvId) {
		this.isvId = isvId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
