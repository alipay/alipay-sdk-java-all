package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动详情信息
 *
 * @author auto create
 * @since 1.0, 2018-01-05 10:43:59
 */
public class CampDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 6595245766736424447L;

	/**
	 * 活动开始时间
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 业务id，与bizType 一一对应，如：biz_type为消费送，biz_id为消费送活动id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型：CONSUME_SEND：消费送；MRT_DISCOUNT:商户立减；OBTAIN:通用领券
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 活动描述
	 */
	@ApiField("camp_desc")
	private String campDesc;

	/**
	 * 需要解析该json串，title为标题，details是描述，多个detail需要换行
	 */
	@ApiField("camp_guide")
	private String campGuide;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展字段信息，用Map对象json串保存
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 活动规则标识列表，列表中存在的标识，代表该活动包含对应的规则。目前只有人群规则一种。标识说明：
CROWD：人群规则
	 */
	@ApiListField("rule_flag_list")
	@ApiField("string")
	private List<String> ruleFlagList;

	/**
	 * 每人每日参与次数 -1为不限制
	 */
	@ApiField("win_limit_daily")
	private String winLimitDaily;

	/**
	 * 每人总参与次数 -1 为不限制
	 */
	@ApiField("win_limit_life")
	private String winLimitLife;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCampDesc() {
		return this.campDesc;
	}
	public void setCampDesc(String campDesc) {
		this.campDesc = campDesc;
	}

	public String getCampGuide() {
		return this.campGuide;
	}
	public void setCampGuide(String campGuide) {
		this.campGuide = campGuide;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<String> getRuleFlagList() {
		return this.ruleFlagList;
	}
	public void setRuleFlagList(List<String> ruleFlagList) {
		this.ruleFlagList = ruleFlagList;
	}

	public String getWinLimitDaily() {
		return this.winLimitDaily;
	}
	public void setWinLimitDaily(String winLimitDaily) {
		this.winLimitDaily = winLimitDaily;
	}

	public String getWinLimitLife() {
		return this.winLimitLife;
	}
	public void setWinLimitLife(String winLimitLife) {
		this.winLimitLife = winLimitLife;
	}

}
