package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务反馈上报
 *
 * @author auto create
 * @since 1.0, 2024-05-29 22:26:07
 */
public class AlipayEbppIndustryGovserviceRecommendSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5673619651992546127L;

	/**
	 * 信息透出渠道，如alipay、wechat、app等等
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 上报记录
	 */
	@ApiListField("feedback_record_list")
	@ApiField("feedback_record")
	private List<FeedbackRecord> feedbackRecordList;

	/**
	 * 当其他端不支持支付宝uid时，用于标识用户的唯一标识
	 */
	@ApiField("identify_id")
	private String identifyId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构所属pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<FeedbackRecord> getFeedbackRecordList() {
		return this.feedbackRecordList;
	}
	public void setFeedbackRecordList(List<FeedbackRecord> feedbackRecordList) {
		this.feedbackRecordList = feedbackRecordList;
	}

	public String getIdentifyId() {
		return this.identifyId;
	}
	public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
