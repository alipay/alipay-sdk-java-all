package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 转化数据详情
 *
 * @author auto create
 * @since 1.0, 2024-04-18 11:00:57
 */
public class ConversionData extends AlipayObject {

	private static final long serialVersionUID = 2527462773429354589L;

	/**
	 * 广告id
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * 转化事件属性信息，用于转化事件类型相关属性规则上传。
可支持上传属性的转化事件类型及属性规则请参考该文档：<a href='https://adpub.alipay.com/adrlark/ivdktpyh511x9r6i'>转化事件类型属性规则</a>
	 */
	@ApiField("attributes")
	private ConversionProperty attributes;

	/**
	 * 转化流水号：由用户自定义，用于幂等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 转化回调扩展信息
	 */
	@ApiField("callback_ext_info")
	private String callbackExtInfo;

	/**
	 * 来自监测链接配置的__CID__宏参发生用户点击替换的值
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 转化金额，单位分
	 */
	@ApiField("conversion_amount")
	private String conversionAmount;

	/**
	 * 当source=COMMON_CONVERSION_ID时使用
	 */
	@ApiField("conversion_id")
	private String conversionId;

	/**
	 * 转化时间，UTC 时间戳，单位：秒
	 */
	@ApiField("conversion_time")
	private Long conversionTime;

	/**
	 * 转化事件类型数字
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

数据集id 当前字段已废弃(接口升级，该参数已不再使用，故废弃该参数，但不影响历史数据使用。)
	 */
	@ApiField("data_id")
	@Deprecated
	private String dataId;

	/**
	 * 当source=OTHER时使用:

数据类型：
KR_MEMBER - 客如云入会
KR_TRADE - 客如云交易
TB_LIVE -  淘宝直播 当前字段已废弃(接口升级，该参数已不再使用，故废弃该参数，但不影响历史数据使用。)
	 */
	@ApiField("data_src_type")
	@Deprecated
	private String dataSrcType;

	/**
	 * 单元ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * XLIGHT - 灯火归因
MERCHANT -商家自主归因
该字段若为空则默认为XLIGHT
	 */
	@ApiField("join_channel")
	private String joinChannel;

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
	 * 转化归因字段列表
	 */
	@ApiListField("property_list")
	@ApiField("conversion_property")
	private List<ConversionProperty> propertyList;

	/**
	 * 来源：
COMMON_TARGET-通用转化事件类型适用
CALLBACK-APP推广类转化事件类型适用
OTHER-其它
	 */
	@ApiField("source")
	private String source;

	/**
	 * 当source=OTHER时使用：
主体id，例如品牌id 当前字段已废弃(接口升级，该参数已不再使用，故废弃该参数，但不影响历史数据使用。)
	 */
	@ApiField("target_id")
	@Deprecated
	private String targetId;

	/**
	 * 当source=OTHER时使用：

主体类型：
BRAND - 品牌
STORE - 店铺
LIVE - 直播
等等 当前字段已废弃(接口升级，该参数已不再使用，故废弃该参数，但不影响历史数据使用。)
	 */
	@ApiField("target_type")
	@Deprecated
	private String targetType;

	/**
	 * 转化用户（发生真实转化的用户）唯一标识。
当uuid_type=PID时，传2088UID（例：208801217938xxxx）
	 */
	@ApiField("uuid")
	private String uuid;

	/**
	 * 支付宝用户在应用维度下的唯一标识
	 */
	@ApiField("uuid_open_id")
	private String uuidOpenId;

	/**
	 * 通用转化事件类型数据回传可使用：PID，表示转化用户唯一标志类型。
自建站转化事件类型可使用：PID_ENCRYPT，自建站转化事件类型编码:445~450。
app推广类转化事件类型可使用：
OAID_MD5：oaid md5值
IDFA_MD5：idfa md5值
IP+UA:ip ua拼接值
	 */
	@ApiField("uuid_type")
	private String uuidType;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

	public ConversionProperty getAttributes() {
		return this.attributes;
	}
	public void setAttributes(ConversionProperty attributes) {
		this.attributes = attributes;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCallbackExtInfo() {
		return this.callbackExtInfo;
	}
	public void setCallbackExtInfo(String callbackExtInfo) {
		this.callbackExtInfo = callbackExtInfo;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
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

	public String getJoinChannel() {
		return this.joinChannel;
	}
	public void setJoinChannel(String joinChannel) {
		this.joinChannel = joinChannel;
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

	public String getUuidOpenId() {
		return this.uuidOpenId;
	}
	public void setUuidOpenId(String uuidOpenId) {
		this.uuidOpenId = uuidOpenId;
	}

	public String getUuidType() {
		return this.uuidType;
	}
	public void setUuidType(String uuidType) {
		this.uuidType = uuidType;
	}

}
