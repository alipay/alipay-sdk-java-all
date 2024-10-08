package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 顶部运营位创建
 *
 * @author auto create
 * @since 1.0, 2024-09-10 19:45:01
 */
public class AlipayMerchantGroupActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3616615749993545484L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 自定义活动顶部运营位内容
	 */
	@ApiField("custom_content")
	private CustomActivityContentVO customContent;

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
	 * 群组id列表，创建群组时对应的一个群组id
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 展示优先级
	 */
	@ApiField("priority")
	private Long priority;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public CustomActivityContentVO getCustomContent() {
		return this.customContent;
	}
	public void setCustomContent(CustomActivityContentVO customContent) {
		this.customContent = customContent;
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

}
