package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayAssetPointOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7126516929364375662L;

	/** 
	 * 支付宝集分宝发放流水号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 发放时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 支付宝集分宝发放者用户ID
	 */
	@ApiField("dispatch_user_id")
	private String dispatchUserId;

	/** 
	 * 向用户展示集分宝发放备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * isv提供的发放号订单号，由数字和字母组成，最大长度为32为，需要保证每笔发放的唯一性，支付宝会对该参数做唯一性控制。如果使用同样的订单号，支付宝将返回订单号已经存在的错误
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 集分宝发放流水状态，I表示处理中，S表示成功，F表示失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 发放集分宝的数量
	 */
	@ApiField("point_count")
	private Long pointCount;

	/** 
	 * 支付宝集分宝接收者用户ID
	 */
	@ApiField("receive_user_id")
	private String receiveUserId;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setDispatchUserId(String dispatchUserId) {
		this.dispatchUserId = dispatchUserId;
	}
	public String getDispatchUserId( ) {
		return this.dispatchUserId;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setPointCount(Long pointCount) {
		this.pointCount = pointCount;
	}
	public Long getPointCount( ) {
		return this.pointCount;
	}

	public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}
	public String getReceiveUserId( ) {
		return this.receiveUserId;
	}

}
