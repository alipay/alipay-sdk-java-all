package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构代扣签约
 *
 * @author auto create
 * @since 1.0, 2025-01-10 17:03:43
 */
public class AlipayEbppInstserviceDeductSignModel extends AlipayObject {

	private static final long serialVersionUID = 6417157267986273148L;

	/**
	 * 签约来源渠道，接入时与代扣约定
	 */
	@ApiField("agent_channel")
	private String agentChannel;

	/**
	 * 签约来源渠道编码，接入时与代扣约定
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 户号（缴费场景是户号，话费场景是手机号）
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型（例如通信，缴费，还款）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 代扣产品码（由技术同学分配）
	 */
	@ApiField("ededuct_product_code")
	private String edeductProductCode;

	/**
	 * 扩展字段（JSON格式）
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 机构ID（支付宝侧分配）
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 支付宝用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * PREPAID预付费，POSTPAID后付费
	 */
	@ApiField("pay_mode")
	private String payMode;

	/**
	 * 二级业务类型（例如话费，流量，水费，电费）
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 核身id
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getAgentChannel() {
		return this.agentChannel;
	}
	public void setAgentChannel(String agentChannel) {
		this.agentChannel = agentChannel;
	}

	public String getAgentCode() {
		return this.agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEdeductProductCode() {
		return this.edeductProductCode;
	}
	public void setEdeductProductCode(String edeductProductCode) {
		this.edeductProductCode = edeductProductCode;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPayMode() {
		return this.payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
