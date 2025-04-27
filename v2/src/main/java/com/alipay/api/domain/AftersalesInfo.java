package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 售后详情
 *
 * @author auto create
 * @since 1.0, 2025-04-27 18:27:27
 */
public class AftersalesInfo extends AlipayObject {

	private static final long serialVersionUID = 7691266288783758831L;

	/**
	 * 售后单编号
	 */
	@ApiField("aftersales_id")
	private String aftersalesId;

	/**
	 * 售后单状态
	 */
	@ApiField("aftersales_status")
	private String aftersalesStatus;

	/**
	 * 卡编号
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 售后发起时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 用户发起售后的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * null
	 */
	@ApiListField("proofs")
	@ApiField("string")
	private List<String> proofs;

	/**
	 * 售后发起原因
	 */
	@ApiField("reason")
	private String reason;

	public String getAftersalesId() {
		return this.aftersalesId;
	}
	public void setAftersalesId(String aftersalesId) {
		this.aftersalesId = aftersalesId;
	}

	public String getAftersalesStatus() {
		return this.aftersalesStatus;
	}
	public void setAftersalesStatus(String aftersalesStatus) {
		this.aftersalesStatus = aftersalesStatus;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<String> getProofs() {
		return this.proofs;
	}
	public void setProofs(List<String> proofs) {
		this.proofs = proofs;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
