package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询可用奖品
 *
 * @author auto create
 * @since 1.0, 2018-02-07 12:00:22
 */
public class MybankMarketingCampaignPrizeListConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2384522927165279412L;

	/**
	 * 支付宝UID，2088开头
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务交易金额，单位元
	 */
	@ApiField("biz_amt")
	private String bizAmt;

	/**
	 * 咨询上下文，JSON结构
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 业务流水号，幂等控制，调用方生成
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务发起渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 多种奖品类型批量咨询，英文逗号分隔
	 */
	@ApiField("type_list")
	private String typeList;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizAmt() {
		return this.bizAmt;
	}
	public void setBizAmt(String bizAmt) {
		this.bizAmt = bizAmt;
	}

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTypeList() {
		return this.typeList;
	}
	public void setTypeList(String typeList) {
		this.typeList = typeList;
	}

}
