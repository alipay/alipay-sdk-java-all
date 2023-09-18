package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共享航班主飞信息
 *
 * @author auto create
 * @since 1.0, 2023-09-07 12:42:10
 */
public class ShareAirline extends AlipayObject {

	private static final long serialVersionUID = 7145513274788839315L;

	/**
	 * 共享航班主飞航司二字码
	 */
	@ApiField("ac_code")
	private String acCode;

	/**
	 * 共享航班主飞航司名称
	 */
	@ApiField("ac_name")
	private String acName;

	/**
	 * 共享航班主飞航班号
	 */
	@ApiField("flight_no")
	private String flightNo;

	/**
	 * 共享航班主飞机型
	 */
	@ApiField("plane_model")
	private String planeModel;

	/**
	 * 共享航班主飞机型大小
	 */
	@ApiField("plane_model_size")
	private String planeModelSize;

	public String getAcCode() {
		return this.acCode;
	}
	public void setAcCode(String acCode) {
		this.acCode = acCode;
	}

	public String getAcName() {
		return this.acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getPlaneModel() {
		return this.planeModel;
	}
	public void setPlaneModel(String planeModel) {
		this.planeModel = planeModel;
	}

	public String getPlaneModelSize() {
		return this.planeModelSize;
	}
	public void setPlaneModelSize(String planeModelSize) {
		this.planeModelSize = planeModelSize;
	}

}
