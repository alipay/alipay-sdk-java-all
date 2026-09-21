package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生服务包列表查询
 *
 * @author auto create
 * @since 1.0, 2026-09-21 16:27:53
 */
public class AlipayCommerceMedicalServicepackageListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6363118616467855249L;

	/**
	 * 是否过滤标识
	 */
	@ApiField("hide_filter")
	private Boolean hideFilter;

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
	@ApiListField("lead_doctor_ids")
	@ApiField("string")
	private List<String> leadDoctorIds;

	/**
	 * null
	 */
	@ApiListField("package_id_list")
	@ApiField("string")
	private List<String> packageIdList;

	/**
	 * 订单号
	 */
	@ApiField("service_pkg_order_no")
	private String servicePkgOrderNo;

	public Boolean getHideFilter() {
		return this.hideFilter;
	}
	public void setHideFilter(Boolean hideFilter) {
		this.hideFilter = hideFilter;
	}

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

	public List<String> getLeadDoctorIds() {
		return this.leadDoctorIds;
	}
	public void setLeadDoctorIds(List<String> leadDoctorIds) {
		this.leadDoctorIds = leadDoctorIds;
	}

	public List<String> getPackageIdList() {
		return this.packageIdList;
	}
	public void setPackageIdList(List<String> packageIdList) {
		this.packageIdList = packageIdList;
	}

	public String getServicePkgOrderNo() {
		return this.servicePkgOrderNo;
	}
	public void setServicePkgOrderNo(String servicePkgOrderNo) {
		this.servicePkgOrderNo = servicePkgOrderNo;
	}

}
