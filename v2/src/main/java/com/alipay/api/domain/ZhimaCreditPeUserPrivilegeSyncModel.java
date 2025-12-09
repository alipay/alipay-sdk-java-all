package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻特权核销和返还接口
 *
 * @author auto create
 * @since 1.0, 2025-11-21 23:44:08
 */
public class ZhimaCreditPeUserPrivilegeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8238236635213929511L;

	/**
	 * 扩展参数，传入商户特质信息
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 芝麻特权活动唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务流水号，通常为商户业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 特权状态，商户接入产品分配
	 */
	@ApiField("privilege_status")
	private String privilegeStatus;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrivilegeStatus() {
		return this.privilegeStatus;
	}
	public void setPrivilegeStatus(String privilegeStatus) {
		this.privilegeStatus = privilegeStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
