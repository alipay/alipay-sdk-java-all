package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车险内用户消息发送接口
 *
 * @author auto create
 * @since 1.0, 2022-12-28 16:55:51
 */
public class AlipayInsAutoUserMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 3796413892117695121L;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 扩展信息。因为车险触达用户的渠道有多种。不同渠道所需的扩展信息不同，开发前需和车险技术同学确认好。
	 */
	@ApiListField("extend_info")
	@ApiField("auto_mkt_touch_extend_info_entry")
	private List<AutoMktTouchExtendInfoEntry> extendInfo;

	/**
	 * 支付宝用户标识openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 场景码。【车险技术分配的场景码】
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 模版中的可变字段的值，根据不同场景，所需要的字段都不一样。要和车险业务以及技术确认好。
	 */
	@ApiListField("template_content_info")
	@ApiField("auto_mkt_touch_extend_info_entry")
	private List<AutoMktTouchExtendInfoEntry> templateContentInfo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public List<AutoMktTouchExtendInfoEntry> getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(List<AutoMktTouchExtendInfoEntry> extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public List<AutoMktTouchExtendInfoEntry> getTemplateContentInfo() {
		return this.templateContentInfo;
	}
	public void setTemplateContentInfo(List<AutoMktTouchExtendInfoEntry> templateContentInfo) {
		this.templateContentInfo = templateContentInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
