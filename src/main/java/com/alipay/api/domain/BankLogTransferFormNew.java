package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行流水转账form
 *
 * @author auto create
 * @since 1.0, 2021-12-01 21:22:20
 */
public class BankLogTransferFormNew extends AlipayObject {

	private static final long serialVersionUID = 4663234663822322667L;

	/**
	 * 充值金额
	 */
	@ApiField("charge_amount")
	private String chargeAmount;

	/**
	 * 充值币种
	 */
	@ApiField("chargeccy")
	private String chargeccy;

	/**
	 * 跨币种标示
ture，flase
	 */
	@ApiField("crossccy_flag")
	private String crossccyFlag;

	/**
	 * 请求参数：可空，跨币种预收充值：充值汇率
	 */
	@ApiField("exchange")
	private String exchange;

	/**
	 * 主键id
	 */
	@ApiField("id")
	private String id;

	/**
	 * Z79
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 转入预收户客户的ipRoleId(target为预收户的时候必填,其他情况选填)
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 是否是收款单充值
	 */
	@ApiField("is_recharge_receipt")
	private String isRechargeReceipt;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 转入目标
    TO_CHECK("01", "待查资金户"),

    PRE_CHARGE("02", "预收户"),

    TITLE("03", "其他科目"),

    REFUND("04", "退回"),

    COMM_VCHR("05", "通用登账"),

    COLLECT_RECEIPT("06", "收款单"),
	 */
	@ApiField("target")
	private String target;

	/**
	 * 交易日期
	 */
	@ApiField("trans_dt")
	private String transDt;

	public String getChargeAmount() {
		return this.chargeAmount;
	}
	public void setChargeAmount(String chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getChargeccy() {
		return this.chargeccy;
	}
	public void setChargeccy(String chargeccy) {
		this.chargeccy = chargeccy;
	}

	public String getCrossccyFlag() {
		return this.crossccyFlag;
	}
	public void setCrossccyFlag(String crossccyFlag) {
		this.crossccyFlag = crossccyFlag;
	}

	public String getExchange() {
		return this.exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getIsRechargeReceipt() {
		return this.isRechargeReceipt;
	}
	public void setIsRechargeReceipt(String isRechargeReceipt) {
		this.isRechargeReceipt = isRechargeReceipt;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

	public String getTransDt() {
		return this.transDt;
	}
	public void setTransDt(String transDt) {
		this.transDt = transDt;
	}

}
