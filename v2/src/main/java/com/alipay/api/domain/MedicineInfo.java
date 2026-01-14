package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品列表
 *
 * @author auto create
 * @since 1.0, 2025-09-10 11:28:07
 */
public class MedicineInfo extends AlipayObject {

	private static final long serialVersionUID = 3549137767461452157L;

	/**
	 * yyy-MM-dd HH:mm:ss
medicine_verified=（true）已核销时必传
	 */
	@ApiField("consumed_time")
	private Date consumedTime;

	/**
	 * 药名
	 */
	@ApiField("medicine_name")
	private String medicineName;

	/**
	 * 药品数量/ 件
	 */
	@ApiField("medicine_num")
	private Long medicineNum;

	/**
	 * 药品核销状态：true-已核销
false-未核销
	 */
	@ApiField("medicine_verified")
	private Boolean medicineVerified;

	public Date getConsumedTime() {
		return this.consumedTime;
	}
	public void setConsumedTime(Date consumedTime) {
		this.consumedTime = consumedTime;
	}

	public String getMedicineName() {
		return this.medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public Long getMedicineNum() {
		return this.medicineNum;
	}
	public void setMedicineNum(Long medicineNum) {
		this.medicineNum = medicineNum;
	}

	public Boolean getMedicineVerified() {
		return this.medicineVerified;
	}
	public void setMedicineVerified(Boolean medicineVerified) {
		this.medicineVerified = medicineVerified;
	}

}
