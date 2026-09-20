package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 主叫号码列表_外呼号码下拉
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:12
 */
public class DatadigitalAicsDevinPhonenumberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2189147763694138388L;

	/**
	 * 业务场景描述
	 */
	@ApiField("business_scene_desc")
	private String businessSceneDesc;

	/**
	 * 查询结束时间（毫秒时间戳）
	 */
	@ApiField("gmt_end")
	private Long gmtEnd;

	/**
	 * 查询起始时间（毫秒时间戳）
	 */
	@ApiField("gmt_start")
	private Long gmtStart;

	/**
	 * 当前页码，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 电话号码（筛选）
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 用途
	 */
	@ApiField("phone_usage")
	private String phoneUsage;

	/**
	 * 路由类型
	 */
	@ApiField("route_type")
	private Long routeType;

	/**
	 * 路由值
	 */
	@ApiField("route_value")
	private String routeValue;

	/**
	 * null
	 */
	@ApiListField("route_values")
	@ApiField("string")
	private List<String> routeValues;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getBusinessSceneDesc() {
		return this.businessSceneDesc;
	}
	public void setBusinessSceneDesc(String businessSceneDesc) {
		this.businessSceneDesc = businessSceneDesc;
	}

	public Long getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Long gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Long getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Long gmtStart) {
		this.gmtStart = gmtStart;
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

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneUsage() {
		return this.phoneUsage;
	}
	public void setPhoneUsage(String phoneUsage) {
		this.phoneUsage = phoneUsage;
	}

	public Long getRouteType() {
		return this.routeType;
	}
	public void setRouteType(Long routeType) {
		this.routeType = routeType;
	}

	public String getRouteValue() {
		return this.routeValue;
	}
	public void setRouteValue(String routeValue) {
		this.routeValue = routeValue;
	}

	public List<String> getRouteValues() {
		return this.routeValues;
	}
	public void setRouteValues(List<String> routeValues) {
		this.routeValues = routeValues;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
