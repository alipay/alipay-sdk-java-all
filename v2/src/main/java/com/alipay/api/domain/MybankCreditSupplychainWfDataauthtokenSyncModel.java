package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * WF极速回款用户授权数据Token同步
 *
 * @author auto create
 * @since 1.0, 2022-12-20 16:52:45
 */
public class MybankCreditSupplychainWfDataauthtokenSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3163878311648791575L;

	/**
	 * 发送时间
	 */
	@ApiField("change_date")
	private Long changeDate;

	/**
	 * 状态
DATA_COLLECTION_START 采集开始
DATA_COLLECTION_CLOSED 采集关闭
	 */
	@ApiField("collection_status")
	private String collectionStatus;

	/**
	 * ["finance", "seller", "order"]
需要判断list里面是否有finance的数据即可，状态可以直接取collectionstatus。
	 */
	@ApiListField("data_collection_info_ids")
	@ApiField("string")
	private List<String> dataCollectionInfoIds;

	/**
	 * 平台类型 如果亚马逊
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 请求幂等ID
	 */
	@ApiField("requestid")
	private String requestid;

	/**
	 * WF的卖家ID（亚马逊商家）
	 */
	@ApiField("sellerid")
	private String sellerid;

	/**
	 * WF站点名称
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点用户ID
	 */
	@ApiField("siteuserid")
	private String siteuserid;

	/**
	 * 停止原因
store binding change 店铺换绑
seller token invalid Token失效
store invalid 店铺解绑
store exception 店铺异常
	 */
	@ApiField("stopped_reason")
	private String stoppedReason;

	public Long getChangeDate() {
		return this.changeDate;
	}
	public void setChangeDate(Long changeDate) {
		this.changeDate = changeDate;
	}

	public String getCollectionStatus() {
		return this.collectionStatus;
	}
	public void setCollectionStatus(String collectionStatus) {
		this.collectionStatus = collectionStatus;
	}

	public List<String> getDataCollectionInfoIds() {
		return this.dataCollectionInfoIds;
	}
	public void setDataCollectionInfoIds(List<String> dataCollectionInfoIds) {
		this.dataCollectionInfoIds = dataCollectionInfoIds;
	}

	public String getPlatformType() {
		return this.platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public String getRequestid() {
		return this.requestid;
	}
	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public String getSellerid() {
		return this.sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteuserid() {
		return this.siteuserid;
	}
	public void setSiteuserid(String siteuserid) {
		this.siteuserid = siteuserid;
	}

	public String getStoppedReason() {
		return this.stoppedReason;
	}
	public void setStoppedReason(String stoppedReason) {
		this.stoppedReason = stoppedReason;
	}

}
