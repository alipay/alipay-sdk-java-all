package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 池融资签约流程推进
 *
 * @author auto create
 * @since 1.0, 2021-01-20 14:19:24
 */
public class MybankCreditSupplychainPoolSignadvanceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1699479655885226961L;

	/**
	 * 客户支付宝登录号，饿了么发薪贷场景是外包服务供应商的支付宝登录号
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 渠道标签
	 */
	@ApiField("channel_tag")
	private String channelTag;

	/**
	 * 合作机构ipRoleId，饿了么发薪贷场景是饿了么ipRoleId
	 */
	@ApiField("data_org_ip_role_id")
	private String dataOrgIpRoleId;

	/**
	 * 操作类别
	 */
	@ApiField("operate_category")
	private String operateCategory;

	/**
	 * AGREE:同意, REJECT: 拒绝
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 拒绝原因
	 */
	@ApiField("reject_msg")
	private String rejectMsg;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getChannelTag() {
		return this.channelTag;
	}
	public void setChannelTag(String channelTag) {
		this.channelTag = channelTag;
	}

	public String getDataOrgIpRoleId() {
		return this.dataOrgIpRoleId;
	}
	public void setDataOrgIpRoleId(String dataOrgIpRoleId) {
		this.dataOrgIpRoleId = dataOrgIpRoleId;
	}

	public String getOperateCategory() {
		return this.operateCategory;
	}
	public void setOperateCategory(String operateCategory) {
		this.operateCategory = operateCategory;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getRejectMsg() {
		return this.rejectMsg;
	}
	public void setRejectMsg(String rejectMsg) {
		this.rejectMsg = rejectMsg;
	}

}
