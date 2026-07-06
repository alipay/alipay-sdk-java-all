package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车之家线索后效状态回传接口
 *
 * @author auto create
 * @since 1.0, 2026-06-17 15:23:51
 */
public class AlipayEcoMycarAutohomeleadsStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7334224728465554375L;

	/**
	 * 线索接通状态明细
	 */
	@ApiField("contact_status")
	private AutohomeContactStatusModel contactStatus;

	/**
	 * 线索购车状态明细
	 */
	@ApiField("deal_status")
	private AutohomeDealStatusModel dealStatus;

	/**
	 * 线索入库状态明细
	 */
	@ApiField("distribute_status")
	private AutohomeDistributeStatusModel distributeStatus;

	/**
	 * 汽车之家线索上报线索管理平台生成的唯一ID
	 */
	@ApiField("key_push_id")
	private String keyPushId;

	/**
	 * 线索拆分后生成的唯一ID
	 */
	@ApiField("key_split_id")
	private String keySplitId;

	/**
	 * 线索入线索数仓库后生成的唯一ID，当线索预留时此字段为空
	 */
	@ApiField("key_unique_id")
	private String keyUniqueId;

	/**
	 * 汽车之家线索后效状态类型
	 */
	@ApiField("status_type")
	private String statusType;

	public AutohomeContactStatusModel getContactStatus() {
		return this.contactStatus;
	}
	public void setContactStatus(AutohomeContactStatusModel contactStatus) {
		this.contactStatus = contactStatus;
	}

	public AutohomeDealStatusModel getDealStatus() {
		return this.dealStatus;
	}
	public void setDealStatus(AutohomeDealStatusModel dealStatus) {
		this.dealStatus = dealStatus;
	}

	public AutohomeDistributeStatusModel getDistributeStatus() {
		return this.distributeStatus;
	}
	public void setDistributeStatus(AutohomeDistributeStatusModel distributeStatus) {
		this.distributeStatus = distributeStatus;
	}

	public String getKeyPushId() {
		return this.keyPushId;
	}
	public void setKeyPushId(String keyPushId) {
		this.keyPushId = keyPushId;
	}

	public String getKeySplitId() {
		return this.keySplitId;
	}
	public void setKeySplitId(String keySplitId) {
		this.keySplitId = keySplitId;
	}

	public String getKeyUniqueId() {
		return this.keyUniqueId;
	}
	public void setKeyUniqueId(String keyUniqueId) {
		this.keyUniqueId = keyUniqueId;
	}

	public String getStatusType() {
		return this.statusType;
	}
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

}
