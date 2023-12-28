package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排队队列配置数据回流
 *
 * @author auto create
 * @since 1.0, 2021-04-22 11:22:20
 */
public class KoubeiCateringQueueShopqueueinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6852812456415844785L;

	/**
	 * 美味门店ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 队列信息
	 */
	@ApiListField("queue_list")
	@ApiField("shop_queue")
	private List<ShopQueue> queueList;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

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

	public List<ShopQueue> getQueueList() {
		return this.queueList;
	}
	public void setQueueList(List<ShopQueue> queueList) {
		this.queueList = queueList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

}
