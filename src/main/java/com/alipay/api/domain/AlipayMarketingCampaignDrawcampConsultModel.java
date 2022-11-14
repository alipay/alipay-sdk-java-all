package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动咨询
 *
 * @author auto create
 * @since 1.0, 2019-12-25 14:17:57
 */
public class AlipayMarketingCampaignDrawcampConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6446518834242947542L;

	/**
	 * 营销海豚活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 扩展字段Map，格式为{"key","value"}，其中key需要与支付宝营销平台约定
	 */
	@ApiField("ext_params")
	private ConsultExtParams extParams;

	/**
	 * 指定过滤奖品id列表，最多支持10个，多个奖品用英文逗号分割，为空时咨询活动下所有的奖品
	 */
	@ApiField("prize_id_list")
	private String prizeIdList;

	/**
	 * 系统来源，接入请和支付宝营销平台开发or产品同学申请
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public ConsultExtParams getExtParams() {
		return this.extParams;
	}
	public void setExtParams(ConsultExtParams extParams) {
		this.extParams = extParams;
	}

	public String getPrizeIdList() {
		return this.prizeIdList;
	}
	public void setPrizeIdList(String prizeIdList) {
		this.prizeIdList = prizeIdList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
