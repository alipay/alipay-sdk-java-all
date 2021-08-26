package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务画像标签对外模型类
 *
 * @author auto create
 * @since 1.0, 2019-10-16 20:55:00
 */
public class BusinessPropertyDTO extends AlipayObject {

	private static final long serialVersionUID = 7454864347116493826L;

	/**
	 * 业务负责人工号
	 */
	@ApiField("biz_owner_id")
	private String bizOwnerId;

	/**
	 * 所属业务画像id
	 */
	@ApiField("business_profile_id")
	private String businessProfileId;

	/**
	 * 业务画像标签id
	 */
	@ApiField("business_property_id")
	private String businessPropertyId;

	/**
	 * is_vip
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
	 * 英文名称
	 */
	@ApiField("english_name")
	private String englishName;

	/**
	 * 个性化信息
	 */
	@ApiListField("personality_info")
	@ApiField("personality_info_d_t_o")
	private List<PersonalityInfoDTO> personalityInfo;

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
	 * 标签状态
	 */
	@ApiField("stauts")
	private String stauts;

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

	public String getBusinessProfileId() {
		return this.businessProfileId;
	}
	public void setBusinessProfileId(String businessProfileId) {
		this.businessProfileId = businessProfileId;
	}

	public String getBusinessPropertyId() {
		return this.businessPropertyId;
	}
	public void setBusinessPropertyId(String businessPropertyId) {
		this.businessPropertyId = businessPropertyId;
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

	public String getEnglishName() {
		return this.englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public List<PersonalityInfoDTO> getPersonalityInfo() {
		return this.personalityInfo;
	}
	public void setPersonalityInfo(List<PersonalityInfoDTO> personalityInfo) {
		this.personalityInfo = personalityInfo;
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

	public String getStauts() {
		return this.stauts;
	}
	public void setStauts(String stauts) {
		this.stauts = stauts;
	}

	public String getTableGuid() {
		return this.tableGuid;
	}
	public void setTableGuid(String tableGuid) {
		this.tableGuid = tableGuid;
	}

}
