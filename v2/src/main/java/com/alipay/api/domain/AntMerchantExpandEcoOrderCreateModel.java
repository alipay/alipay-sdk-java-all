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
 * @since 1.0, 2025-09-09 19:10:21
 */
public class AntMerchantExpandEcoOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1551844677461762845L;

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
	 * 数组，商品图片file_key，就是在订单上传之前需要先上传订单对应的商品图片，上传成功之后返回的oss_key
	 */
	@ApiListField("product_image_file_keys")
	@ApiField("string")
	private List<String> productImageFileKeys;

	/**
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 商品规格
	 */
	@ApiField("product_specifications")
	private String productSpecifications;

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

	/**
	 * nfc线圈的tag_id
	 */
	@ApiListField("tag_ids")
	@ApiField("string")
	private List<String> tagIds;

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

	public List<String> getProductImageFileKeys() {
		return this.productImageFileKeys;
	}
	public void setProductImageFileKeys(List<String> productImageFileKeys) {
		this.productImageFileKeys = productImageFileKeys;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductSpecifications() {
		return this.productSpecifications;
	}
	public void setProductSpecifications(String productSpecifications) {
		this.productSpecifications = productSpecifications;
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

	public List<String> getTagIds() {
		return this.tagIds;
	}
	public void setTagIds(List<String> tagIds) {
		this.tagIds = tagIds;
	}

}
