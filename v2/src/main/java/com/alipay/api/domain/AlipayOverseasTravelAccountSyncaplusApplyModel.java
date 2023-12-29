package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境游数据同步A+申请
 *
 * @author auto create
 * @since 1.0, 2023-12-08 17:12:52
 */
public class AlipayOverseasTravelAccountSyncaplusApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7428772664433647363L;

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

	/**
	 * 主账ownerId列表
	 */
	@ApiListField("cn_owner_ids")
	@ApiField("string")
	private List<String> cnOwnerIds;

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

	public List<String> getCnOwnerIds() {
		return this.cnOwnerIds;
	}
	public void setCnOwnerIds(List<String> cnOwnerIds) {
		this.cnOwnerIds = cnOwnerIds;
	}

}
