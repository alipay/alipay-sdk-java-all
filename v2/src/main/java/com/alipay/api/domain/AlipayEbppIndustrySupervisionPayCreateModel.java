package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金监管冻资创建支付单
 *
 * @author auto create
 * @since 1.0, 2024-06-11 16:36:14
 */
public class AlipayEbppIndustrySupervisionPayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3853842595235863626L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 支付单金额，单位:分  示例: 100元则传入 "10000"
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 业务场景：
● 购房冻资:HOUSE_PURCHASED
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 币种 "CNY"
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 用户支付宝uid对应openid,用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部流水号，本次创建支付单的请求id，重复请求幂等返回
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/**
	 * 外部订单号，本次发起支付关联的冻资单id
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 收银台展示的支付标题
	 */
	@ApiField("pay_title")
	private String payTitle;

	/**
	 * 收款方主体信息，字符串BASE64加密
	 */
	@ApiField("payee_participant_info")
	private String payeeParticipantInfo;

	/**
	 * 支付备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 用于业务埋点分析
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 过期时间（整数单位：分钟），限制 最多 1440 分钟
	 */
	@ApiField("time_expire")
	private Long timeExpire;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutFlowId() {
		return this.outFlowId;
	}
	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayTitle() {
		return this.payTitle;
	}
	public void setPayTitle(String payTitle) {
		this.payTitle = payTitle;
	}

	public String getPayeeParticipantInfo() {
		return this.payeeParticipantInfo;
	}
	public void setPayeeParticipantInfo(String payeeParticipantInfo) {
		this.payeeParticipantInfo = payeeParticipantInfo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public Long getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(Long timeExpire) {
		this.timeExpire = timeExpire;
	}

}
