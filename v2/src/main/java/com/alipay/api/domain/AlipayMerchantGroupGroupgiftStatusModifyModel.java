package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改入群有礼状态
 *
 * @author auto create
 * @since 1.0, 2024-07-30 14:29:52
 */
public class AlipayMerchantGroupGroupgiftStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4552743497658454227L;

	/**
	 * 渠道code
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 群组id，表里唯一键，创建群组自动生成
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 入群有礼更新状态，对指定群组、指定渠道更新状态 。操作说明：1、状态valid生效中时，只能进行invalid停用 或 delete删除操作2、状态suspend已暂停时，只能进行valid启用 或 delete删除操作。3、所有状态都支持delete删除操作。 状态流转如下： valid(生效状态) -> suspend(已暂停状态)；valid(生效中状态) -> delete(删除状态)； suspend(已暂停状态) -> valid(生效状态)； suspend(已暂停状态) -> delete(删除状态)；init(未生效状态) -> delete(删除状态)；invalid(已失效状态) -> delete(删除状态)；expire(已过期状态) -> delete(删除状态)。
	 */
	@ApiField("status")
	private String status;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
