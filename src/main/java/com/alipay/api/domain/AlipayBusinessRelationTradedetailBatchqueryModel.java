package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系经营数据详情分页查询
 *
 * @author auto create
 * @since 1.0, 2022-07-08 18:22:28
 */
public class AlipayBusinessRelationTradedetailBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5442958484674879926L;

	/**
	 * 商业关系id，如：商圈mallid
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商业关系组织子类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_sub_type")
	private String groupSubType;

	/**
	 * 商业关系组织类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 查询页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页查询大小，建议填10，限制最大为20
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 门店编号
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	/**
	 * 查询日期，格式：yyyyMMdd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupSubType() {
		return this.groupSubType;
	}
	public void setGroupSubType(String groupSubType) {
		this.groupSubType = groupSubType;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getRealShopNo() {
		return this.realShopNo;
	}
	public void setRealShopNo(String realShopNo) {
		this.realShopNo = realShopNo;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
