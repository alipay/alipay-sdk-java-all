package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约状态变更接口
 *
 * @author auto create
 * @since 1.0, 2025-08-07 19:10:40
 */
public class AlipayOpenMiniOrderDeliveryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2899663542544362887L;

	/**
	 * 需要修改的活动信息列表
	 */
	@ApiListField("activity_infos")
	@ApiField("activity_info_modify_d_t_o")
	private List<ActivityInfoModifyDTO> activityInfos;

	/**
	 * 收货地址
	 */
	@ApiField("address_info")
	private MiniReceiverAddressInfoDTO addressInfo;

	/**
	 * 履约属性扩展信息
	 */
	@ApiListField("attr_ext_info_list")
	@ApiField("attr_ext_info_d_t_o")
	private List<AttrExtInfoDTO> attrExtInfoList;

	/**
	 * 酒店预订信息
	 */
	@ApiField("booking_info")
	private BookingInfoDTO bookingInfo;

	/**
	 * 联系人信息
	 */
	@ApiField("contact_info")
	private ContactInfoDTO contactInfo;

	/**
	 * 商品修改信息
	 */
	@ApiListField("item_infos")
	@ApiField("goods_info_modify_d_t_o")
	private List<GoodsInfoModifyDTO> itemInfos;

	/**
	 * 买家open_id；open_id和user_id二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号；order_id和out_order_id二选一
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单质检金额，单位：元
	 */
	@ApiField("order_inspect_price")
	private String orderInspectPrice;

	/**
	 * 商户订单号，创建订单请求由商户传入；order_id和out_order_id二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 订单价格修改信息
	 */
	@ApiField("price_info")
	private PriceInfoModifyDTO priceInfo;

	/**
	 * 履约原因编码，特指拒绝场景下的原因
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 派单联系人信息
	 */
	@ApiField("send_order_contact_info")
	private SendOrderContactInfoDTO sendOrderContactInfo;

	/**
	 * 订单的履约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 需要修改的票务信息列表
	 */
	@ApiListField("ticket_infos")
	@ApiField("ticket_info_modify_d_t_o")
	private List<TicketInfoModifyDTO> ticketInfos;

	/**
	 * 出游信息
	 */
	@ApiField("tour_info")
	private TourInfoDTO tourInfo;

	/**
	 * 用户确认金额，单位：元
	 */
	@ApiField("user_confirm_price")
	private String userConfirmPrice;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/mini/05dxgc?pathHash=1a3ecb13">用户授权</a>; 其它场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/open/284/web">网页授权获取用户信息</a>。
	 */
	@ApiField("user_id")
	private String userId;

	public List<ActivityInfoModifyDTO> getActivityInfos() {
		return this.activityInfos;
	}
	public void setActivityInfos(List<ActivityInfoModifyDTO> activityInfos) {
		this.activityInfos = activityInfos;
	}

	public MiniReceiverAddressInfoDTO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(MiniReceiverAddressInfoDTO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public List<AttrExtInfoDTO> getAttrExtInfoList() {
		return this.attrExtInfoList;
	}
	public void setAttrExtInfoList(List<AttrExtInfoDTO> attrExtInfoList) {
		this.attrExtInfoList = attrExtInfoList;
	}

	public BookingInfoDTO getBookingInfo() {
		return this.bookingInfo;
	}
	public void setBookingInfo(BookingInfoDTO bookingInfo) {
		this.bookingInfo = bookingInfo;
	}

	public ContactInfoDTO getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(ContactInfoDTO contactInfo) {
		this.contactInfo = contactInfo;
	}

	public List<GoodsInfoModifyDTO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<GoodsInfoModifyDTO> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderInspectPrice() {
		return this.orderInspectPrice;
	}
	public void setOrderInspectPrice(String orderInspectPrice) {
		this.orderInspectPrice = orderInspectPrice;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public PriceInfoModifyDTO getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(PriceInfoModifyDTO priceInfo) {
		this.priceInfo = priceInfo;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public SendOrderContactInfoDTO getSendOrderContactInfo() {
		return this.sendOrderContactInfo;
	}
	public void setSendOrderContactInfo(SendOrderContactInfoDTO sendOrderContactInfo) {
		this.sendOrderContactInfo = sendOrderContactInfo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<TicketInfoModifyDTO> getTicketInfos() {
		return this.ticketInfos;
	}
	public void setTicketInfos(List<TicketInfoModifyDTO> ticketInfos) {
		this.ticketInfos = ticketInfos;
	}

	public TourInfoDTO getTourInfo() {
		return this.tourInfo;
	}
	public void setTourInfo(TourInfoDTO tourInfo) {
		this.tourInfo = tourInfo;
	}

	public String getUserConfirmPrice() {
		return this.userConfirmPrice;
	}
	public void setUserConfirmPrice(String userConfirmPrice) {
		this.userConfirmPrice = userConfirmPrice;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
