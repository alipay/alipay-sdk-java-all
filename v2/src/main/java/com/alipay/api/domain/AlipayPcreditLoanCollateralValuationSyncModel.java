package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送机构押品估值信息
 *
 * @author auto create
 * @since 1.0, 2019-01-10 20:14:40
 */
public class AlipayPcreditLoanCollateralValuationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1719178453555781875L;

	/**
	 * 业务流水号，即用户授信申请的单号，每次授信申请由借呗平台生成的唯一编号，通知估值时给到机构
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 估值时间，格式为yyyy-MM-dd HH:mm:ss，若更新估值，时间要晚于上一次估值时间
	 */
	@ApiField("eval_time")
	private String evalTime;

	/**
	 * JSON格式的扩展信息，具体操作和机构约定具体的扩展信息。
{"annualIncome":"200000.00","downPayment":"30000.00","installmentNum":"12","installmentOrg":"0","isInstallment":"1","isLocal":"1","isMortgaged":"1","monthlyPayment":"11000.00","paidNum":"3","serviceProvider":"杭州服务商","totalAmount":"150000.00","unpaidAmount":"99000.00"}
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 机构请求流水号，请求的幂等字段，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 拒绝码，如车辆黑名单，客户黑名单等
	 */
	@ApiField("rejected_code")
	private String rejectedCode;

	/**
	 * 拒绝原因，可以用于排查问题以及跟用户解释，如：
存量客户拒单
黑名单拒绝
铭牌缺失
限制车辆
虚假资料
备用钥匙不符
限制人群
非本人到场签约
非申请车辆到场
	 */
	@ApiField("rejected_reason")
	private String rejectedReason;

	/**
	 * 请求ID，在平台发起押品估值通知时提供给机构的request_id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 资产估值，单位为元，拒绝时为0，精确到小数点后两位
	 */
	@ApiField("value")
	private String value;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getEvalTime() {
		return this.evalTime;
	}
	public void setEvalTime(String evalTime) {
		this.evalTime = evalTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRejectedCode() {
		return this.rejectedCode;
	}
	public void setRejectedCode(String rejectedCode) {
		this.rejectedCode = rejectedCode;
	}

	public String getRejectedReason() {
		return this.rejectedReason;
	}
	public void setRejectedReason(String rejectedReason) {
		this.rejectedReason = rejectedReason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
