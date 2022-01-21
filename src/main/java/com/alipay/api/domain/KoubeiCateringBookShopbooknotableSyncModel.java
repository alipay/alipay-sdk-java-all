package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 不可订座时间段回流
 *
 * @author auto create
 * @since 1.0, 2021-04-20 11:45:13
 */
public class KoubeiCateringBookShopbooknotableSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3792681986466356122L;

	/**
	 * 第三方门店ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 不可预订时间段
	 */
	@ApiListField("refuse_time")
	@ApiField("string")
	private List<String> refuseTime;

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

	public List<String> getRefuseTime() {
		return this.refuseTime;
	}
	public void setRefuseTime(List<String> refuseTime) {
		this.refuseTime = refuseTime;
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
