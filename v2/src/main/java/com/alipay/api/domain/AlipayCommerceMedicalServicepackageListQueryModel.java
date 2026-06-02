package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生服务包列表查询
 *
 * @author auto create
 * @since 1.0, 2026-04-30 14:12:45
 */
public class AlipayCommerceMedicalServicepackageListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4392116728811252527L;

	/**
	 * 是否是买后
	 */
	@ApiField("is_purchased")
	private Boolean isPurchased;

	/**
	 * 领衔医生ID
	 */
	@ApiField("lead_doctor_id")
	private String leadDoctorId;

	/**
	 * null
	 */
	@ApiListField("package_id_list")
	@ApiField("string")
	private List<String> packageIdList;

	public Boolean getIsPurchased() {
		return this.isPurchased;
	}
	public void setIsPurchased(Boolean isPurchased) {
		this.isPurchased = isPurchased;
	}

	public String getLeadDoctorId() {
		return this.leadDoctorId;
	}
	public void setLeadDoctorId(String leadDoctorId) {
		this.leadDoctorId = leadDoctorId;
	}

	public List<String> getPackageIdList() {
		return this.packageIdList;
	}
	public void setPackageIdList(List<String> packageIdList) {
		this.packageIdList = packageIdList;
	}

}
