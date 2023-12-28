package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业同步黑白名单用户接口
 *
 * @author auto create
 * @since 1.0, 2023-08-22 14:05:25
 */
public class AlipayCommerceCityfacilitatorNamelistSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7552975898776694317L;

	/**
	 * 设备biztid
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 黑名单的p的id
	 */
	@ApiField("partner_block_id")
	private String partnerBlockId;

	/**
	 * 黑名单原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 黑、白属性
	 */
	@ApiField("type")
	private String type;

	/**
	 * 加黑原因的一些code
	 */
	@ApiField("type_sub_code")
	private String typeSubCode;

	/**
	 * 用户id
	 */
	@ApiField("user_block_id")
	private String userBlockId;

	/**
	 * 用户id
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getPartnerBlockId() {
		return this.partnerBlockId;
	}
	public void setPartnerBlockId(String partnerBlockId) {
		this.partnerBlockId = partnerBlockId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getTypeSubCode() {
		return this.typeSubCode;
	}
	public void setTypeSubCode(String typeSubCode) {
		this.typeSubCode = typeSubCode;
	}

	public String getUserBlockId() {
		return this.userBlockId;
	}
	public void setUserBlockId(String userBlockId) {
		this.userBlockId = userBlockId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
