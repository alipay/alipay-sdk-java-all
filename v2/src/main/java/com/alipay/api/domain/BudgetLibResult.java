package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝预算库实体模型，包含预算库编码，余额等
 *
 * @author auto create
 * @since 1.0, 2019-08-21 14:35:07
 */
public class BudgetLibResult extends AlipayObject {

	private static final long serialVersionUID = 4858538365578239262L;

	/**
	 * 预算阀值，低于这个数据的时候才预警
	 */
	@ApiField("alert_money")
	private String alertMoney;

	/**
	 * 预算库预警标记，Y-预警；N和空位非预警
	 */
	@ApiField("alert_status")
	private String alertStatus;

	/**
	 * Y-自动延期 N-非自动延期
	 */
	@ApiField("auto_delay")
	private String autoDelay;

	/**
	 * 积分库余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 预算库编码
	 */
	@ApiField("budget_code")
	private String budgetCode;

	/**
	 * 预算库名称
	 */
	@ApiField("budget_name")
	private String budgetName;

	/**
	 * 签约PID
	 */
	@ApiField("contract_pid")
	private String contractPid;

	/**
	 * 预算库创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 是否延期告警 1-告警 0-不告警
	 */
	@ApiField("delay_notice")
	private String delayNotice;

	/**
	 * 预算库失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 资金来源
	 */
	@ApiField("fund_source")
	private String fundSource;

	/**
	 * 预算库备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作来源：F-商户前台,B-后台小二
	 */
	@ApiField("operate_channel")
	private String operateChannel;

	/**
	 * 最后操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 积分库id
	 */
	@ApiField("point_lib_id")
	private String pointLibId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 预算库生效时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 状态，有效 暂停 禁用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 预算库状态，E有效，D暂停，F禁用
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 预算总数额：预算库创建+增容-减容
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAlertMoney() {
		return this.alertMoney;
	}
	public void setAlertMoney(String alertMoney) {
		this.alertMoney = alertMoney;
	}

	public String getAlertStatus() {
		return this.alertStatus;
	}
	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
	}

	public String getAutoDelay() {
		return this.autoDelay;
	}
	public void setAutoDelay(String autoDelay) {
		this.autoDelay = autoDelay;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBudgetCode() {
		return this.budgetCode;
	}
	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

	public String getBudgetName() {
		return this.budgetName;
	}
	public void setBudgetName(String budgetName) {
		this.budgetName = budgetName;
	}

	public String getContractPid() {
		return this.contractPid;
	}
	public void setContractPid(String contractPid) {
		this.contractPid = contractPid;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDelayNotice() {
		return this.delayNotice;
	}
	public void setDelayNotice(String delayNotice) {
		this.delayNotice = delayNotice;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFundSource() {
		return this.fundSource;
	}
	public void setFundSource(String fundSource) {
		this.fundSource = fundSource;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperateChannel() {
		return this.operateChannel;
	}
	public void setOperateChannel(String operateChannel) {
		this.operateChannel = operateChannel;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPointLibId() {
		return this.pointLibId;
	}
	public void setPointLibId(String pointLibId) {
		this.pointLibId = pointLibId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
