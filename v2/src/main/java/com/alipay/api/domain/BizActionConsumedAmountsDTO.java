package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务预算申请占用金额集合
 *
 * @author auto create
 * @since 1.0, 2023-04-03 19:40:58
 */
public class BizActionConsumedAmountsDTO extends AlipayObject {

	private static final long serialVersionUID = 5853192154944178194L;

	/**
	 * 业务预算申请占用金额集合
	 */
	@ApiListField("biz_action_consumed_amount_list")
	@ApiField("biz_action_consumed_amount_d_t_o")
	private List<BizActionConsumedAmountDTO> bizActionConsumedAmountList;

	/**
	 * 业务预算申请占用金额集合
	 */
	@ApiListField("biz_action_consumed_amounts")
	@ApiField("biz_action_comsumed_amount_d_t_o")
	private List<BizActionComsumedAmountDTO> bizActionConsumedAmounts;

	/**
	 * 业务活动唯一id
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	public List<BizActionConsumedAmountDTO> getBizActionConsumedAmountList() {
		return this.bizActionConsumedAmountList;
	}
	public void setBizActionConsumedAmountList(List<BizActionConsumedAmountDTO> bizActionConsumedAmountList) {
		this.bizActionConsumedAmountList = bizActionConsumedAmountList;
	}

	public List<BizActionComsumedAmountDTO> getBizActionConsumedAmounts() {
		return this.bizActionConsumedAmounts;
	}
	public void setBizActionConsumedAmounts(List<BizActionComsumedAmountDTO> bizActionConsumedAmounts) {
		this.bizActionConsumedAmounts = bizActionConsumedAmounts;
	}

	public String getBizUkId() {
		return this.bizUkId;
	}
	public void setBizUkId(String bizUkId) {
		this.bizUkId = bizUkId;
	}

}
