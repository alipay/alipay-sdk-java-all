package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系经营数据分页查询
 *
 * @author auto create
 * @since 1.0, 2022-06-16 20:24:25
 */
public class AlipayBusinessRelationTradedataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8582551588323526817L;

	/**
	 * 日期类型，DAY:日，MONTH:月
	 */
	@ApiField("date_type")
	private String dateType;

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
	private Long pageNum;

	/**
	 * 每页查询大小，建议填10，限制最大为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 开始日期，如果data_type为DAY时，start_date格式为yyyyMMdd，如果data_type为MONTH时，start_date格式为yyyyMM
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 目标类型，MALL:商圈，SHOP:门店
	 */
	@ApiField("target_type")
	private String targetType;

	public String getDateType() {
		return this.dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
