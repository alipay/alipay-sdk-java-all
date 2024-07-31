package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车联数据集合
 *
 * @author auto create
 * @since 1.0, 2021-09-02 17:26:08
 */
public class VehicleIovData extends AlipayObject {

	private static final long serialVersionUID = 4539766128172665636L;

	/**
	 * 车联描述
	 */
	@ApiField("iov_desc")
	private String iovDesc;

	/**
	 * 车联时间戳
	 */
	@ApiField("iov_timestamp")
	private String iovTimestamp;

	/**
	 * 车联数据类型
	 */
	@ApiField("iov_type")
	private String iovType;

	/**
	 * 车联单位
	 */
	@ApiField("iov_unit")
	private String iovUnit;

	/**
	 * 车联数据值
	 */
	@ApiField("iov_value")
	private String iovValue;

	public String getIovDesc() {
		return this.iovDesc;
	}
	public void setIovDesc(String iovDesc) {
		this.iovDesc = iovDesc;
	}

	public String getIovTimestamp() {
		return this.iovTimestamp;
	}
	public void setIovTimestamp(String iovTimestamp) {
		this.iovTimestamp = iovTimestamp;
	}

	public String getIovType() {
		return this.iovType;
	}
	public void setIovType(String iovType) {
		this.iovType = iovType;
	}

	public String getIovUnit() {
		return this.iovUnit;
	}
	public void setIovUnit(String iovUnit) {
		this.iovUnit = iovUnit;
	}

	public String getIovValue() {
		return this.iovValue;
	}
	public void setIovValue(String iovValue) {
		this.iovValue = iovValue;
	}

}
