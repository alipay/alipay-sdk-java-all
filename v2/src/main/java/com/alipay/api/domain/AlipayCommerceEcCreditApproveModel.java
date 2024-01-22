package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业授信审批通知
 *
 * @author auto create
 * @since 1.0, 2023-10-10 14:46:50
 */
public class AlipayCommerceEcCreditApproveModel extends AlipayObject {

	private static final long serialVersionUID = 1527973286389485343L;

	/**
	 * 资方授信申请流水号， 资方内部生成
	 */
	@ApiField("apply_serial_no")
	private String applySerialNo;

	/**
	 * 申请时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 剩余可用额度，单位元，精确到分
	 */
	@ApiField("available_limit")
	private String availableLimit;

	/**
	 * 授信额度，申请完成时必填，必须为整数
	 */
	@ApiField("capital_limit")
	private String capitalLimit;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 额度有效期
	 */
	@ApiField("expiration_date")
	private Date expirationDate;

	/**
	 * 授信申请时传递的外部请求号，平台基于该字段匹配申请记录
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 授信失败时，需要返回的具体原因
	 */
	@ApiField("rejected_reason")
	private String rejectedReason;

	/**
	 * 授信申请状态
	 */
	@ApiField("result")
	private String result;

	public String getApplySerialNo() {
		return this.applySerialNo;
	}
	public void setApplySerialNo(String applySerialNo) {
		this.applySerialNo = applySerialNo;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getAvailableLimit() {
		return this.availableLimit;
	}
	public void setAvailableLimit(String availableLimit) {
		this.availableLimit = availableLimit;
	}

	public String getCapitalLimit() {
		return this.capitalLimit;
	}
	public void setCapitalLimit(String capitalLimit) {
		this.capitalLimit = capitalLimit;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRejectedReason() {
		return this.rejectedReason;
	}
	public void setRejectedReason(String rejectedReason) {
		this.rejectedReason = rejectedReason;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
