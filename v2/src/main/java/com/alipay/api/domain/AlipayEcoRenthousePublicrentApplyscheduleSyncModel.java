package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公租房申请进度同步
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:49:09
 */
public class AlipayEcoRenthousePublicrentApplyscheduleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6222189876439926496L;

	/**
	 * 申请单进度列表
	 */
	@ApiListField("apply_schedule_list")
	@ApiField("eco_apply_schedule")
	private List<EcoApplySchedule> applyScheduleList;

	/**
	 * 证件号-身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 租客用户Id
	 */
	@ApiField("rent_id")
	private String rentId;

	public List<EcoApplySchedule> getApplyScheduleList() {
		return this.applyScheduleList;
	}
	public void setApplyScheduleList(List<EcoApplySchedule> applyScheduleList) {
		this.applyScheduleList = applyScheduleList;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getRentId() {
		return this.rentId;
	}
	public void setRentId(String rentId) {
		this.rentId = rentId;
	}

}
