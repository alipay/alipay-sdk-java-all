package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证补增
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:58:53
 */
public class AlipayEcoMycarCommercializationCertificateAppendModel extends AlipayObject {

	private static final long serialVersionUID = 4194927732474846186L;

	/**
	 * 补增凭证详情
	 */
	@ApiField("certificate_info")
	private CommercializationCertificateInfo certificateInfo;

	/**
	 * 支付宝的用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作流水号 商户侧唯一 ，幂等键
	 */
	@ApiField("operate_serial_number")
	private String operateSerialNumber;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public CommercializationCertificateInfo getCertificateInfo() {
		return this.certificateInfo;
	}
	public void setCertificateInfo(CommercializationCertificateInfo certificateInfo) {
		this.certificateInfo = certificateInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperateSerialNumber() {
		return this.operateSerialNumber;
	}
	public void setOperateSerialNumber(String operateSerialNumber) {
		this.operateSerialNumber = operateSerialNumber;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
