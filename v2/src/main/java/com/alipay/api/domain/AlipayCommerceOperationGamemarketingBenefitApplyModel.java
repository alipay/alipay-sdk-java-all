package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 申请权益发放
 *
 * @author auto create
 * @since 1.0, 2020-09-18 16:43:15
 */
public class AlipayCommerceOperationGamemarketingBenefitApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8192697472577589158L;

	/**
	 * 活动编码，由支付宝生成，给到合作伙伴
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 权益策略扩展字段；用于合作伙伴厂商个性化的业务逻辑判断的参数，例如，首笔满6元，送A礼包，累计三笔额外送B礼包,那么可以传支付金额，以及是否首次等变量，需要咨询管理员进行使用
	 */
	@ApiListField("benefit_strategy_ext_info")
	@ApiField("ext_info_map")
	private List<ExtInfoMap> benefitStrategyExtInfo;

	/**
	 * 权益关联的设备平台类型（ios 或者 android）两种
	 */
	@ApiField("platform")
	private String platform;

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

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
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

}
