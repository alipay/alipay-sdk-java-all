package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换蚂蚁森林树种
 *
 * @author auto create
 * @since 1.0, 2024-03-14 19:28:13
 */
public class AlipaySocialAntforestPlantApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6611711272797929142L;

	/**
	 * 出账购买树种的账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 兑换类型，默认是ACCOUNT，走account账户扣能量
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 接口扩展参数，商户可透传一些信息进来，后续扩展或者透传等作用，json字符串目前需要传以下参数{"accountName":"钉钉",//账号名称，必填
"type":"class",// 合种类型:class/corp，必填
"corp":"111", // 公司名称
"cooperation":"222" , // 合种名称，type为class时为班级名称
}
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发起该行为的支付宝用户 蚂蚁统一会员ID，可选
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用于幂等操作
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 兑换树种时当前合种的参与人数
	 */
	@ApiField("participant")
	private Long participant;

	/**
	 * 项目id，需要配合其他查询接口，查询到相关的项目之后使用。不限于树种，还包括保护地等
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 发起该行为的支付宝用户 蚂蚁统一会员ID，可选
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public Long getParticipant() {
		return this.participant;
	}
	public void setParticipant(Long participant) {
		this.participant = participant;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
