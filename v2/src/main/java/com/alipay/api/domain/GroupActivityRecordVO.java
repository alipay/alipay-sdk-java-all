package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 顶部运营位记录
 *
 * @author auto create
 * @since 1.0, 2024-09-11 17:04:31
 */
public class GroupActivityRecordVO extends AlipayObject {

	private static final long serialVersionUID = 2427923781222817647L;

	/**
	 * 商家群活动业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 展位位置  群福利(group_welfare),热门推荐(hot_recommend),群内消息卡片(group_msg_card)
	 */
	@ApiField("client_position")
	private String clientPosition;

	/**
	 * 活动截止时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 活动开始时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 商家群活动id
	 */
	@ApiField("group_activity_id")
	private String groupActivityId;

	/**
	 * 群组数量
	 */
	@ApiField("group_cnt")
	private Long groupCnt;

	/**
	 * 群组id列表，创建群组时对应的一个群组id
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 展示优先级 1-5, 数字越大优先级越高
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 商家群活动状态   INIT(初始化), CC_AUDITING(安全审核中), CC(安全审核驳回), PENDING(待生效), VALID(生效), SUSPEND(暂停), STOPPED(结束)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 活动标题，展示在c端小助手内的标题
	 */
	@ApiField("title")
	private String title;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getClientPosition() {
		return this.clientPosition;
	}
	public void setClientPosition(String clientPosition) {
		this.clientPosition = clientPosition;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getGroupActivityId() {
		return this.groupActivityId;
	}
	public void setGroupActivityId(String groupActivityId) {
		this.groupActivityId = groupActivityId;
	}

	public Long getGroupCnt() {
		return this.groupCnt;
	}
	public void setGroupCnt(Long groupCnt) {
		this.groupCnt = groupCnt;
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
