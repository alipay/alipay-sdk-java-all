package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 被执行信息
 *
 * @author auto create
 * @since 1.0, 2023-11-28 16:10:25
 */
public class PunishedInfo extends AlipayObject {

	private static final long serialVersionUID = 3791573851243947234L;

	/**
	 * 身份证号或工商注册号
	 */
	@ApiField("card_num")
	private String cardNum;

	/**
	 * 案号
	 */
	@ApiField("case_code")
	private String caseCode;

	/**
	 * 案件状态
	 */
	@ApiField("case_status")
	private String caseStatus;

	/**
	 * 执行法院
	 */
	@ApiField("court_name")
	private String courtName;

	/**
	 * 执行标的（元）
	 */
	@ApiField("exec_money")
	private String execMoney;

	/**
	 * 被执行人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 立案时间. 格式yyyy-MM-dd
	 */
	@ApiField("reg_case_date")
	private String regCaseDate;

	/**
	 * 失信人类型
	 */
	@ApiField("type")
	private String type;

	public String getCardNum() {
		return this.cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCaseCode() {
		return this.caseCode;
	}
	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}

	public String getCaseStatus() {
		return this.caseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public String getCourtName() {
		return this.courtName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public String getExecMoney() {
		return this.execMoney;
	}
	public void setExecMoney(String execMoney) {
		this.execMoney = execMoney;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRegCaseDate() {
		return this.regCaseDate;
	}
	public void setRegCaseDate(String regCaseDate) {
		this.regCaseDate = regCaseDate;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
