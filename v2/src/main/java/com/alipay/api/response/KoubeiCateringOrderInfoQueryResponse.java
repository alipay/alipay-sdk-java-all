package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbPosOrderDishDetail;
import com.alipay.api.domain.PosBillPayChannel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:05:44
 */
public class KoubeiCateringOrderInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7447473746195279921L;

	/** 
	 * 应收金额，以元为单位，精确到分
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 产品码
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/** 
	 * 业务类型：DINNER-正餐、SNACK-快餐
	 */
	@ApiField("business_type")
	private String businessType;

	/** 
	 * KOUBEI-口碑
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * FOR_HERE("FOR_HERE", "堂食"),
TAKE_OUT("TAKE_OUT", "外卖"),
TO_GO("TO_GO", "外带"),
	 */
	@ApiField("dinner_type")
	private String dinnerType;

	/** 
	 * 菜明细列表，使用 JSONObject.parseArray(dish_details,KbPosOrderDishDetail.class) 获取菜明细模型列表
	 */
	@ApiListField("dish_details")
	@ApiField("kb_pos_order_dish_detail")
	private List<KbPosOrderDishDetail> dishDetails;

	/** 
	 * 扩展信息，使用Map<String,String> extInfo = JSONObject.parseObject(ext_info,Map.class)转换，包含核销模式(key为settleMode，value为RECEIPT接单打款/VERIFY核销打款)，留桌时间或备餐截止时间(key为reserveTime，value为时间戳)，接单超时时间(key为receiptTimeout，value为时间戳)
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 外部门店id
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/** 
	 * 是否享受会员价优惠
	 */
	@ApiField("member_flag")
	private String memberFlag;

	/** 
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 下单方式：
PLATFORM——线上点，SCAN——扫码点
	 */
	@ApiField("order_style")
	private String orderStyle;

	/** 
	 * 用户下单时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_time")
	private Date orderTime;

	/** 
	 * 其他杂费，以元为单位，精确到分
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/** 
	 * 打包费，以元为单位，精确到分
	 */
	@ApiField("packing_amount")
	private String packingAmount;

	/** 
	 * 实付金额，以元为单位，精确到分
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 是一个list列表，value参考对象PosBillPayChannel	支付渠道列表信息，目前只会有一个支付渠道。使用 JSONObject.parseArray(pay_channels,PosBillPayChannel.class)获取
	 */
	@ApiListField("pay_channels")
	@ApiField("pos_bill_pay_channel")
	private List<PosBillPayChannel> payChannels;

	/** 
	 * 就餐人数，int类型
	 */
	@ApiField("people_num")
	private String peopleNum;

	/** 
	 * 实收金额，以元为单位，精确到分
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 服务费，以元为单位，精确到分
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/** 
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 预订开台时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("table_time")
	private Date tableTime;

	/** 
	 * 取餐号码，示例： 桌号：04，令牌：13，取餐号：5100，配送：2018012912312312321（比如饿了么订单号）
	 */
	@ApiField("take_no")
	private String takeNo;

	/** 
	 * 取餐类型：TABLE-桌号，NO-取餐号，NO_BOOK-取餐号（预约），TABLE_BOOK-预约桌号
	 */
	@ApiField("take_style")
	private String takeStyle;

	/** 
	 * 应付金额，以元为单位，精确到分
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/** 
	 * 用户手机号码，1864234324324
	 */
	@ApiField("user_mobile")
	private String userMobile;

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillAmount( ) {
		return this.billAmount;
	}

	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}
	public String getBizProduct( ) {
		return this.bizProduct;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getBusinessType( ) {
		return this.businessType;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setDinnerType(String dinnerType) {
		this.dinnerType = dinnerType;
	}
	public String getDinnerType( ) {
		return this.dinnerType;
	}

	public void setDishDetails(List<KbPosOrderDishDetail> dishDetails) {
		this.dishDetails = dishDetails;
	}
	public List<KbPosOrderDishDetail> getDishDetails( ) {
		return this.dishDetails;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setExternalShopId(String externalShopId) {
		this.externalShopId = externalShopId;
	}
	public String getExternalShopId( ) {
		return this.externalShopId;
	}

	public void setMemberFlag(String memberFlag) {
		this.memberFlag = memberFlag;
	}
	public String getMemberFlag( ) {
		return this.memberFlag;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStyle(String orderStyle) {
		this.orderStyle = orderStyle;
	}
	public String getOrderStyle( ) {
		return this.orderStyle;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getOrderTime( ) {
		return this.orderTime;
	}

	public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}
	public String getOtherAmount( ) {
		return this.otherAmount;
	}

	public void setPackingAmount(String packingAmount) {
		this.packingAmount = packingAmount;
	}
	public String getPackingAmount( ) {
		return this.packingAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPayChannels(List<PosBillPayChannel> payChannels) {
		this.payChannels = payChannels;
	}
	public List<PosBillPayChannel> getPayChannels( ) {
		return this.payChannels;
	}

	public void setPeopleNum(String peopleNum) {
		this.peopleNum = peopleNum;
	}
	public String getPeopleNum( ) {
		return this.peopleNum;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServiceAmount( ) {
		return this.serviceAmount;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setTableTime(Date tableTime) {
		this.tableTime = tableTime;
	}
	public Date getTableTime( ) {
		return this.tableTime;
	}

	public void setTakeNo(String takeNo) {
		this.takeNo = takeNo;
	}
	public String getTakeNo( ) {
		return this.takeNo;
	}

	public void setTakeStyle(String takeStyle) {
		this.takeStyle = takeStyle;
	}
	public String getTakeStyle( ) {
		return this.takeStyle;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public String getTradeAmount( ) {
		return this.tradeAmount;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserMobile( ) {
		return this.userMobile;
	}

}
