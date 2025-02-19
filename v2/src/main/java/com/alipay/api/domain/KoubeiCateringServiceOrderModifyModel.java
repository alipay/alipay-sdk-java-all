package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订座/排队线下订单创建
 *
 * @author auto create
 * @since 1.0, 2021-04-16 14:40:26
 */
public class KoubeiCateringServiceOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5272648777263864432L;

	/**
	 * 订座信息。仅order_type=book有效
	 */
	@ApiField("book_info")
	private BookInfoModify bookInfo;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单状态。
如wait_receive表示待接单/待取号；success表示已接单/已取号；close表示已关闭；finish表示已完成；cancel表示已取消。
	 */
	@ApiField("order_state")
	private String orderState;

	/**
	 * 订单物流状态。
如果是排队单物流状态，calling表示叫号中；pass_call表示已过号；eated表示已就餐。
如果是订座单物流状态，eated表示已就餐；not_eated表示未就餐；remain表示留座。
	 */
	@ApiField("order_sub_state")
	private String orderSubState;

	/**
	 * 订单类型。如book表示订座，如queue表示排队。
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 排队信息。仅order_type=queue有效
	 */
	@ApiField("queue_info")
	private QueueInfoModify queueInfo;

	/**
	 * 商户拒绝原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * 【通用】
TIME_OUT： 超时关闭
SYSTEM_ERROR：系统异常
CUSTOMER_CANCEL： 客人取消
MERCHANT_CANCEL： 商家取消

【仅排队用】
NUMBER_ERROR：人数错误
MERCHANT_OFFLINE：商家服务不在线
NOT_NEED_QUEUE：无需排队
REPEAT_TAKE：重复取号

【仅订座用】
WAIT_CONFIRM：订单等待确认中
REPEAT_BOOK：重复预订
MERCHANT_NOT_ONLINE：商户目前不接受线上预订
MERCHANT_REFUSE：商户拒绝
BOOK_FULL：预约已满
REACH_UPPER_LIMIT：达到上限
	 */
	@ApiField("refuse_type")
	private String refuseType;

	/**
	 * 时间戳，用作数据的版本号，取系统当前时间即可
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	/**
	 * 回流数据类型。
common：非实时性数据更新。
标识除queue_wait和queue_wait_time之外其他数据的更新。

real_time：实时性数据更新。
仅queue_wait和queue_wait_time发生变化时使用。
此时仅会取queue_wait和queue_wait_time两个字段。
	 */
	@ApiField("sync_type")
	private String syncType;

	public BookInfoModify getBookInfo() {
		return this.bookInfo;
	}
	public void setBookInfo(BookInfoModify bookInfo) {
		this.bookInfo = bookInfo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderState() {
		return this.orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getOrderSubState() {
		return this.orderSubState;
	}
	public void setOrderSubState(String orderSubState) {
		this.orderSubState = orderSubState;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public QueueInfoModify getQueueInfo() {
		return this.queueInfo;
	}
	public void setQueueInfo(QueueInfoModify queueInfo) {
		this.queueInfo = queueInfo;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getRefuseType() {
		return this.refuseType;
	}
	public void setRefuseType(String refuseType) {
		this.refuseType = refuseType;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}
