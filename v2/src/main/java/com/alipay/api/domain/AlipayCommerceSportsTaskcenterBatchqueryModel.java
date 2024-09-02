package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询用户任务信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 20:01:52
 */
public class AlipayCommerceSportsTaskcenterBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3579424741414493832L;

	/**
	 * SPORTS_CENTER(文体中心),
YAYUN_GAME(亚运一站通),
PATH_CENTER(路线中心),
RIGHTS_CENTER(权益中心),
ANT_SPORTS(支付宝运动)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 任务分组ID
	 */
	@ApiField("task_group_id")
	private String taskGroupId;

	/**
	 * 任务ID集合，可为空。 当taskGroupId不为空时,会根据taskGroupId查任务集合； 当taskGroupId为空时,会根据taskIdList查任务集合。
	 */
	@ApiListField("task_id_list")
	@ApiField("string")
	private List<String> taskIdList;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTaskGroupId() {
		return this.taskGroupId;
	}
	public void setTaskGroupId(String taskGroupId) {
		this.taskGroupId = taskGroupId;
	}

	public List<String> getTaskIdList() {
		return this.taskIdList;
	}
	public void setTaskIdList(List<String> taskIdList) {
		this.taskIdList = taskIdList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
