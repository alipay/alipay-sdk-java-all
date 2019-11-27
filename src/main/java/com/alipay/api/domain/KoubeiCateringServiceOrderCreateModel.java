package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订座/排队订单状态变更
 *
 * @author auto create
 * @since 1.0, 2019-03-25 12:52:33
 */
public class KoubeiCateringServiceOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3825216446868753388L;

	/**
	 * 订座信息。仅order_type=book有效
	 */
	@ApiField("book_info")
	private BookInfoCreate bookInfo;

	/**
	 * 订单渠道。如koubei表示口碑；如mwee表示美味
；如other：其他第三方。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 订单创建时间。标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 取号/订座时间。标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_time")
	private Date orderTime;

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
	 * 美味门店ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 排队信息。仅order_type=queue有效。
	 */
	@ApiField("queue_info")
	private QueueInfoCreate queueInfo;

	/**
	 * 商户拒绝原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 订单来源。如online表示线上。如offline表示线下。
	 */
	@ApiField("source")
	private String source;

	/**
	 * 时间戳，用作数据的版本号，取系统当前时间即可
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	/**
	 * 用户UID
	 */
	@ApiField("user_uid")
	private String userUid;

	public BookInfoCreate getBookInfo() {
		return this.bookInfo;
	}
	public void setBookInfo(BookInfoCreate bookInfo) {
		this.bookInfo = bookInfo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
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

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public QueueInfoCreate getQueueInfo() {
		return this.queueInfo;
	}
	public void setQueueInfo(QueueInfoCreate queueInfo) {
		this.queueInfo = queueInfo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

	public String getUserUid() {
		return this.userUid;
	}
	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

}
