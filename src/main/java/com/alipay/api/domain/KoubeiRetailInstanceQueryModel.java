package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户券查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-27 18:08:35
 */
public class KoubeiRetailInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5771454449641595931L;

	/**
	 * 券或者电子DM单（VOUCHER、DM），如果字段为空返回VOUCHER类型
	 */
	@ApiField("instance_type")
	private String instanceType;

	/**
	 * 当前页码，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 一次请求返回的数据量，1~100整数，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getInstanceType() {
		return this.instanceType;
	}
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
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
