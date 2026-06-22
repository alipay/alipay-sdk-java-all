package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * utc活动信息同步
 *
 * @author auto create
 * @since 1.0, 2026-06-08 16:28:29
 */
public class AlipayCommerceUtcActivitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 7436961414989417885L;

	/**
	 * 业务ID，需回传同步接口的业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 支付宝侧零售商活动id
	 */
	@ApiField("retailer_activity_id")
	private String retailerActivityId;

	/**
	 * 本次同步的门店结果数据
	 */
	@ApiListField("store_list")
	@ApiField("bs_store")
	private List<BsStore> storeList;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getRetailerActivityId() {
		return this.retailerActivityId;
	}
	public void setRetailerActivityId(String retailerActivityId) {
		this.retailerActivityId = retailerActivityId;
	}

	public List<BsStore> getStoreList() {
		return this.storeList;
	}
	public void setStoreList(List<BsStore> storeList) {
		this.storeList = storeList;
	}

}
