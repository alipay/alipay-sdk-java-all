package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于描述权益信息
 *
 * @author auto create
 * @since 1.0, 2022-03-03 16:49:00
 */
public class FinEquityInfo extends AlipayObject {

	private static final long serialVersionUID = 6155616627661269932L;

	/**
	 * 权益有效期的结束时间，如不传则以约定时间为准
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 第三方权益券码
	 */
	@ApiField("equity_code")
	private String equityCode;

	/**
	 * 发放的第三方权益的数量，默认为1
	 */
	@ApiField("equity_num")
	private Long equityNum;

	/**
	 * 发放的第三方权益的类型
	 */
	@ApiField("equity_type")
	private String equityType;

	/**
	 * 第三方权益产品号
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 权益有效期的开始时间，默认为当前
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 权益状态。权益状态（有效VALID，已使用USED，已过期EXPIRED，已退单REFUND，不可用INVALID）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 核销情况。key值为约定信息。悦途贵宾厅约定字段：use_time，region_name，hall_name，position
	 */
	@ApiField("verification_info")
	private QYBMapInfo verificationInfo;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEquityCode() {
		return this.equityCode;
	}
	public void setEquityCode(String equityCode) {
		this.equityCode = equityCode;
	}

	public Long getEquityNum() {
		return this.equityNum;
	}
	public void setEquityNum(Long equityNum) {
		this.equityNum = equityNum;
	}

	public String getEquityType() {
		return this.equityType;
	}
	public void setEquityType(String equityType) {
		this.equityType = equityType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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

	public QYBMapInfo getVerificationInfo() {
		return this.verificationInfo;
	}
	public void setVerificationInfo(QYBMapInfo verificationInfo) {
		this.verificationInfo = verificationInfo;
	}

}
