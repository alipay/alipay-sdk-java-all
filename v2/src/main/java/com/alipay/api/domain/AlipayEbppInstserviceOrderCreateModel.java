package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构服务订单回流
 *
 * @author auto create
 * @since 1.0, 2022-11-24 17:04:14
 */
public class AlipayEbppInstserviceOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4221972768538743853L;

	/**
	 * 手机号,户号，卡号等
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 权益，活动，会员
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * json标准格式
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 流水号
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 流水创建时间
	 */
	@ApiField("flow_time")
	private String flowTime;

	/**
	 * 机构
	 */
	@ApiField("inst")
	private String inst;

	/**
	 * 支付宝用户的open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作动作
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 商户名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 合作方子业务
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getExtend() {
		return this.extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getFlowTime() {
		return this.flowTime;
	}
	public void setFlowTime(String flowTime) {
		this.flowTime = flowTime;
	}

	public String getInst() {
		return this.inst;
	}
	public void setInst(String inst) {
		this.inst = inst;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
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

}
