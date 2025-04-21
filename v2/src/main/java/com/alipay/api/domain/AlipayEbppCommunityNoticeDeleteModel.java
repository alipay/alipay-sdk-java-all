package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公告删除
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:31:32
 */
public class AlipayEbppCommunityNoticeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1474712961691889923L;

	/**
	 * 支付宝公告id
	 */
	@ApiField("alipay_notice_id")
	private Long alipayNoticeId;

	/**
	 * 产品类型：
OWNER_CARD
电子业主卡
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 产品子类型： HANGZHOU_OWNER_CARD 杭州房管局电子业主卡
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public Long getAlipayNoticeId() {
		return this.alipayNoticeId;
	}
	public void setAlipayNoticeId(Long alipayNoticeId) {
		this.alipayNoticeId = alipayNoticeId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
