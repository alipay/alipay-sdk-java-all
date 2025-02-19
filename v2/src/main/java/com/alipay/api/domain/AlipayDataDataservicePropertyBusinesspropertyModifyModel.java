package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁业务画像标签编辑
 *
 * @author auto create
 * @since 1.0, 2019-10-16 21:35:53
 */
public class AlipayDataDataservicePropertyBusinesspropertyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1424191971791914436L;

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
	 * 业务画像标签id
	 */
	@ApiField("business_property_id")
	private String businessPropertyId;

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
	 * 数据类型 NUMBER("数值型"), STRING("文本型"), DATE("日期型"), ENUM("枚举型"), LBS("经纬度类");
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
	 * 统计类型 ETL("ETL统计"), MODEL("模型预测")
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

	public String getBusinessPropertyId() {
		return this.businessPropertyId;
	}
	public void setBusinessPropertyId(String businessPropertyId) {
		this.businessPropertyId = businessPropertyId;
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

}
