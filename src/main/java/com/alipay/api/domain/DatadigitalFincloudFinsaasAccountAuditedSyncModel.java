package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户卡状态同步-已批核
 *
 * @author auto create
 * @since 1.0, 2022-08-05 11:18:05
 */
public class DatadigitalFincloudFinsaasAccountAuditedSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3598974987866349934L;

	/**
	 * 用户有几张卡。如果是新申请卡（之前没有卡），那么值为1
	 */
	@ApiField("bank_cards_number")
	private Long bankCardsNumber;

	/**
	 * 标识用户活动数据的唯一id
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 批核通过时间
	 */
	@ApiField("gmt_audited")
	private Date gmtAudited;

	public Long getBankCardsNumber() {
		return this.bankCardsNumber;
	}
	public void setBankCardsNumber(Long bankCardsNumber) {
		this.bankCardsNumber = bankCardsNumber;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Date getGmtAudited() {
		return this.gmtAudited;
	}
	public void setGmtAudited(Date gmtAudited) {
		this.gmtAudited = gmtAudited;
	}

}
