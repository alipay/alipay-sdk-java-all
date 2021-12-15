package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取购特车scheme
 *
 * @author auto create
 * @since 1.0, 2017-09-11 16:39:57
 */
public class KoubeiTradeItemBuyModel extends AlipayObject {

	private static final long serialVersionUID = 6516456946976688962L;

	/**
	 * 预定用户的联系号码。要求合法的手机号码或者座机；该字段仅用于商品预定，商品预定场景为必填字段。如：0579-XXXXXXX；1526XXXXXXX
	 */
	@ApiField("buyer_phone_number")
	private String buyerPhoneNumber;

	/**
	 * 预定的买家用户名称；该字段仅用于商品预定，商品预定场景下为必填字段
	 */
	@ApiField("buyer_user_name")
	private String buyerUserName;

	/**
	 * 手艺人ID，为非必填字段。
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 若无现价则此值传商品原价，交易创建将根据此价格进行售卖。
传入的价格最多可有两位小数，最大值不可超过5000，超过则会报错。
	 */
	@ApiField("current_price")
	private String currentPrice;

	/**
	 * 额外描述信息，比如预定时间信息，需要以“字段1：描述1；字段2：描述2；....“方式传入。标点符号限制集如下,不能传下列标点之外的标点符号：..！.{},:()"[]，。!！,/>"{},:"，?？。!！\[\]]=+_@#$%*
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 原价，传入的价格最多可有两位小数，超过则会报错
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 外部业务流水编号,推荐:yyyymmddhhmmssSSS99999999(年月日时分秒+8位随机码)，开发者可根据该编号与口碑订单一一对应。本订单创建行为的流水ID,用于平台做幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 购买数量，最大传入20，否则下单页会报错
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 预定结束时间；该字段仅用于商品预定，商品预定场景下为非必填字段。
格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("reserve_end_time")
	private String reserveEndTime;

	/**
	 * 预定开始时间；该字段仅用于商品预定，商品预定场景下为必填字段
格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("reserve_start_time")
	private String reserveStartTime;

	/**
	 * 店铺ID，用于后续统计商家各门店的售卖，需传入口碑店铺id，取值规则见FAQ常见问题。https://doc.open.alipay.com/docs/doc.htm?&docType=1&articleId=105746
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getBuyerPhoneNumber() {
		return this.buyerPhoneNumber;
	}
	public void setBuyerPhoneNumber(String buyerPhoneNumber) {
		this.buyerPhoneNumber = buyerPhoneNumber;
	}

	public String getBuyerUserName() {
		return this.buyerUserName;
	}
	public void setBuyerUserName(String buyerUserName) {
		this.buyerUserName = buyerUserName;
	}

	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

	public String getCurrentPrice() {
		return this.currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getReserveEndTime() {
		return this.reserveEndTime;
	}
	public void setReserveEndTime(String reserveEndTime) {
		this.reserveEndTime = reserveEndTime;
	}

	public String getReserveStartTime() {
		return this.reserveStartTime;
	}
	public void setReserveStartTime(String reserveStartTime) {
		this.reserveStartTime = reserveStartTime;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
