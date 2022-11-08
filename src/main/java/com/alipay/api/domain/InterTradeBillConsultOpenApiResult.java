package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 近端账单咨询结果对象
 *
 * @author auto create
 * @since 1.0, 2022-06-06 21:30:51
 */
public class InterTradeBillConsultOpenApiResult extends AlipayObject {

	private static final long serialVersionUID = 1172182553246237643L;

	/**
	 * 是否创建对手方计价明细
	 */
	@ApiField("create_opposite_bill")
	private Boolean createOppositeBill;

	/**
	 * 是否为关联交易
	 */
	@ApiField("inter_trade")
	private Boolean interTrade;

	/**
	 * 交易对手方关联方短码
	 */
	@ApiField("opposite_ou_code")
	private String oppositeOuCode;

	/**
	 * 关联交易类型，等价于对手方归属组织。
ALIBABA     阿里巴巴并表公司
ALIBABA-JV  阿里巴巴合营企业
MY          蚂蚁并表公司
MY-invest   蚂蚁被投企业
MY-JV       蚂蚁合营企业
MY-AFS      蚂蚁联营企业
Other       蚂蚁股东
NOTRELATED   非关联方
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 交易本方关联方短码
	 */
	@ApiField("self_ou_code")
	private String selfOuCode;

	public Boolean getCreateOppositeBill() {
		return this.createOppositeBill;
	}
	public void setCreateOppositeBill(Boolean createOppositeBill) {
		this.createOppositeBill = createOppositeBill;
	}

	public Boolean getInterTrade() {
		return this.interTrade;
	}
	public void setInterTrade(Boolean interTrade) {
		this.interTrade = interTrade;
	}

	public String getOppositeOuCode() {
		return this.oppositeOuCode;
	}
	public void setOppositeOuCode(String oppositeOuCode) {
		this.oppositeOuCode = oppositeOuCode;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getSelfOuCode() {
		return this.selfOuCode;
	}
	public void setSelfOuCode(String selfOuCode) {
		this.selfOuCode = selfOuCode;
	}

}
