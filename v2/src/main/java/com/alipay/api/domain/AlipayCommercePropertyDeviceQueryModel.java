package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备分页查询
 *
 * @author auto create
 * @since 1.0, 2025-06-19 19:58:56
 */
public class AlipayCommercePropertyDeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8512296795494253794L;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 一页查询多少条数据
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
