package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据卡号和instId查询得到的卡bin信息对象模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class CardBinVO extends AlipayObject {

	private static final long serialVersionUID = 2654876265351916541L;

	/**
	 * 卡的别名
	 */
	@ApiField("card_alias")
	private String cardAlias;

	/**
	 * 卡bin值，通常为卡号的前6位
	 */
	@ApiField("card_bin_value")
	private String cardBinValue;

	/**
	 * 卡类型对象定义
	 */
	@ApiField("card_type_vo")
	private CardTypeVO cardTypeVo;

	/**
	 * 卡域模型定义
	 */
	@ApiField("domain_vo")
	private CardDomainVO domainVo;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 卡号长度
	 */
	@ApiField("inst_len")
	private String instLen;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 卡版本信息
	 */
	@ApiField("version")
	private String version;

	public String getCardAlias() {
		return this.cardAlias;
	}
	public void setCardAlias(String cardAlias) {
		this.cardAlias = cardAlias;
	}

	public String getCardBinValue() {
		return this.cardBinValue;
	}
	public void setCardBinValue(String cardBinValue) {
		this.cardBinValue = cardBinValue;
	}

	public CardTypeVO getCardTypeVo() {
		return this.cardTypeVo;
	}
	public void setCardTypeVo(CardTypeVO cardTypeVo) {
		this.cardTypeVo = cardTypeVo;
	}

	public CardDomainVO getDomainVo() {
		return this.domainVo;
	}
	public void setDomainVo(CardDomainVO domainVo) {
		this.domainVo = domainVo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstLen() {
		return this.instLen;
	}
	public void setInstLen(String instLen) {
		this.instLen = instLen;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
