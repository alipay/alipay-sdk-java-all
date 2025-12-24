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
 * @since 1.0, 2025-06-17 15:47:28
 */
public class AftersalesInfo extends AlipayObject {

	private static final long serialVersionUID = 4193116198857611478L;

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
	 * 咨询的违约金金额，单位分，这个违约金金额是根据制卡时设置的规则以及当前卡所剩价值算出来的，无需违约金则为0
	 */
	@ApiField("consult_damages_cash")
	private Long consultDamagesCash;

	/**
	 * 咨询的退款金额，单位分，即当前卡所剩价值
	 */
	@ApiField("consult_refund_cash")
	private Long consultRefundCash;

	/**
	 * 售后发起时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 实际的违约金金额，单位分，最大不超过consultDamagesCash，商家可以调小，最小为0。售后单状态为待商家确认时，此字段没值。
	 */
	@ApiField("damages_cash")
	private Long damagesCash;

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

	/**
	 * 当前售后的卡在购卡的时候是否签署了购卡协议
	 */
	@ApiField("signed_order_agreement")
	private Boolean signedOrderAgreement;

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

	public Long getConsultDamagesCash() {
		return this.consultDamagesCash;
	}
	public void setConsultDamagesCash(Long consultDamagesCash) {
		this.consultDamagesCash = consultDamagesCash;
	}

	public Long getConsultRefundCash() {
		return this.consultRefundCash;
	}
	public void setConsultRefundCash(Long consultRefundCash) {
		this.consultRefundCash = consultRefundCash;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getDamagesCash() {
		return this.damagesCash;
	}
	public void setDamagesCash(Long damagesCash) {
		this.damagesCash = damagesCash;
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

	public Boolean getSignedOrderAgreement() {
		return this.signedOrderAgreement;
	}
	public void setSignedOrderAgreement(Boolean signedOrderAgreement) {
		this.signedOrderAgreement = signedOrderAgreement;
	}

}
