package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BalanceAccountDetail;
import com.alipay.api.domain.ExtCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-12 14:27:06
 */
public class AlipayFundAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3547143649881154882L;

	/** 
	 * 支付宝账户的余额成份明细，仅当查询日终余额明细时返回
	 */
	@ApiField("amount_detail")
	private BalanceAccountDetail amountDetail;

	/** 
	 * 账户可用余额，单位元，精确到小数点后两位。
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 场景余额模式外标卡信息
	 */
	@ApiField("ext_card_info")
	private ExtCardInfo extCardInfo;

	/** 
	 * 当前支付宝账户的实时冻结余额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 支付宝账户的余额总数，仅当查询日终余额明细时返回。单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setAmountDetail(BalanceAccountDetail amountDetail) {
		this.amountDetail = amountDetail;
	}
	public BalanceAccountDetail getAmountDetail( ) {
		return this.amountDetail;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setExtCardInfo(ExtCardInfo extCardInfo) {
		this.extCardInfo = extCardInfo;
	}
	public ExtCardInfo getExtCardInfo( ) {
		return this.extCardInfo;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
