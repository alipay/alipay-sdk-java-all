package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区参与者关系
 *
 * @author auto create
 * @since 1.0, 2020-06-22 14:30:28
 */
public class CommunityPartnerRelationDataSyncDTO extends AlipayObject {

	private static final long serialVersionUID = 1661845378959928792L;

	/**
	 * 关系业务数据
	 */
	@ApiField("rela_data")
	private String relaData;

	/**
	 * 2020-06-06 06:06:06
	 */
	@ApiField("rela_expire")
	private String relaExpire;

	/**
	 * 关系状态
	 */
	@ApiField("rela_status")
	private String relaStatus;

	/**
	 * 目标对象id
	 */
	@ApiField("target_id")
	private String targetId;

	public String getRelaData() {
		return this.relaData;
	}
	public void setRelaData(String relaData) {
		this.relaData = relaData;
	}

	public String getRelaExpire() {
		return this.relaExpire;
	}
	public void setRelaExpire(String relaExpire) {
		this.relaExpire = relaExpire;
	}

	public String getRelaStatus() {
		return this.relaStatus;
	}
	public void setRelaStatus(String relaStatus) {
		this.relaStatus = relaStatus;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
