package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业小区摘要信息列表
 *
 * @author auto create
 * @since 1.0, 2017-01-14 11:36:39
 */
public class CPCommunitySet extends AlipayObject {

	private static final long serialVersionUID = 1236454384487561891L;

	/**
	 * 支付宝社区小区统一编号。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 小区对应的物业公司支付宝账号PID（合作伙伴partner id）。物业公司给开发者做第三方应用授权后，开发者可获取物业公司PID。
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 小区在物业系统中的唯一编号。若开发者传入过，则返回。
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 小区当前状态,状态值：
PENDING_ONLINE 待上线
ONLINE - 上线
MAINTAIN - 维护中
OFFLINE - 下线
	 */
	@ApiField("status")
	private String status;

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
