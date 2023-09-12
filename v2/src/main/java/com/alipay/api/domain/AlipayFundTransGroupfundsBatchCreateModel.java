package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 团队资金批次创建(预结算资金分配)
 *
 * @author auto create
 * @since 1.0, 2022-12-06 19:46:32
 */
public class AlipayFundTransGroupfundsBatchCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2458985878631182949L;

	/**
	 * 当前创建批次的支付宝用户ID
	 */
	@ApiField("current_user_id")
	private String currentUserId;

	/**
	 * 扩展参数，可选，业务扩展时使用
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 资金流入分配明细
	 */
	@ApiListField("income_details")
	@ApiField("group_funds_imcome_details")
	private List<GroupFundsImcomeDetails> incomeDetails;

	/**
	 * 外部业务号，用作批次业务幂等，调用方保证相同的业务活动外部业务号相同，保证只能创建一次批次，业务规则业务自己定义
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务来源,对于聚会小程序统一透传"openParty"
	 */
	@ApiField("source")
	private String source;

	/**
	 * 资金转移总额,只支持两位小数点的正数,单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getCurrentUserId() {
		return this.currentUserId;
	}
	public void setCurrentUserId(String currentUserId) {
		this.currentUserId = currentUserId;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public List<GroupFundsImcomeDetails> getIncomeDetails() {
		return this.incomeDetails;
	}
	public void setIncomeDetails(List<GroupFundsImcomeDetails> incomeDetails) {
		this.incomeDetails = incomeDetails;
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

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
