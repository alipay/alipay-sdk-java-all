package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 转化数据详情
 *
 * @author auto create
 * @since 1.0, 2020-12-28 15:33:35
 */
public class ConversionData extends AlipayObject {

	private static final long serialVersionUID = 7372638275574331477L;

	/**
	 * 留资流水号，用于source=XLIGHT
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 转化事件ID
	 */
	@ApiField("conversion_id")
	private String conversionId;

	/**
	 * 转化时间，UTC 时间戳，单位：秒
	 */
	@ApiField("conversion_time")
	private Long conversionTime;

	/**
	 * 转化事件类型
	 */
	@ApiField("conversion_type")
	private String conversionType;

	/**
	 * 创意ID
	 */
	@ApiField("creative_id")
	private String creativeId;

	/**
	 * 单元ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 商家标志
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 留资数据列表，用于source=OTHER
	 */
	@ApiListField("property_list")
	@ApiField("conversion_property")
	private List<ConversionProperty> propertyList;

	/**
	 * 留资来源：XLIGHT-灯火留资；OTHER-其它
	 */
	@ApiField("source")
	private String source;

	/**
	 * 转化用户唯一标识
	 */
	@ApiField("uuid")
	private String uuid;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getConversionId() {
		return this.conversionId;
	}
	public void setConversionId(String conversionId) {
		this.conversionId = conversionId;
	}

	public Long getConversionTime() {
		return this.conversionTime;
	}
	public void setConversionTime(Long conversionTime) {
		this.conversionTime = conversionTime;
	}

	public String getConversionType() {
		return this.conversionType;
	}
	public void setConversionType(String conversionType) {
		this.conversionType = conversionType;
	}

	public String getCreativeId() {
		return this.creativeId;
	}
	public void setCreativeId(String creativeId) {
		this.creativeId = creativeId;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public List<ConversionProperty> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<ConversionProperty> propertyList) {
		this.propertyList = propertyList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
