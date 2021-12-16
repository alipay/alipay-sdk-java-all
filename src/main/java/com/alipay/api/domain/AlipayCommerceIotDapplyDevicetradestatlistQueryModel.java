package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁iot设备交易查询接口
 *
 * @author auto create
 * @since 1.0, 2021-09-14 17:32:24
 */
public class AlipayCommerceIotDapplyDevicetradestatlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4555772713963269977L;

	/**
	 * 分页起始偏移
	 */
	@ApiField("offset")
	private Long offset;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询范围截止日期
	 */
	@ApiField("stat_end")
	private String statEnd;

	/**
	 * 查询范围起始值
	 */
	@ApiField("stat_start")
	private String statStart;

	public Long getOffset() {
		return this.offset;
	}
	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatEnd() {
		return this.statEnd;
	}
	public void setStatEnd(String statEnd) {
		this.statEnd = statEnd;
	}

	public String getStatStart() {
		return this.statStart;
	}
	public void setStatStart(String statStart) {
		this.statStart = statStart;
	}

}
