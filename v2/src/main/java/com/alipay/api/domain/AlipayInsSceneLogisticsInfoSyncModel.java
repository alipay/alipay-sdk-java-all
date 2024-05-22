package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险场景物流同步
 *
 * @author auto create
 * @since 1.0, 2024-04-08 14:14:17
 */
public class AlipayInsSceneLogisticsInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4282168156291212863L;

	/**
	 * 业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * isv标识
	 */
	@ApiField("isv_identity")
	private String isvIdentity;

	/**
	 * 物流商的物流单号
	 */
	@ApiField("mail_no")
	private String mailNo;

	/**
	 * 同步内容
	 */
	@ApiField("sync_data")
	private LogisticsSyncDataDTO syncData;

	/**
	 * 物流同步的类型
	 */
	@ApiField("sync_type")
	private String syncType;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getIsvIdentity() {
		return this.isvIdentity;
	}
	public void setIsvIdentity(String isvIdentity) {
		this.isvIdentity = isvIdentity;
	}

	public String getMailNo() {
		return this.mailNo;
	}
	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

	public LogisticsSyncDataDTO getSyncData() {
		return this.syncData;
	}
	public void setSyncData(LogisticsSyncDataDTO syncData) {
		this.syncData = syncData;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}
