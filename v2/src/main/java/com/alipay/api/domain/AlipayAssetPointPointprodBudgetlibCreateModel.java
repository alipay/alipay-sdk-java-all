package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝预算库创建
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:35:11
 */
public class AlipayAssetPointPointprodBudgetlibCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5214894732545644747L;

	/**
	 * 预算库初始积分数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 预算库名称
	 */
	@ApiField("budget_name")
	private String budgetName;

	/**
	 * 积分库对应的签约协议Pid
	 */
	@ApiField("contract_pid")
	private String contractPid;

	/**
	 * 预算库有效期结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 资金来源，设置预算库的出资来源
对应枚举值：支付宝自有资金--1，支付宝垫资资金--2，外部资金--3，阿里资金--4
	 */
	@ApiField("fund_source")
	private Long fundSource;

	/**
	 * 预算库备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 积分库操作渠道枚举,对应值：G--集团操作，S--系统操作，B--小二后台操作，F--商户前台
	 */
	@ApiField("operate_channel")
	private String operateChannel;

	/**
	 * 预算库创建操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 业务号，用于保证幂等。当业务号发生幂等时返回已创建的积分库信息
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 预算库对应的积分库ID
	 */
	@ApiField("point_lib_id")
	private String pointLibId;

	/**
	 * 预算库有效期起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 是否使用优惠支付，如需使用会开通汇总记账子卡
	 */
	@ApiField("use_settle_tool")
	private Boolean useSettleTool;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getFundSource() {
		return this.fundSource;
	}
	public void setFundSource(Long fundSource) {
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

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPointLibId() {
		return this.pointLibId;
	}
	public void setPointLibId(String pointLibId) {
		this.pointLibId = pointLibId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Boolean getUseSettleTool() {
		return this.useSettleTool;
	}
	public void setUseSettleTool(Boolean useSettleTool) {
		this.useSettleTool = useSettleTool;
	}

}
