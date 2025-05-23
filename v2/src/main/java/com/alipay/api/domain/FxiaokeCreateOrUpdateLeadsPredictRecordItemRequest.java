package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给纷享销客的创建接口中的预测订单相关的信息
 *
 * @author auto create
 * @since 1.0, 2024-12-30 17:54:51
 */
public class FxiaokeCreateOrUpdateLeadsPredictRecordItemRequest extends AlipayObject {

	private static final long serialVersionUID = 2335657746552941839L;

	/**
	 * 商品类目code
	 */
	@ApiField("commodity_cate_code")
	private String commodityCateCode;

	/**
	 * 产品金额元
	 */
	@ApiField("contract_amount")
	private String contractAmount;

	/**
	 * 软件订阅年限，输入1则为1年
	 */
	@ApiField("software_subscription_years")
	private String softwareSubscriptionYears;

	public String getCommodityCateCode() {
		return this.commodityCateCode;
	}
	public void setCommodityCateCode(String commodityCateCode) {
		this.commodityCateCode = commodityCateCode;
	}

	public String getContractAmount() {
		return this.contractAmount;
	}
	public void setContractAmount(String contractAmount) {
		this.contractAmount = contractAmount;
	}

	public String getSoftwareSubscriptionYears() {
		return this.softwareSubscriptionYears;
	}
	public void setSoftwareSubscriptionYears(String softwareSubscriptionYears) {
		this.softwareSubscriptionYears = softwareSubscriptionYears;
	}

}
