package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁iot设备交易明细信息查询接口
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:25:57
 */
public class AlipayCommerceIotDapplyTradedetaillistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6865789618511321862L;

	/**
	 * 起始偏移位置
	 */
	@ApiField("offset")
	private Long offset;

	/**
	 * 一页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询截止时间
	 */
	@ApiField("stat_end")
	private String statEnd;

	/**
	 * 查询起止日期
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
