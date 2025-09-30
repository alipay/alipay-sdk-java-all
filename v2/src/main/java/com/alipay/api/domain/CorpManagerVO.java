package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 董监高管
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class CorpManagerVO extends AlipayObject {

	private static final long serialVersionUID = 7354274458643846645L;

	/**
	 * 委任日期
	 */
	@ApiField("appoint_dt")
	private Date appointDt;

	/**
	 * 董监高姓名
	 */
	@ApiField("manager_name")
	private String managerName;

	/**
	 * 董监高姓名(英文)
	 */
	@ApiField("manager_name_en")
	private String managerNameEn;

	/**
	 * 职位代码
	 */
	@ApiField("position_tp_code")
	private String positionTpCode;

	/**
	 * 离任日期
	 */
	@ApiField("resignation_dt")
	private Date resignationDt;

	public Date getAppointDt() {
		return this.appointDt;
	}
	public void setAppointDt(Date appointDt) {
		this.appointDt = appointDt;
	}

	public String getManagerName() {
		return this.managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerNameEn() {
		return this.managerNameEn;
	}
	public void setManagerNameEn(String managerNameEn) {
		this.managerNameEn = managerNameEn;
	}

	public String getPositionTpCode() {
		return this.positionTpCode;
	}
	public void setPositionTpCode(String positionTpCode) {
		this.positionTpCode = positionTpCode;
	}

	public Date getResignationDt() {
		return this.resignationDt;
	}
	public void setResignationDt(Date resignationDt) {
		this.resignationDt = resignationDt;
	}

}
