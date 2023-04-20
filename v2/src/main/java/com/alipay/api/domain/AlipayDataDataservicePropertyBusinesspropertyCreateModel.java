package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁业务画像标签新增
 *
 * @author auto create
 * @since 1.0, 2019-10-16 21:36:21
 */
public class AlipayDataDataservicePropertyBusinesspropertyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3391651934528714933L;

	/**
	 * 业务负责人工号
	 */
	@ApiField("biz_owner_id")
	private String bizOwnerId;

	/**
	 * 业务画像消费类目id
	 */
	@ApiField("business_profile_category_id")
	private String businessProfileCategoryId;

	/**
	 * 业务画像ID
	 */
	@ApiField("business_profile_id")
	private String businessProfileId;

	/**
	 * 来源字段名
	 */
	@ApiField("column_name")
	private String columnName;

	/**
	 * 来源字段类型
	 */
	@ApiField("column_type")
	private String columnType;

	/**
	 * 创建人工号
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 数据负责人工号
	 */
	@ApiField("data_owner_id")
	private String dataOwnerId;

	/**
	 * 数据类型
NUMBER("数值型"),
STRING("文本型"),
DATE("日期型"),
ENUM("枚举型"),
LBS("经纬度类");
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 当数据类型为枚举型时，要指定枚举ID
	 */
	@ApiField("enum_id")
	private String enumId;

	/**
	 * 个性化信息，jsonarray字符串
	 */
	@ApiListField("personality_info")
	@ApiField("string")
	private List<String> personalityInfo;

	/**
	 * 物理数据源类型
ODPS,
HBASE,
KUDU,
ANTMETA,
XVIEW,
ANT_HBASE,
EXPLOER;
	 */
	@ApiField("physical_type")
	private String physicalType;

	/**
	 * 主键
	 */
	@ApiField("primary_key")
	private String primaryKey;

	/**
	 * 统计类型
ETL("ETL统计"),
MODEL("模型预测")
	 */
	@ApiField("proc_type")
	private String procType;

	/**
	 * 标签描述
	 */
	@ApiField("property_desc")
	private String propertyDesc;

	/**
	 * 标签名称
	 */
	@ApiField("propery_name")
	private String properyName;

	/**
	 * 质量负责人工号
	 */
	@ApiField("quality_owner_id")
	private String qualityOwnerId;

	/**
	 * 标签来源渠道
TABLE("数据表"),
FILE("文件"),
INTERFACE("接口"),
OBJECT_PROPERTY("公域标签")
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 来源表guid
	 */
	@ApiField("table_guid")
	private String tableGuid;

	public String getBizOwnerId() {
		return this.bizOwnerId;
	}
	public void setBizOwnerId(String bizOwnerId) {
		this.bizOwnerId = bizOwnerId;
	}

	public String getBusinessProfileCategoryId() {
		return this.businessProfileCategoryId;
	}
	public void setBusinessProfileCategoryId(String businessProfileCategoryId) {
		this.businessProfileCategoryId = businessProfileCategoryId;
	}

	public String getBusinessProfileId() {
		return this.businessProfileId;
	}
	public void setBusinessProfileId(String businessProfileId) {
		this.businessProfileId = businessProfileId;
	}

	public String getColumnName() {
		return this.columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnType() {
		return this.columnType;
	}
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getDataOwnerId() {
		return this.dataOwnerId;
	}
	public void setDataOwnerId(String dataOwnerId) {
		this.dataOwnerId = dataOwnerId;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getEnumId() {
		return this.enumId;
	}
	public void setEnumId(String enumId) {
		this.enumId = enumId;
	}

	public List<String> getPersonalityInfo() {
		return this.personalityInfo;
	}
	public void setPersonalityInfo(List<String> personalityInfo) {
		this.personalityInfo = personalityInfo;
	}

	public String getPhysicalType() {
		return this.physicalType;
	}
	public void setPhysicalType(String physicalType) {
		this.physicalType = physicalType;
	}

	public String getPrimaryKey() {
		return this.primaryKey;
	}
	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getProcType() {
		return this.procType;
	}
	public void setProcType(String procType) {
		this.procType = procType;
	}

	public String getPropertyDesc() {
		return this.propertyDesc;
	}
	public void setPropertyDesc(String propertyDesc) {
		this.propertyDesc = propertyDesc;
	}

	public String getProperyName() {
		return this.properyName;
	}
	public void setProperyName(String properyName) {
		this.properyName = properyName;
	}

	public String getQualityOwnerId() {
		return this.qualityOwnerId;
	}
	public void setQualityOwnerId(String qualityOwnerId) {
		this.qualityOwnerId = qualityOwnerId;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public String getTableGuid() {
		return this.tableGuid;
	}
	public void setTableGuid(String tableGuid) {
		this.tableGuid = tableGuid;
	}

}
