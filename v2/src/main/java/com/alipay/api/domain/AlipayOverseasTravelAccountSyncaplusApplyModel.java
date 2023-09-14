package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游数据同步A+申请
 *
 * @author auto create
 * @since 1.0, 2023-07-11 14:35:54
 */
public class AlipayOverseasTravelAccountSyncaplusApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6564778163814716918L;

	/**
	 * A+ownerId
	 */
	@ApiField("aplus_owner_id")
	private String aplusOwnerId;

	/**
	 * 跨境游ownerid
	 */
	@ApiField("cn_owner_id")
	private String cnOwnerId;

	public String getAplusOwnerId() {
		return this.aplusOwnerId;
	}
	public void setAplusOwnerId(String aplusOwnerId) {
		this.aplusOwnerId = aplusOwnerId;
	}

	public String getCnOwnerId() {
		return this.cnOwnerId;
	}
	public void setCnOwnerId(String cnOwnerId) {
		this.cnOwnerId = cnOwnerId;
	}

}
