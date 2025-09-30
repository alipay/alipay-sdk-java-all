package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape创意组信息
 *
 * @author auto create
 * @since 1.0, 2023-07-26 20:10:40
 */
public class CreativeGroup extends AlipayObject {

	private static final long serialVersionUID = 3623395336664322259L;

	/**
	 * 素材组创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 项目组描述
	 */
	@ApiField("descrption")
	private String descrption;

	/**
	 * 创意组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 项目组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 创意组的包含的商品总数
	 */
	@ApiField("item_sum_count")
	private String itemSumCount;

	/**
	 * 创意组状态
	 */
	@ApiField("status")
	private String status;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescrption() {
		return this.descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getItemSumCount() {
		return this.itemSumCount;
	}
	public void setItemSumCount(String itemSumCount) {
		this.itemSumCount = itemSumCount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
