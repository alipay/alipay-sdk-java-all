package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务预算申请占用金额集合
 *
 * @author auto create
 * @since 1.0, 2023-01-11 15:16:40
 */
public class CfbudmacBizActionConsumedAmountsDTO extends AlipayObject {

	private static final long serialVersionUID = 2111714865294846123L;

	/**
	 * 业务预算申请占用金额集合
	 */
	@ApiListField("biz_action_consumed_amount_list")
	@ApiField("cfbudmac_biz_action_consumed_amount_d_t_o")
	private List<CfbudmacBizActionConsumedAmountDTO> bizActionConsumedAmountList;

	/**
	 * 业务活动唯一id
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	public List<CfbudmacBizActionConsumedAmountDTO> getBizActionConsumedAmountList() {
		return this.bizActionConsumedAmountList;
	}
	public void setBizActionConsumedAmountList(List<CfbudmacBizActionConsumedAmountDTO> bizActionConsumedAmountList) {
		this.bizActionConsumedAmountList = bizActionConsumedAmountList;
	}

	public String getBizUkId() {
		return this.bizUkId;
	}
	public void setBizUkId(String bizUkId) {
		this.bizUkId = bizUkId;
	}

}
