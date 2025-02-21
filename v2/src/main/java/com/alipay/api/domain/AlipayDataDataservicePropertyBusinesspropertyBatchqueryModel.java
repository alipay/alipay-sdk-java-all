package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁业务画像标签元信息批量查询
 *
 * @author auto create
 * @since 1.0, 2019-10-16 20:55:00
 */
public class AlipayDataDataservicePropertyBusinesspropertyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4491937751198798781L;

	/**
	 * 业务画像id
	 */
	@ApiField("business_profile_id")
	private String businessProfileId;

	/**
	 * 业务画像标签id列表，逗号分隔
	 */
	@ApiListField("business_property_ids")
	@ApiField("string")
	private List<String> businessPropertyIds;

	/**
	 * 业务画像标签对应的columnGuid
	 */
	@ApiField("column_guid")
	private String columnGuid;

	/**
	 * 标签名称
	 */
	@ApiField("property_name")
	private String propertyName;

	/**
	 * 标签状态，逗号分隔
	 */
	@ApiListField("status")
	@ApiField("string")
	private List<String> status;

	/**
	 * 业务画像标签对应的tableGuid
	 */
	@ApiField("table_guid")
	private String tableGuid;

	public String getBusinessProfileId() {
		return this.businessProfileId;
	}
	public void setBusinessProfileId(String businessProfileId) {
		this.businessProfileId = businessProfileId;
	}

	public List<String> getBusinessPropertyIds() {
		return this.businessPropertyIds;
	}
	public void setBusinessPropertyIds(List<String> businessPropertyIds) {
		this.businessPropertyIds = businessPropertyIds;
	}

	public String getColumnGuid() {
		return this.columnGuid;
	}
	public void setColumnGuid(String columnGuid) {
		this.columnGuid = columnGuid;
	}

	public String getPropertyName() {
		return this.propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public List<String> getStatus() {
		return this.status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}

	public String getTableGuid() {
		return this.tableGuid;
	}
	public void setTableGuid(String tableGuid) {
		this.tableGuid = tableGuid;
	}

}
