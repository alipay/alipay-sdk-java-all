package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddressInfoVO;
import com.alipay.api.domain.ContactInfoVO;
import com.alipay.api.domain.DeliveryDetailInfoVO;
import com.alipay.api.domain.OrderDetailInfoVO;
import com.alipay.api.domain.RefundInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-07 15:26:50
 */
public class AlipayOpenMiniOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4844877783441176167L;

	/** 
	 * 收货地址
	 */
	@ApiField("address_info")
	private AddressInfoVO addressInfo;

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
	 * 配送信息
	 */
	@ApiField("delivery_detail")
	private DeliveryDetailInfoVO deliveryDetail;

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
	 * 订单详细数据
	 */
	@ApiField("order_detail")
	private OrderDetailInfoVO orderDetail;

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
	 * 结算方式
	 */
	@ApiField("settle_type")
	private String settleType;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 支付单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAddressInfo(AddressInfoVO addressInfo) {
		this.addressInfo = addressInfo;
	}
	public AddressInfoVO getAddressInfo( ) {
		return this.addressInfo;
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

	public void setOrderDetail(OrderDetailInfoVO orderDetail) {
		this.orderDetail = orderDetail;
	}
	public OrderDetailInfoVO getOrderDetail( ) {
		return this.orderDetail;
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

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}
	public String getSettleType( ) {
		return this.settleType;
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
