package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务搜索申请单分页入参
 *
 * @author auto create
 * @since 1.0, 2023-07-25 10:38:44
 */
public class SearchApplyPageQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 3345498553484451619L;

	/**
	 * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 筛选状态数组 AUDIT AGREE REJECT CANCEL EDIT
	 */
	@ApiListField("audit_status_list")
	@ApiField("string")
	private List<String> auditStatusList;

	/**
	 * 类目编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 服务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 页面的显示记录条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 小程序appid
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 起始记录，起始：0
	 */
	@ApiField("start_row")
	private String startRow;

	/**
	 * 二级服务code
	 */
	@ApiField("sub_service_code")
	private String subServiceCode;

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public List<String> getAuditStatusList() {
		return this.auditStatusList;
	}
	public void setAuditStatusList(List<String> auditStatusList) {
		this.auditStatusList = auditStatusList;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getStartRow() {
		return this.startRow;
	}
	public void setStartRow(String startRow) {
		this.startRow = startRow;
	}

	public String getSubServiceCode() {
		return this.subServiceCode;
	}
	public void setSubServiceCode(String subServiceCode) {
		this.subServiceCode = subServiceCode;
	}

}
