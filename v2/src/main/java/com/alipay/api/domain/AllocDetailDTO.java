package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 执行详情列表
 *
 * @author auto create
 * @since 1.0, 2022-12-07 15:08:03
 */
public class AllocDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 5745711665329459359L;

	/**
	 * 合花群ID（与当前请求参数中传入值保持一致）
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 自动攒计划的调拨记录的转入金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("alloc_amount")
	private String allocAmount;

	/**
	 * 自动攒计划的调拨记录的错误码
	 */
	@ApiField("alloc_error_code")
	private String allocErrorCode;

	/**
	 * 自动攒计划的调拨记录的错误描述
	 */
	@ApiField("alloc_error_msg")
	private String allocErrorMsg;

	/**
	 * 自动攒计划的调拨记录的执行结果<br>
- SUCCESS：执行成功<br>
- FAIL：执行失败<br>
- NO_PROCESS：未执行（如指定付款方资产的可用金额试算不足以完成扣款）
	 */
	@ApiField("alloc_status")
	private String allocStatus;

	/**
	 * 自动攒计划的调拨记录的实际执行时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("alloc_time")
	private Date allocTime;

	/**
	 * 自动攒计划的调拨记录的唯一标识（支付宝侧生成）
	 */
	@ApiField("detail_id")
	private String detailId;

	/**
	 * 当前合花群中的自动攒计划唯一标识（与当前请求参数中传入值保持一致）
	 */
	@ApiField("fund_plan_id")
	private String fundPlanId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAllocAmount() {
		return this.allocAmount;
	}
	public void setAllocAmount(String allocAmount) {
		this.allocAmount = allocAmount;
	}

	public String getAllocErrorCode() {
		return this.allocErrorCode;
	}
	public void setAllocErrorCode(String allocErrorCode) {
		this.allocErrorCode = allocErrorCode;
	}

	public String getAllocErrorMsg() {
		return this.allocErrorMsg;
	}
	public void setAllocErrorMsg(String allocErrorMsg) {
		this.allocErrorMsg = allocErrorMsg;
	}

	public String getAllocStatus() {
		return this.allocStatus;
	}
	public void setAllocStatus(String allocStatus) {
		this.allocStatus = allocStatus;
	}

	public Date getAllocTime() {
		return this.allocTime;
	}
	public void setAllocTime(Date allocTime) {
		this.allocTime = allocTime;
	}

	public String getDetailId() {
		return this.detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getFundPlanId() {
		return this.fundPlanId;
	}
	public void setFundPlanId(String fundPlanId) {
		this.fundPlanId = fundPlanId;
	}

}
