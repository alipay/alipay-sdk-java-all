package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费直连代扣签约前置校验
 *
 * @author auto create
 * @since 1.0, 2021-04-29 15:27:20
 */
public class AlipayEbppPdeductSignValidateModel extends AlipayObject {

	private static final long serialVersionUID = 4754444274922252955L;

	/**
	 * 机构签约代扣来源渠道
PUBLICPLATFORM：服务窗
	 */
	@ApiField("agent_channel")
	private String agentChannel;

	/**
	 * 从服务窗发起则为该服务窗的appid的值
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 户号，机构针对于每户的水、电都会有唯一的标识户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型。
JF：缴水、电、燃气、固话宽带、有线电视、交通罚款费用
WUYE：缴物业费
HK：信用卡还款
TX：手机充值
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝缴费系统中的出账机构ID
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 签约类型,可为空。目前类型有INST_DIRECT_DEDUCT
	 */
	@ApiField("deduct_type")
	private String deductType;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 通知方式设置，本期预留字段，固定传空。
	 */
	@ApiField("notify_config")
	private String notifyConfig;

	/**
	 * 外部机构签约的协议id
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/**
	 * 户名，户主真实姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 支付工具设置，目前可为空。类型有：BALANCE;CARTOON;BIGAMOUNT_CREDIT_CARTOON;DEBIT_EXPRESS;OPTIMIZED_MOTO;PCREDIT_PAY;MONEY_FUND
	 */
	@ApiField("pay_config")
	private String payConfig;

	/**
	 * 商户签约支付宝账号的userid，2088开头16位长度的字符串，在支付宝系统中唯一
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 签约到期时间。空表示无限期，一期固定传空。
	 */
	@ApiField("sign_expire_date")
	private String signExpireDate;

	/**
	 * 业务子类型。
WATER：缴水费
ELECTRIC：缴电费
GAS：缴燃气费
COMMUN：缴固话宽带
CATV：缴有线电视费
TRAFFIC：缴交通罚款
WUYE：缴物业费
HK：信用卡还款
CZ：手机充值
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户支付宝账号id，2088开头16位长度的字符串，在支付宝系统中唯一
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getDeductType() {
		return this.deductType;
	}
	public void setDeductType(String deductType) {
		this.deductType = deductType;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getNotifyConfig() {
		return this.notifyConfig;
	}
	public void setNotifyConfig(String notifyConfig) {
		this.notifyConfig = notifyConfig;
	}

	public String getOutAgreementId() {
		return this.outAgreementId;
	}
	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPayConfig() {
		return this.payConfig;
	}
	public void setPayConfig(String payConfig) {
		this.payConfig = payConfig;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSignExpireDate() {
		return this.signExpireDate;
	}
	public void setSignExpireDate(String signExpireDate) {
		this.signExpireDate = signExpireDate;
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
