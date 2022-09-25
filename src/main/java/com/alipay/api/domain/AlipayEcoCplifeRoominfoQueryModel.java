package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户根据需要调用该接口查询小区房屋信息列表。
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:33:14
 */
public class AlipayEcoCplifeRoominfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6484953398743139513L;

	/**
	 * 传入该小区在支付宝社区物业平台中的唯一编号，通过小区创建和查询接口获取。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 分页查询的页码数，分页从1开始计数。该参数不传入的时候，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询的每页最大数据条数。默认为200
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
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
