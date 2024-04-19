package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理结果
 *
 * @author auto create
 * @since 1.0, 2023-09-06 14:23:06
 */
public class GFAOpenAPIAcceptanceResult extends AlipayObject {

	private static final long serialVersionUID = 1179242626998681734L;

	/**
	 * 受理单id
	 */
	@ApiField("acceptance_id")
	private String acceptanceId;

	/**
	 * 业财受理结果业务信息
	 */
	@ApiField("data")
	private String data;

	/**
	 * 接口调用失败是否需要重试
	 */
	@ApiField("need_retry")
	private Boolean needRetry;

	/**
	 * 业务流水号
	 */
	@ApiField("out_business_no")
	private String outBusinessNo;

	/**
	 * 接口结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 接口调用结果描述
	 */
	@ApiField("result_message")
	private String resultMessage;

	/**
	 * 业务唯一标识
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 解决方案id
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 业务流水子单号
	 */
	@ApiField("sub_out_business_no")
	private String subOutBusinessNo;

	public String getAcceptanceId() {
		return this.acceptanceId;
	}
	public void setAcceptanceId(String acceptanceId) {
		this.acceptanceId = acceptanceId;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public Boolean getNeedRetry() {
		return this.needRetry;
	}
	public void setNeedRetry(Boolean needRetry) {
		this.needRetry = needRetry;
	}

	public String getOutBusinessNo() {
		return this.outBusinessNo;
	}
	public void setOutBusinessNo(String outBusinessNo) {
		this.outBusinessNo = outBusinessNo;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getSubOutBusinessNo() {
		return this.subOutBusinessNo;
	}
	public void setSubOutBusinessNo(String subOutBusinessNo) {
		this.subOutBusinessNo = subOutBusinessNo;
	}

}
