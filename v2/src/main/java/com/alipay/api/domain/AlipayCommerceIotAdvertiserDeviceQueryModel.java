package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取商户下的设备sn列表
 *
 * @author auto create
 * @since 1.0, 2021-06-16 16:40:34
 */
public class AlipayCommerceIotAdvertiserDeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2592613583429822289L;

	/**
	 * 设备类型，比如qt 或 pos 当前字段已废弃(历史设计未使用)
	 */
	@ApiField("device_type")
	@Deprecated
	private String deviceType;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页数据大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
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
