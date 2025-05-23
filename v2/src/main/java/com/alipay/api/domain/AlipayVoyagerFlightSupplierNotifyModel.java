package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Voyager机票供应商通知变更接口
 *
 * @author auto create
 * @since 1.0, 2025-01-06 16:48:14
 */
public class AlipayVoyagerFlightSupplierNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7316238685216786652L;

	/**
	 * 通知事件类型。
ORDER_CREATED_EVENT：订单创建事件
ORDER_PAID_DONE_EVENT：订单支付完成事件
ORDER_TICKET_ISSUED_EVENT：出票成功事件
ORDER_CLOSED_EVENT：订单关闭事件
ORDER_REFUND_CREATED_EVENT：退票申请事件
ORDER_REFUND_APPROVED_EVENT：同意退款事件
ORDER_REFUND_REJECTED_EVENT：退款拒绝事件
ORDER_FLIGHT_CHANGED_EVENT：航变-航程变更事件
ORDER_FLIGHT_CANCELLED_EVENT：航变-航程取消事件
ORDER_REBOOK_CREATED_EVENT: 改签-提交改签
ORDER_REBOOK_SUCC_EVENT: 改签-改签成功
ORDER_REBOOK_FAILED_EVENT：改签-改签失败
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 事件发生的时间，为时间戳
	 */
	@ApiField("occurrence_time")
	private Long occurrenceTime;

	/**
	 * 用于Voyager唯一识别对应供应商订单
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 改签明细集合
	 */
	@ApiField("rebook_info")
	private VoyagerOrderRebookInfo rebookInfo;

	/**
	 * 供应商退款单号，用于Voyager识别对应退款单。退款相关事件时必传。
	 */
	@ApiField("refund_id")
	private String refundId;

	/**
	 * 事件为ORDER_FLIGHT_CANCELLED_EVENT传入如，每个乘机人的航段信息，每条记录是一个乘机人，按乘机人做了聚合
	 */
	@ApiListField("segment_of_passengers_cancelled")
	@ApiField("voyager_segment_of_passengers_cancelled_info")
	private List<VoyagerSegmentOfPassengersCancelledInfo> segmentOfPassengersCancelled;

	/**
	 * 事件类型为ORDER_FLIGHT_CHANGED_EVENT时传入，每个乘机人的航段信息，每条记录是一个乘机人，按乘机人做了聚合
	 */
	@ApiListField("segment_of_passengers_changed")
	@ApiField("voyager_segment_of_passengers_changed_info")
	private List<VoyagerSegmentOfPassengersChangedInfo> segmentOfPassengersChanged;

	/**
	 * 人航段维度退票信息集合
	 */
	@ApiListField("segment_of_passengers_refund_info")
	@ApiField("voyager_segment_of_passengers_cancelled_info")
	private List<VoyagerSegmentOfPassengersCancelledInfo> segmentOfPassengersRefundInfo;

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Long getOccurrenceTime() {
		return this.occurrenceTime;
	}
	public void setOccurrenceTime(Long occurrenceTime) {
		this.occurrenceTime = occurrenceTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public VoyagerOrderRebookInfo getRebookInfo() {
		return this.rebookInfo;
	}
	public void setRebookInfo(VoyagerOrderRebookInfo rebookInfo) {
		this.rebookInfo = rebookInfo;
	}

	public String getRefundId() {
		return this.refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public List<VoyagerSegmentOfPassengersCancelledInfo> getSegmentOfPassengersCancelled() {
		return this.segmentOfPassengersCancelled;
	}
	public void setSegmentOfPassengersCancelled(List<VoyagerSegmentOfPassengersCancelledInfo> segmentOfPassengersCancelled) {
		this.segmentOfPassengersCancelled = segmentOfPassengersCancelled;
	}

	public List<VoyagerSegmentOfPassengersChangedInfo> getSegmentOfPassengersChanged() {
		return this.segmentOfPassengersChanged;
	}
	public void setSegmentOfPassengersChanged(List<VoyagerSegmentOfPassengersChangedInfo> segmentOfPassengersChanged) {
		this.segmentOfPassengersChanged = segmentOfPassengersChanged;
	}

	public List<VoyagerSegmentOfPassengersCancelledInfo> getSegmentOfPassengersRefundInfo() {
		return this.segmentOfPassengersRefundInfo;
	}
	public void setSegmentOfPassengersRefundInfo(List<VoyagerSegmentOfPassengersCancelledInfo> segmentOfPassengersRefundInfo) {
		this.segmentOfPassengersRefundInfo = segmentOfPassengersRefundInfo;
	}

}
