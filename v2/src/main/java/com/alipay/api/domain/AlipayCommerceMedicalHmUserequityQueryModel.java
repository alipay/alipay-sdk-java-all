package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益查询
 *
 * @author auto create
 * @since 1.0, 2025-12-18 14:17:42
 */
public class AlipayCommerceMedicalHmUserequityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2583269847558145117L;

	/**
	 * 基础权益编码
	 */
	@ApiField("equity_basics_code")
	private String equityBasicsCode;

	/**
	 * 权益包编码
	 */
	@ApiField("equity_package_code")
	private String equityPackageCode;

	/**
	 * 业务流水号
	 */
	@ApiField("out_biz_serial_no")
	private String outBizSerialNo;

	/**
	 * 外部用户ID
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 项目标识
	 */
	@ApiField("project_tag")
	private String projectTag;

	/**
	 * 健管用户ID（UID）
	 */
	@ApiField("user_id")
	private String userId;

	public String getEquityBasicsCode() {
		return this.equityBasicsCode;
	}
	public void setEquityBasicsCode(String equityBasicsCode) {
		this.equityBasicsCode = equityBasicsCode;
	}

	public String getEquityPackageCode() {
		return this.equityPackageCode;
	}
	public void setEquityPackageCode(String equityPackageCode) {
		this.equityPackageCode = equityPackageCode;
	}

	public String getOutBizSerialNo() {
		return this.outBizSerialNo;
	}
	public void setOutBizSerialNo(String outBizSerialNo) {
		this.outBizSerialNo = outBizSerialNo;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getProjectTag() {
		return this.projectTag;
	}
	public void setProjectTag(String projectTag) {
		this.projectTag = projectTag;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
