package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交通工具信息
 *
 * @author auto create
 * @since 1.0, 2021-08-30 10:47:31
 */
public class OrderVehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 8697275277184552425L;

	/**
	 * 交通工具牌照号，如车牌号等
	 */
	@ApiField("license_plate_no")
	private String licensePlateNo;

	/**
	 * 车辆信息备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 班次
	 */
	@ApiField("shift_no")
	private String shiftNo;

	public String getLicensePlateNo() {
		return this.licensePlateNo;
	}
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getShiftNo() {
		return this.shiftNo;
	}
	public void setShiftNo(String shiftNo) {
		this.shiftNo = shiftNo;
	}

}
