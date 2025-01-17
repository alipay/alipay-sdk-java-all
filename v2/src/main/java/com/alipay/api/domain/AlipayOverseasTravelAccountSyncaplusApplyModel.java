package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境游数据同步A+申请
 *
 * @author auto create
 * @since 1.0, 2024-01-30 14:02:01
 */
public class AlipayOverseasTravelAccountSyncaplusApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1223418957938518889L;

	/**
	 * AplusOwner的邮箱
	 */
	@ApiField("aplus_owner_email")
	private String aplusOwnerEmail;

	/**
	 * A+ownerId
	 */
	@ApiField("aplus_owner_id")
	private String aplusOwnerId;

	/**
	 * aplusOwner名称
	 */
	@ApiField("aplus_owner_name")
	private String aplusOwnerName;

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

	/**
	 * CN的pid
	 */
	@ApiField("cn_trade_pid")
	private String cnTradePid;

	public String getAplusOwnerEmail() {
		return this.aplusOwnerEmail;
	}
	public void setAplusOwnerEmail(String aplusOwnerEmail) {
		this.aplusOwnerEmail = aplusOwnerEmail;
	}

	public String getAplusOwnerId() {
		return this.aplusOwnerId;
	}
	public void setAplusOwnerId(String aplusOwnerId) {
		this.aplusOwnerId = aplusOwnerId;
	}

	public String getAplusOwnerName() {
		return this.aplusOwnerName;
	}
	public void setAplusOwnerName(String aplusOwnerName) {
		this.aplusOwnerName = aplusOwnerName;
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

	public String getCnTradePid() {
		return this.cnTradePid;
	}
	public void setCnTradePid(String cnTradePid) {
		this.cnTradePid = cnTradePid;
	}

}
