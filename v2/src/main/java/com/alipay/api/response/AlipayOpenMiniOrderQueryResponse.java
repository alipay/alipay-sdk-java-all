package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AcceptInfoVO;
import com.alipay.api.domain.AddressInfoVO;
import com.alipay.api.domain.BookingInfoDTO;
import com.alipay.api.domain.ContactInfoVO;
import com.alipay.api.domain.DeliveryDetailInfoVO;
import com.alipay.api.domain.MiniOrderExtInfoVO;
import com.alipay.api.domain.LandingChannelInfoVO;
import com.alipay.api.domain.OrderCancelInfo;
import com.alipay.api.domain.OrderDetailInfoVO;
import com.alipay.api.domain.RefundInfoVO;
import com.alipay.api.domain.RentInfoVO;
import com.alipay.api.domain.MiniOrderAddressInfoDTO;
import com.alipay.api.domain.ShopInfoDTO;
import com.alipay.api.domain.StagePayPlanVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-18 19:07:40
 */
public class AlipayOpenMiniOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7147137775118155698L;

	/** 
	 * 订单受理信息，租赁类型订单且通过快捷下单场景特有
	 */
	@ApiField("accept_info")
	private AcceptInfoVO acceptInfo;

	/** 
	 * 收货地址
	 */
	@ApiField("address_info")
	private AddressInfoVO addressInfo;

	/** 
	 * 酒店预订信息
	 */
	@ApiField("booking_info")
	private BookingInfoDTO bookingInfo;

	/** 
	 * 买家联系人信息，本地生活商品使用
	 */
	@ApiField("contact_info")
	private ContactInfoVO contactInfo;

	/** 
	 * 创建时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private String createTime;

	/** 
	 * 默认退货地址
	 */
	@ApiField("default_receiving_address")
	private AddressInfoVO defaultReceivingAddress;

	/** 
	 * 履约信息
	 */
	@ApiField("delivery_detail")
	private DeliveryDetailInfoVO deliveryDetail;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private MiniOrderExtInfoVO extInfo;

	/** 
	 * 订单来源渠道信息
	 */
	@ApiField("landing_channel_info")
	private LandingChannelInfoVO landingChannelInfo;

	/** 
	 * 订单类型
	 */
	@ApiField("merchant_biz_type")
	private String merchantBizType;

	/** 
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 订单取消信息
	 */
	@ApiField("order_cancel_info")
	private OrderCancelInfo orderCancelInfo;

	/** 
	 * 订单详细数据
	 */
	@ApiField("order_detail")
	private OrderDetailInfoVO orderDetail;

	/** 
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商家自定义订单ID(字符仅支持下划线字母数字，长度小于128个字符）
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 商家小程序对应的订单详情页路径地址
	 */
	@ApiField("path")
	private String path;

	/** 
	 * 确认收货时间
	 */
	@ApiField("receive_time")
	private String receiveTime;

	/** 
	 * 退款信息
	 */
	@ApiField("refund_info")
	private RefundInfoVO refundInfo;

	/** 
	 * 租赁信息
	 */
	@ApiField("rent_info")
	private RentInfoVO rentInfo;

	/** 
	 * 发货地址信息
	 */
	@ApiField("send_address_info")
	private MiniOrderAddressInfoDTO sendAddressInfo;

	/** 
	 * 结算方式
	 */
	@ApiField("settle_type")
	private String settleType;

	/** 
	 * 门店信息
	 */
	@ApiField("shop_info")
	private ShopInfoDTO shopInfo;

	/** 
	 * 阶段付款计划列表
	 */
	@ApiListField("stage_pay_plans")
	@ApiField("stage_pay_plan_v_o")
	private List<StagePayPlanVO> stagePayPlans;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 支付单号，支付成功后会该字段会有值
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAcceptInfo(AcceptInfoVO acceptInfo) {
		this.acceptInfo = acceptInfo;
	}
	public AcceptInfoVO getAcceptInfo( ) {
		return this.acceptInfo;
	}

	public void setAddressInfo(AddressInfoVO addressInfo) {
		this.addressInfo = addressInfo;
	}
	public AddressInfoVO getAddressInfo( ) {
		return this.addressInfo;
	}

	public void setBookingInfo(BookingInfoDTO bookingInfo) {
		this.bookingInfo = bookingInfo;
	}
	public BookingInfoDTO getBookingInfo( ) {
		return this.bookingInfo;
	}

	public void setContactInfo(ContactInfoVO contactInfo) {
		this.contactInfo = contactInfo;
	}
	public ContactInfoVO getContactInfo( ) {
		return this.contactInfo;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime( ) {
		return this.createTime;
	}

	public void setDefaultReceivingAddress(AddressInfoVO defaultReceivingAddress) {
		this.defaultReceivingAddress = defaultReceivingAddress;
	}
	public AddressInfoVO getDefaultReceivingAddress( ) {
		return this.defaultReceivingAddress;
	}

	public void setDeliveryDetail(DeliveryDetailInfoVO deliveryDetail) {
		this.deliveryDetail = deliveryDetail;
	}
	public DeliveryDetailInfoVO getDeliveryDetail( ) {
		return this.deliveryDetail;
	}

	public void setExtInfo(MiniOrderExtInfoVO extInfo) {
		this.extInfo = extInfo;
	}
	public MiniOrderExtInfoVO getExtInfo( ) {
		return this.extInfo;
	}

	public void setLandingChannelInfo(LandingChannelInfoVO landingChannelInfo) {
		this.landingChannelInfo = landingChannelInfo;
	}
	public LandingChannelInfoVO getLandingChannelInfo( ) {
		return this.landingChannelInfo;
	}

	public void setMerchantBizType(String merchantBizType) {
		this.merchantBizType = merchantBizType;
	}
	public String getMerchantBizType( ) {
		return this.merchantBizType;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderCancelInfo(OrderCancelInfo orderCancelInfo) {
		this.orderCancelInfo = orderCancelInfo;
	}
	public OrderCancelInfo getOrderCancelInfo( ) {
		return this.orderCancelInfo;
	}

	public void setOrderDetail(OrderDetailInfoVO orderDetail) {
		this.orderDetail = orderDetail;
	}
	public OrderDetailInfoVO getOrderDetail( ) {
		return this.orderDetail;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getPath( ) {
		return this.path;
	}

	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}
	public String getReceiveTime( ) {
		return this.receiveTime;
	}

	public void setRefundInfo(RefundInfoVO refundInfo) {
		this.refundInfo = refundInfo;
	}
	public RefundInfoVO getRefundInfo( ) {
		return this.refundInfo;
	}

	public void setRentInfo(RentInfoVO rentInfo) {
		this.rentInfo = rentInfo;
	}
	public RentInfoVO getRentInfo( ) {
		return this.rentInfo;
	}

	public void setSendAddressInfo(MiniOrderAddressInfoDTO sendAddressInfo) {
		this.sendAddressInfo = sendAddressInfo;
	}
	public MiniOrderAddressInfoDTO getSendAddressInfo( ) {
		return this.sendAddressInfo;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}
	public String getSettleType( ) {
		return this.settleType;
	}

	public void setShopInfo(ShopInfoDTO shopInfo) {
		this.shopInfo = shopInfo;
	}
	public ShopInfoDTO getShopInfo( ) {
		return this.shopInfo;
	}

	public void setStagePayPlans(List<StagePayPlanVO> stagePayPlans) {
		this.stagePayPlans = stagePayPlans;
	}
	public List<StagePayPlanVO> getStagePayPlans( ) {
		return this.stagePayPlans;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
