package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户余额冻结接口
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:05
 */
public class SubAccountBalanceFreezeOrder extends AlipayObject {

	private static final long serialVersionUID = 7632913972432625697L;

	/**
	 * 需要冻结金额，如果可用余额大于冻结金额则冻结
	 */
	@ApiField("freeze_amount")
	private MultiCurrencyMoney freezeAmount;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 上游申请请求单号，source + outBizNo 用于幂等。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 来源，通常为业务系统名，source + outBizNo 用于幂等。
	 */
	@ApiField("source")
	private String source;

	/**
	 * 子户基本信息，用于子户识别
	 */
	@ApiField("sub_account_base_info")
	private SubAccountBaseInfo subAccountBaseInfo;

	public MultiCurrencyMoney getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(MultiCurrencyMoney freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public SubAccountBaseInfo getSubAccountBaseInfo() {
		return this.subAccountBaseInfo;
	}
	public void setSubAccountBaseInfo(SubAccountBaseInfo subAccountBaseInfo) {
		this.subAccountBaseInfo = subAccountBaseInfo;
	}

}
