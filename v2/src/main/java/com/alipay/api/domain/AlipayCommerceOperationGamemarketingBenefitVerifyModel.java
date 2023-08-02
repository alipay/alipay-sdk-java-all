package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益核销
 *
 * @author auto create
 * @since 1.0, 2020-09-18 16:43:36
 */
public class AlipayCommerceOperationGamemarketingBenefitVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7537439881925637462L;

	/**
	 * 活动的编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 权益策略扩展字段；用于合作伙伴厂商个性化的业务逻辑判断的参数，例如，首笔满6元，送A礼包，累计三笔额外送B礼包,那么可能需要传支付金额，以及是否首次等变量，需要咨询管理员进行使用
	 */
	@ApiListField("benefit_strategy_ext_info")
	@ApiField("ext_info_map")
	private List<ExtInfoMap> benefitStrategyExtInfo;

	/**
	 * 交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 厂商客户的唯一标识，手机号，身份证，账号id等
	 */
	@ApiField("user_account")
	private String userAccount;

	/**
	 * 卡券码
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public List<ExtInfoMap> getBenefitStrategyExtInfo() {
		return this.benefitStrategyExtInfo;
	}
	public void setBenefitStrategyExtInfo(List<ExtInfoMap> benefitStrategyExtInfo) {
		this.benefitStrategyExtInfo = benefitStrategyExtInfo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserAccount() {
		return this.userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
