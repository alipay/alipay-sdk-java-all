package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设备点位
 *
 * @author auto create
 * @since 1.0, 2023-11-17 16:10:36
 */
public class AlipayCommerceIotPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6382666274969714613L;

	/**
	 * 外部点位ID
	 */
	@ApiField("out_device_point_id")
	private String outDevicePointId;

	/**
	 * 分页查询当前页码，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询每页大小，默认值10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getOutDevicePointId() {
		return this.outDevicePointId;
	}
	public void setOutDevicePointId(String outDevicePointId) {
		this.outDevicePointId = outDevicePointId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
