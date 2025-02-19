package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流数据同步
 *
 * @author auto create
 * @since 1.0, 2019-12-23 14:47:12
 */
public class AntMerchantExpandLogisticsorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4431217469666494937L;

	/**
	 * 扩展信息（键值对列表，有重复的键后者覆盖前者，建议唯一，以免出现不可预期的结果）
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 预约取件时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("gmt_pick")
	private String gmtPick;

	/**
	 * 货物类型
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 关联主订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 服务商、平台商侧自己的业务订单单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部业务类型，由大写字母以及下划线组成，由支付宝分配
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 物流金额（单位：分）
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 收件详细地址
	 */
	@ApiField("receiver_addr")
	private String receiverAddr;

	/**
	 * 收件地址所在区
	 */
	@ApiField("receiver_area")
	private String receiverArea;

	/**
	 * 收件地址所在市
	 */
	@ApiField("receiver_city")
	private String receiverCity;

	/**
	 * 收件地纬度
	 */
	@ApiField("receiver_latitude")
	private String receiverLatitude;

	/**
	 * 收件地经度
	 */
	@ApiField("receiver_longitude")
	private String receiverLongitude;

	/**
	 * 收件人名称
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件人电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 收件地POI地址
	 */
	@ApiField("receiver_poi_addr")
	private String receiverPoiAddr;

	/**
	 * 收件地址所在省
	 */
	@ApiField("receiver_province")
	private String receiverProvince;

	/**
	 * 收件地街道
	 */
	@ApiField("receiver_street")
	private String receiverStreet;

	/**
	 * 寄件详细地址
	 */
	@ApiField("sender_addr")
	private String senderAddr;

	/**
	 * 寄件地址所在区
	 */
	@ApiField("sender_area")
	private String senderArea;

	/**
	 * 寄件地址所在市
	 */
	@ApiField("sender_city")
	private String senderCity;

	/**
	 * 寄件地纬度
	 */
	@ApiField("sender_latitude")
	private String senderLatitude;

	/**
	 * 寄件地经度
	 */
	@ApiField("sender_longitude")
	private String senderLongitude;

	/**
	 * 寄件人名称
	 */
	@ApiField("sender_name")
	private String senderName;

	/**
	 * 寄件人电话
	 */
	@ApiField("sender_phone")
	private String senderPhone;

	/**
	 * 寄件地POI地址
	 */
	@ApiField("sender_poi_addr")
	private String senderPoiAddr;

	/**
	 * 寄件地址所在省
	 */
	@ApiField("sender_province")
	private String senderProvince;

	/**
	 * 寄件地街道
	 */
	@ApiField("sender_street")
	private String senderStreet;

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getGmtPick() {
		return this.gmtPick;
	}
	public void setGmtPick(String gmtPick) {
		this.gmtPick = gmtPick;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getReceiverAddr() {
		return this.receiverAddr;
	}
	public void setReceiverAddr(String receiverAddr) {
		this.receiverAddr = receiverAddr;
	}

	public String getReceiverArea() {
		return this.receiverArea;
	}
	public void setReceiverArea(String receiverArea) {
		this.receiverArea = receiverArea;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverLatitude() {
		return this.receiverLatitude;
	}
	public void setReceiverLatitude(String receiverLatitude) {
		this.receiverLatitude = receiverLatitude;
	}

	public String getReceiverLongitude() {
		return this.receiverLongitude;
	}
	public void setReceiverLongitude(String receiverLongitude) {
		this.receiverLongitude = receiverLongitude;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverPoiAddr() {
		return this.receiverPoiAddr;
	}
	public void setReceiverPoiAddr(String receiverPoiAddr) {
		this.receiverPoiAddr = receiverPoiAddr;
	}

	public String getReceiverProvince() {
		return this.receiverProvince;
	}
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}

	public String getReceiverStreet() {
		return this.receiverStreet;
	}
	public void setReceiverStreet(String receiverStreet) {
		this.receiverStreet = receiverStreet;
	}

	public String getSenderAddr() {
		return this.senderAddr;
	}
	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

	public String getSenderArea() {
		return this.senderArea;
	}
	public void setSenderArea(String senderArea) {
		this.senderArea = senderArea;
	}

	public String getSenderCity() {
		return this.senderCity;
	}
	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	public String getSenderLatitude() {
		return this.senderLatitude;
	}
	public void setSenderLatitude(String senderLatitude) {
		this.senderLatitude = senderLatitude;
	}

	public String getSenderLongitude() {
		return this.senderLongitude;
	}
	public void setSenderLongitude(String senderLongitude) {
		this.senderLongitude = senderLongitude;
	}

	public String getSenderName() {
		return this.senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderPhone() {
		return this.senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getSenderPoiAddr() {
		return this.senderPoiAddr;
	}
	public void setSenderPoiAddr(String senderPoiAddr) {
		this.senderPoiAddr = senderPoiAddr;
	}

	public String getSenderProvince() {
		return this.senderProvince;
	}
	public void setSenderProvince(String senderProvince) {
		this.senderProvince = senderProvince;
	}

	public String getSenderStreet() {
		return this.senderStreet;
	}
	public void setSenderStreet(String senderStreet) {
		this.senderStreet = senderStreet;
	}

}
