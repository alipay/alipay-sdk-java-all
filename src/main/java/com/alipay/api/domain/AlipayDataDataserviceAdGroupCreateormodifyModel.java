package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建/修改单元
 *
 * @author auto create
 * @since 1.0, 2019-11-01 10:45:15
 */
public class AlipayDataDataserviceAdGroupCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 8749482536592598271L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

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
	 * 外部唯一计划编号
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

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

	public String getPlanOuterId() {
		return this.planOuterId;
	}
	public void setPlanOuterId(String planOuterId) {
		this.planOuterId = planOuterId;
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
