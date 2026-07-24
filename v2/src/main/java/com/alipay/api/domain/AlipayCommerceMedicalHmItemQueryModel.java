package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务包商品信息
 *
 * @author auto create
 * @since 1.0, 2026-07-08 17:27:56
 */
public class AlipayCommerceMedicalHmItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8216997143561161282L;

	/**
	 * 医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 服务包订单ID。通过履约单号换取服务订单id
	 */
	@ApiField("package_order_id")
	private String packageOrderId;

	/**
	 * 页码,默认1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 分页大小,默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * EXPRESS_INQUIRY(极速问诊)
EXPERT_INQUIRY(专家问诊)
	 */
	@ApiField("type")
	private String type;

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getPackageOrderId() {
		return this.packageOrderId;
	}
	public void setPackageOrderId(String packageOrderId) {
		this.packageOrderId = packageOrderId;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
