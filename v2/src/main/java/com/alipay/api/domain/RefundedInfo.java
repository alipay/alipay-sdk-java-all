package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 泰国电子落地签退款处理结果信息。 
EVOA refund infos.
 *
 * @author auto create
 * @since 1.0, 2023-06-01 20:43:16
 */
public class RefundedInfo extends AlipayObject {

	private static final long serialVersionUID = 3287112812191576386L;

	/**
	 * 用户申请订单号回传。 Unique Application No.
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * 签证费
	 */
	@ApiField("evoa_fee_amount")
	private String evoaFeeAmount;

	/**
	 * 处理人姓名
	 */
	@ApiField("process_by")
	private String processBy;

	/**
	 * 处理时间
	 */
	@ApiField("process_date_time")
	private Date processDateTime;

	/**
	 * 处理附加信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 签证服务费用价格
	 */
	@ApiField("service_fee_amount")
	private String serviceFeeAmount;

	/**
	 * 退款受理状态：Checked/Approved/Rejected
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商户交易号。
VOA NO.
	 */
	@ApiField("voa_no")
	private String voaNo;

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getEvoaFeeAmount() {
		return this.evoaFeeAmount;
	}
	public void setEvoaFeeAmount(String evoaFeeAmount) {
		this.evoaFeeAmount = evoaFeeAmount;
	}

	public String getProcessBy() {
		return this.processBy;
	}
	public void setProcessBy(String processBy) {
		this.processBy = processBy;
	}

	public Date getProcessDateTime() {
		return this.processDateTime;
	}
	public void setProcessDateTime(Date processDateTime) {
		this.processDateTime = processDateTime;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getServiceFeeAmount() {
		return this.serviceFeeAmount;
	}
	public void setServiceFeeAmount(String serviceFeeAmount) {
		this.serviceFeeAmount = serviceFeeAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoaNo() {
		return this.voaNo;
	}
	public void setVoaNo(String voaNo) {
		this.voaNo = voaNo;
	}

}
