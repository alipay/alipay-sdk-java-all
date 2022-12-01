package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建/修改单元
 *
 * @author auto create
 * @since 1.0, 2021-08-24 19:47:47
 */
public class AlipayDataDataserviceAdGroupCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 7291799857786145668L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 数据集id列表
	 */
	@ApiListField("conversion_data_id_list")
	@ApiField("string")
	private List<String> conversionDataIdList;

	/**
	 * 转化事件编号（废弃）。若此字段不为空，则要求conversion_type也不为空，且此转化事件与转化事件类型conversion_type匹配
	 */
	@ApiField("conversion_id")
	private String conversionId;

	/**
	 * 转化目标之转化事件id列表
	 */
	@ApiListField("conversion_id_list")
	@ApiField("string")
	private List<String> conversionIdList;

	/**
	 * 转化事件类型：
CPA_TAO_XI：淘系店铺关注
CPA_TMALL_MEMBER_JOIN：淘系店铺入会
	 */
	@ApiField("conversion_type")
	private String conversionType;

	/**
	 * 业务扩展参数字段，根据第三方需要使用，投放端只做存储并向检索端透传
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 单元出价，单位：分
	 */
	@ApiField("group_charge")
	private Long groupCharge;

	/**
	 * 单元名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 外部唯一单元编号
	 */
	@ApiField("group_outer_id")
	private String groupOuterId;

	/**
	 * 单元状态：ENABLE-生效；DISABLE-暂停。
若此入参字段为空：新建单元时此字段默认有效；修改单元此字段默认为单元当前状态。
	 */
	@ApiField("group_status")
	private String groupStatus;

	/**
	 * 商品id列表
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * 是否使用OCPX智能出价，只再CPC场景下，支持开启OCPX： OPEN: 打开；CLOSE: 关闭
	 */
	@ApiField("ocpx_switch")
	private String ocpxSwitch;

	/**
	 * 外部唯一计划编号
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

	/**
	 * 转化目标成本，只有开启OCPX后才需要配置，单位为分
	 */
	@ApiField("target_cpa")
	private Long targetCpa;

	/**
	 * 定向扩展信息
	 */
	@ApiField("targeting_extend_info")
	private String targetingExtendInfo;

	/**
	 * 单元定向列表。目前支持的定向类型有：
REGION_LIST: 实时地址
AD_POS_LIST: 广告位定向
OUTER_KOUBEI_INTEREST_TAG_LIST: 口碑偏好
OUTER_KOUBEI_CROWD_TAG_LIST：口碑人群
	 */
	@ApiListField("targeting_list")
	@ApiField("outer_targeting_item")
	private List<OuterTargetingItem> targetingList;

	/**
	 * 投放区间内的投放时段
	 */
	@ApiField("time_option")
	private String timeOption;

	/**
	 * 投放时段配置，bitmap。规则：7个int用「,」分隔组成的字符串；每个int中第0位表示0点，第1位表示1点。如此类推; 7个int的排序是星期日、星期一、星期二、星期三、星期四、星期五、星期六
	 */
	@ApiField("time_schema")
	private String timeSchema;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<String> getConversionDataIdList() {
		return this.conversionDataIdList;
	}
	public void setConversionDataIdList(List<String> conversionDataIdList) {
		this.conversionDataIdList = conversionDataIdList;
	}

	public String getConversionId() {
		return this.conversionId;
	}
	public void setConversionId(String conversionId) {
		this.conversionId = conversionId;
	}

	public List<String> getConversionIdList() {
		return this.conversionIdList;
	}
	public void setConversionIdList(List<String> conversionIdList) {
		this.conversionIdList = conversionIdList;
	}

	public String getConversionType() {
		return this.conversionType;
	}
	public void setConversionType(String conversionType) {
		this.conversionType = conversionType;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Long getGroupCharge() {
		return this.groupCharge;
	}
	public void setGroupCharge(Long groupCharge) {
		this.groupCharge = groupCharge;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupOuterId() {
		return this.groupOuterId;
	}
	public void setGroupOuterId(String groupOuterId) {
		this.groupOuterId = groupOuterId;
	}

	public String getGroupStatus() {
		return this.groupStatus;
	}
	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public String getOcpxSwitch() {
		return this.ocpxSwitch;
	}
	public void setOcpxSwitch(String ocpxSwitch) {
		this.ocpxSwitch = ocpxSwitch;
	}

	public String getPlanOuterId() {
		return this.planOuterId;
	}
	public void setPlanOuterId(String planOuterId) {
		this.planOuterId = planOuterId;
	}

	public Long getTargetCpa() {
		return this.targetCpa;
	}
	public void setTargetCpa(Long targetCpa) {
		this.targetCpa = targetCpa;
	}

	public String getTargetingExtendInfo() {
		return this.targetingExtendInfo;
	}
	public void setTargetingExtendInfo(String targetingExtendInfo) {
		this.targetingExtendInfo = targetingExtendInfo;
	}

	public List<OuterTargetingItem> getTargetingList() {
		return this.targetingList;
	}
	public void setTargetingList(List<OuterTargetingItem> targetingList) {
		this.targetingList = targetingList;
	}

	public String getTimeOption() {
		return this.timeOption;
	}
	public void setTimeOption(String timeOption) {
		this.timeOption = timeOption;
	}

	public String getTimeSchema() {
		return this.timeSchema;
	}
	public void setTimeSchema(String timeSchema) {
		this.timeSchema = timeSchema;
	}

}
