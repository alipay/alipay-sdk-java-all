package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 转化数据详情
 *
 * @author auto create
 * @since 1.0, 2021-10-20 23:03:58
 */
public class ConversionData extends AlipayObject {

	private static final long serialVersionUID = 5649637787794413917L;

	/**
	 * 转化流水号，用于幂等

对于source=XLIGHT，转化流水号来自灯火的留资明细
对于source=DATASET/OTHER，转化流水号由调用方自定义
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 当source=DATASET或者OTHER时使用：

转化金额，单位分
	 */
	@ApiField("conversion_amount")
	private String conversionAmount;

	/**
	 * 当source=XLIGHT时使用:

转化事件id，来自推广页关联转化事件id
	 */
	@ApiField("conversion_id")
	private String conversionId;

	/**
	 * 转化时间，UTC 时间戳，单位：秒
	 */
	@ApiField("conversion_time")
	private Long conversionTime;

	/**
	 * 当source=XLIGHT时使用:

转化事件类型
	 */
	@ApiField("conversion_type")
	private String conversionType;

	/**
	 * 创意ID
	 */
	@ApiField("creative_id")
	private String creativeId;

	/**
	 * 当source=XLIGHT或者DATASET时使用：

数据集id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 当source=OTHER时使用:

数据类型：
KR_MEMBER - 客如云入会
KR_TRADE - 客如云交易
TB_LIVE -  淘宝直播
	 */
	@ApiField("data_src_type")
	private String dataSrcType;

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
	 * 商户在灯火pb端的id, 可代替principal_tag
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 商家标志，可代替principal_id
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 当source=DATASET或者OTHER时使用：

转化属性列表
	 */
	@ApiListField("property_list")
	@ApiField("conversion_property")
	private List<ConversionProperty> propertyList;

	/**
	 * 来源：
XLIGHT-灯火留资
DATASET-数据集
OTHER-其它
	 */
	@ApiField("source")
	private String source;

	/**
	 * 当source=OTHER时使用：
主体id，比如品牌id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 当source=OTHER时使用：

主体类型：
BRAND - 品牌
STORE - 店铺
LIVE - 直播
等等
	 */
	@ApiField("target_type")
	private String targetType;

	/**
	 * 当source=DATASET或者OTHER时使用：

转化用户唯一标识
	 */
	@ApiField("uuid")
	private String uuid;

	/**
	 * 当source=DATASET或者OTHER时使用：

转化客户唯一标志类型：
PID - 2088pid
	 */
	@ApiField("uuid_type")
	private String uuidType;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getConversionAmount() {
		return this.conversionAmount;
	}
	public void setConversionAmount(String conversionAmount) {
		this.conversionAmount = conversionAmount;
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

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataSrcType() {
		return this.dataSrcType;
	}
	public void setDataSrcType(String dataSrcType) {
		this.dataSrcType = dataSrcType;
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

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
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

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUuidType() {
		return this.uuidType;
	}
	public void setUuidType(String uuidType) {
		this.uuidType = uuidType;
	}

}
