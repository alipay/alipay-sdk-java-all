package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV订单信息创建
 *
 * @author auto create
 * @since 1.0, 2024-07-10 15:05:16
 */
public class AntMerchantExpandEcoOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7179854684633614354L;

	/**
	 * 交易平台
	 */
	@ApiField("busi_platform")
	private String busiPlatform;

	/**
	 * 卖家编号，取值方式：卖家编号即可
	 */
	@ApiField("eco_code")
	private String ecoCode;

	/**
	 * 运单号。取值方式是：实际运单号即可
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 下单时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 交易平台订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * osskey数组,将文件上传的返回的osskey一并上传
	 */
	@ApiListField("qrcode_imgs")
	@ApiField("string")
	private List<String> qrcodeImgs;

	/**
	 * 码值url链接(必须是支付宝的码值),数组。取值方式是：用户上传码值链接即可
	 */
	@ApiListField("qrcode_tokens")
	@ApiField("string")
	private List<String> qrcodeTokens;

	/**
	 * 确认收货时间
	 */
	@ApiField("receive_time")
	private Date receiveTime;

	/**
	 * 发货时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 店铺名称，取生态供应商店铺名称即可
	 */
	@ApiField("shop_code")
	private String shopCode;

	public String getBusiPlatform() {
		return this.busiPlatform;
	}
	public void setBusiPlatform(String busiPlatform) {
		this.busiPlatform = busiPlatform;
	}

	public String getEcoCode() {
		return this.ecoCode;
	}
	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public String getExpressNo() {
		return this.expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public List<String> getQrcodeImgs() {
		return this.qrcodeImgs;
	}
	public void setQrcodeImgs(List<String> qrcodeImgs) {
		this.qrcodeImgs = qrcodeImgs;
	}

	public List<String> getQrcodeTokens() {
		return this.qrcodeTokens;
	}
	public void setQrcodeTokens(List<String> qrcodeTokens) {
		this.qrcodeTokens = qrcodeTokens;
	}

	public Date getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public Date getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

}
