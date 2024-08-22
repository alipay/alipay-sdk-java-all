package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询调用者指定时间范围内的彩票赠送列表，由亚博科技提供服务
 *
 * @author auto create
 * @since 1.0, 2020-12-14 15:46:59
 */
public class AlipayCommerceLotteryPresentlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1167259289964343728L;

	/**
	 * 结束日期，格式为yyyyMMdd
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 开始日期，格式为yyyyMMdd
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 页号，必须大于0，默认为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页大小，必须大于0，最大为500，默认为500
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
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
