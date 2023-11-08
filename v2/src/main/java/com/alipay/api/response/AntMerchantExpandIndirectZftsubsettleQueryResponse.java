package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SettleCardInfo;
import com.alipay.api.domain.DefaultSettleRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zftsubsettle.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-13 16:11:46
 */
public class AntMerchantExpandIndirectZftsubsettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4817352987663758961L;

	/** 
	 * 二级商户结算账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 映射字段
	 */
	@ApiField("alipay_logon_open_id")
	private String alipayLogonOpenId;

	/** 
	 * 二级商户结算账号的2088id
	 */
	@ApiField("alipay_logon_uid")
	private String alipayLogonUid;

	/** 
	 * 结算银行卡
	 */
	@ApiListField("biz_cards")
	@ApiField("settle_card_info")
	private List<SettleCardInfo> bizCards;

	/** 
	 * 默认结算规则
	 */
	@ApiField("default_settle_rule")
	private DefaultSettleRule defaultSettleRule;

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setAlipayLogonOpenId(String alipayLogonOpenId) {
		this.alipayLogonOpenId = alipayLogonOpenId;
	}
	public String getAlipayLogonOpenId( ) {
		return this.alipayLogonOpenId;
	}

	public void setAlipayLogonUid(String alipayLogonUid) {
		this.alipayLogonUid = alipayLogonUid;
	}
	public String getAlipayLogonUid( ) {
		return this.alipayLogonUid;
	}

	public void setBizCards(List<SettleCardInfo> bizCards) {
		this.bizCards = bizCards;
	}
	public List<SettleCardInfo> getBizCards( ) {
		return this.bizCards;
	}

	public void setDefaultSettleRule(DefaultSettleRule defaultSettleRule) {
		this.defaultSettleRule = defaultSettleRule;
	}
	public DefaultSettleRule getDefaultSettleRule( ) {
		return this.defaultSettleRule;
	}

}
