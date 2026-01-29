package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 转化数据详情
 *
 * @author auto create
 * @since 1.0, 2024-09-25 14:10:19
 */
public class ConversionData extends AlipayObject {

	private static final long serialVersionUID = 2471332768625495839L;

	/**
	 * 广告创意id，来自：<a href='https://adpub.alipay.com/lark/adrlark/qm1v2gtpvcftele4'>监测上报</a>或<a href='https://adpub.alipay.com/lark/adrlark/gw3740rggm4n5gar'>落地页宏替换</a>配置的__AD_ID__宏参发生用户点击替换后的值
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * 转化事件属性信息，用于转化事件类型相关属性规则上传。
可支持上传属性的转化事件类型及属性规则请参考该文档：<a href='https://adpub.alipay.com/adrlark/ivdktpyh511x9r6i'>转化事件类型属性规则</a>
	 */
	@ApiListField("attribute_list")
	@ApiField("conversion_property")
	private List<ConversionProperty> attributeList;

	/**
	 * 转化事件属性信息，用于转化事件类型相关属性规则上传。
可支持上传属性的转化事件类型及属性规则请参考该文档：<a href='https://adpub.alipay.com/adrlark/ivdktpyh511x9r6i'>转化事件类型属性规则</a> 当前字段已废弃(attributes命名不符合规范，需改名)
	 */
	@ApiField("attributes")
	@Deprecated
	private ConversionProperty attributes;

	/**
	 * 转化流水号：由用户自定义，用于幂等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 来自：<a href='https://adpub.alipay.com/lark/adrlark/qm1v2gtpvcftele4'>监测上报</a>或<a href='https://adpub.alipay.com/lark/adrlark/gw3740rggm4n5gar'>落地页宏替换</a>配置的__CALLBACK_EXT_INFO__宏参发生用户点击替换后的值，需url decode后传回。
	 */
	@ApiField("callback_ext_info")
	private String callbackExtInfo;

	/**
	 * 用于精准归因，来自：<a href='https://adpub.alipay.com/lark/adrlark/qm1v2gtpvcftele4'>监测上报</a>或<a href='https://adpub.alipay.com/lark/adrlark/gw3740rggm4n5gar'>落地页宏替换</a>配置的__CID__宏参发生用户点击替换后的值。<br>
支持cid上报的转化事件类型请参见：<br>
<a href='https://adpub.alipay.com/lark/adrlark/pg4vb1c0g0u6fx7b'>app推广类转化事件类型</a><br>
<a href='https://adpub.alipay.com/lark/adrlark/rvzylhryxh37yplt'>通用类转化事件类型</a>
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 转化金额，单位分。
金额类转化事件必传
	 */
	@ApiField("conversion_amount")
	private String conversionAmount;

	/**
	 * 转化事件id，当source=COMMON_CONVERSION_ID需上传该字段，其他情况无需上传。
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
	 * 广告创意id，来自：<a href='https://adpub.alipay.com/lark/adrlark/qm1v2gtpvcftele4'>监测上报</a>或<a href='https://adpub.alipay.com/lark/adrlark/gw3740rggm4n5gar'>落地页宏替换</a>配置的__AD_ID__宏参发生用户点击替换后的值
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
	 * 广告单元id，来自：<a href='https://adpub.alipay.com/lark/adrlark/qm1v2gtpvcftele4'>监测上报</a>或<a href='https://adpub.alipay.com/lark/adrlark/gw3740rggm4n5gar'>落地页宏替换</a>配置的__GROUP_ID__宏参发生用户点击替换后的值
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
	 * 广告计划id，来自：<a href='https://adpub.alipay.com/lark/adrlark/qm1v2gtpvcftele4'>监测上报</a>或<a href='https://adpub.alipay.com/lark/adrlark/gw3740rggm4n5gar'>落地页宏替换</a>配置的__PLAN_ID__宏参发生用户点击替换后的值
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 商户在灯火pb端的id, 可代替principal_tag。
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 商家标志，可代替principal_id。获取方法：
<a href='https://adpub.alipay.com/lark/adrlark/sbk3vetg6ki5m4r8'>principal_tag获取sop</a><br>
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 转化归因字段列表。不同转化事件类型回传property_list不同。请参见回传示例：<br>
<a href="https://adpub.alipay.com/lark/adrlark/pvbgwf72ea090877">通用类转化事件回传示例</a><br>
<a href="https://adpub.alipay.com/lark/adrlark/kgnnk94p0p1mwbgp">APP推广类转化事件回传示例</a><br>
	 */
	@ApiListField("property_list")
	@ApiField("conversion_property")
	private List<ConversionProperty> propertyList;

	/**
	 * <br>
COMMON_TARGET：<a href='https://adpub.alipay.com/lark/adrlark/rvzylhryxh37yplt'>通用类转化事件类型</a>适用<br>
CALLBACK：<a href='https://adpub.alipay.com/lark/adrlark/pg4vb1c0g0u6fx7b'>APP推广类转化事件类型</a>适用<br>
不同source的参数回传规则请参考：
COMMON_TARGET：<a href='https://adpub.alipay.com/lark/adrlark/dxw7fkkdnhm45spm'>通用转化回传参数说明</a><br>
CALLBACK：
<a href='https://adpub.alipay.com/lark/adrlark/wxou6agg3z1o6wyn'>APP推广类转化回传参数说明</a>
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
	 * 发生转化用户的唯一标识。
uuid_type不同，uuid传值不同：<br>
1. 若uuid_type=【PID】：uuid为发生转化用户的2088id。若获取不到，可固定一个值后，上传callback_ext_info参数。<br>
2. 若uuid_type=【OAID_MD5】【IDFA_MD5】【IP_UA】【CAID】【MEI】: uuid传的值为<a href='https://adpub.alipay.com/lark/adrlark/qm1v2gtpvcftele4'>监测上报</a>或<a href='https://adpub.alipay.com/lark/adrlark/gw3740rggm4n5gar'>落地页宏替换</a>配置的对应宏参下发的值<br>
其中当uuid_type=IP_UA时：__IP__、__UA__宏参需用"_"拼接上传<br>
	 */
	@ApiField("uuid")
	private String uuid;

	/**
	 * 支付宝用户在应用维度下的唯一标识
	 */
	@ApiField("uuid_open_id")
	private String uuidOpenId;

	/**
	 * <a href='https://adpub.alipay.com/lark/adrlark/rvzylhryxh37yplt'>通用类转化事件类型：</a><br>
uuid_type固定为PID：表示转化用户唯一标识<br>
<a href='https://adpub.alipay.com/lark/adrlark/pg4vb1c0g0u6fx7b'>APP推广类转化事件类型：</a><br>
OAID_MD5：表示OAID原值MD5加密后的值<br>
IDFA_MD5：表示IDFA原值MD5加密后的值<br>
IP_UA：表示IP_UA拼接值，以下划线拼接<br>
CAID：表示CAID原值<br>
IMEI：表示IMEI原值<br>
	 */
	@ApiField("uuid_type")
	private String uuidType;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

	public List<ConversionProperty> getAttributeList() {
		return this.attributeList;
	}
	public void setAttributeList(List<ConversionProperty> attributeList) {
		this.attributeList = attributeList;
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
