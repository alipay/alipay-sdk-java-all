package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝代运营商业关系异动门店处理接口
 *
 * @author auto create
 * @since 1.0, 2022-01-21 14:27:16
 */
public class AlipayBusinessRelationChangeprocessSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3576251387258696882L;

	/**
	 * 商业关系组织id 由组织信息创建接口返回或bd分配
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商业关系组织子类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_sub_type")
	private String groupSubType;

	/**
	 * 商业关系组织类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 异动数据处理状态
PROCESSED-已处理
	 */
	@ApiField("process_status")
	private String processStatus;

	/**
	 * 处理目标门店id，填real_shop_id
	 */
	@ApiField("process_target_id")
	private String processTargetId;

	/**
	 * 处理目标类型，默认SHOP
	 */
	@ApiField("process_target_type")
	private String processTargetType;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupSubType() {
		return this.groupSubType;
	}
	public void setGroupSubType(String groupSubType) {
		this.groupSubType = groupSubType;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getProcessTargetId() {
		return this.processTargetId;
	}
	public void setProcessTargetId(String processTargetId) {
		this.processTargetId = processTargetId;
	}

	public String getProcessTargetType() {
		return this.processTargetType;
	}
	public void setProcessTargetType(String processTargetType) {
		this.processTargetType = processTargetType;
	}

}
