package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发送商家群内群发消息
 *
 * @author auto create
 * @since 1.0, 2024-09-30 21:05:17
 */
public class AlipayMerchantGroupGroupmsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 5819641543749965464L;

	/**
	 * 是否需要@所有人，不传默认false(不需要@所有人)
	 */
	@ApiField("at_all")
	private Boolean atAll;

	/**
	 * 商家自定义的业务id，会记录下来，在查询消息记录列表的时候返回
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 群组id列表
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 群发消息内容模型
	 */
	@ApiField("msg_data")
	private GroupMessageVO msgData;

	/**
	 * 推送的消息文案标题（参考：好物分享来咯！）
	 */
	@ApiField("title")
	private String title;

	public Boolean getAtAll() {
		return this.atAll;
	}
	public void setAtAll(Boolean atAll) {
		this.atAll = atAll;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public GroupMessageVO getMsgData() {
		return this.msgData;
	}
	public void setMsgData(GroupMessageVO msgData) {
		this.msgData = msgData;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
