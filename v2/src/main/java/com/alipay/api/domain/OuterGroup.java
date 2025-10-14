package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单元详情
 *
 * @author auto create
 * @since 1.0, 2021-04-01 17:04:40
 */
public class OuterGroup extends AlipayObject {

	private static final long serialVersionUID = 7297681176223783138L;

	/**
	 * 转化目标之转化事件id列表
	 */
	@ApiListField("conversion_id_list")
	@ApiField("string")
	private List<String> conversionIdList;

	/**
	 * 计费点
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
	 * 单元id
	 */
	@ApiField("group_id")
	private Long groupId;

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
	 * 单元状态：
ENABLE-生效
DISABLE-暂停
DELETE-已删除
INIT-初始化
REAL_DISABLE-失效
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

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
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
