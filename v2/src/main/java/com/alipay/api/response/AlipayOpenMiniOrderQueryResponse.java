package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddressInfoVO;
import com.alipay.api.domain.DeliveryDetailInfoVO;
import com.alipay.api.domain.OrderDetailInfoVO;
import com.alipay.api.domain.RefundInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-06 17:31:42
 */
public class AlipayOpenMiniOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8435761142626249775L;

	/** 
	 * 收货地址
	 */
	@ApiField("address_info")
	private AddressInfoVO addressInfo;

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
	 * 订单类型：0，普通单，1，二级商户单
	 */
	@ApiField("fund_type")
	private Long fundType;

	/** 
	 * 用户的openid
	 */
	@ApiField("openid")
	private String openid;

	/** 
	 * 订单详细数据
	 */
	@ApiField("order_detail")
	private OrderDetailInfoVO orderDetail;

	/** 
	 * 商家自定义订单ID(字符集包括大小写字幕数字，长度小于128个字符）
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 订单详情页路径
	 */
	@ApiField("path")
	private String path;

	/** 
	 * 确认收货时间，秒级时间戳，fund_type = 1且确认收货之后存在
	 */
	@ApiField("receive_time")
	private Long receiveTime;

	/** 
	 * 退款信息
	 */
	@ApiField("refund_info")
	private RefundInfoVO refundInfo;

	/** 
	 * 下单场景值
	 */
	@ApiField("scene")
	private String scene;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private Long status;

	public void setAddressInfo(AddressInfoVO addressInfo) {
		this.addressInfo = addressInfo;
	}
	public AddressInfoVO getAddressInfo( ) {
		return this.addressInfo;
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

	public void setFundType(Long fundType) {
		this.fundType = fundType;
	}
	public Long getFundType( ) {
		return this.fundType;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getOpenid( ) {
		return this.openid;
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

	public void setReceiveTime(Long receiveTime) {
		this.receiveTime = receiveTime;
	}
	public Long getReceiveTime( ) {
		return this.receiveTime;
	}

	public void setRefundInfo(RefundInfoVO refundInfo) {
		this.refundInfo = refundInfo;
	}
	public RefundInfoVO getRefundInfo( ) {
		return this.refundInfo;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}
	public String getScene( ) {
		return this.scene;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
