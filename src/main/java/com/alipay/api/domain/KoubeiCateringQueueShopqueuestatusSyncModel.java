package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排队队列状态数据回流
 *
 * @author auto create
 * @since 1.0, 2019-05-16 10:38:29
 */
public class KoubeiCateringQueueShopqueuestatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7731861388619424329L;

	/**
	 * 美味门店ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 队列信息
	 */
	@ApiListField("queue_list")
	@ApiField("shop_queue_status")
	private List<ShopQueueStatus> queueList;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店状态。如online_take表示可线上取号；not_need_queue表示不用排队(商家联网)；only_onsite_take表示仅现场取号；not_open表示未营业(未联网)
	 */
	@ApiField("shop_state")
	private String shopState;

	/**
	 * 时间戳，用作数据的版本号，取系统当前时间即可
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public List<ShopQueueStatus> getQueueList() {
		return this.queueList;
	}
	public void setQueueList(List<ShopQueueStatus> queueList) {
		this.queueList = queueList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopState() {
		return this.shopState;
	}
	public void setShopState(String shopState) {
		this.shopState = shopState;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

}
