package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行政处罚信息
 *
 * @author auto create
 * @since 1.0, 2023-11-28 16:10:14
 */
public class PenCaseInfo extends AlipayObject {

	private static final long serialVersionUID = 3171979462697831138L;

	/**
	 * 社会统一信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 违法行为类型
	 */
	@ApiField("illegact_type")
	private String illegactType;

	/**
	 * 公示日期. yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("open_date")
	private String openDate;

	/**
	 * 处罚机关
	 */
	@ApiField("pen_auth")
	private String penAuth;

	/**
	 * 行政处罚决定书内容
	 */
	@ApiField("pen_con")
	private String penCon;

	/**
	 * 处罚决定书文号
	 */
	@ApiField("pen_dec_no")
	private String penDecNo;

	/**
	 * 处罚决定书签发日期. 格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pendeciss_date")
	private String pendecissDate;

	/**
	 * 当事人姓名
	 */
	@ApiField("unit_name")
	private String unitName;

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getIllegactType() {
		return this.illegactType;
	}
	public void setIllegactType(String illegactType) {
		this.illegactType = illegactType;
	}

	public String getOpenDate() {
		return this.openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getPenAuth() {
		return this.penAuth;
	}
	public void setPenAuth(String penAuth) {
		this.penAuth = penAuth;
	}

	public String getPenCon() {
		return this.penCon;
	}
	public void setPenCon(String penCon) {
		this.penCon = penCon;
	}

	public String getPenDecNo() {
		return this.penDecNo;
	}
	public void setPenDecNo(String penDecNo) {
		this.penDecNo = penDecNo;
	}

	public String getPendecissDate() {
		return this.pendecissDate;
	}
	public void setPendecissDate(String pendecissDate) {
		this.pendecissDate = pendecissDate;
	}

	public String getUnitName() {
		return this.unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

}
