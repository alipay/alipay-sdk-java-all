package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务预算申请占用金额集合
 *
 * @author auto create
 * @since 1.0, 2022-11-15 16:39:01
 */
public class BkdfmacBizActionConsumedAmountsDTO extends AlipayObject {

	private static final long serialVersionUID = 4832463791267364596L;

	/**
	 * 业务预算申请占用金额集合
	 */
	@ApiListField("biz_action_consumed_amount_list")
	@ApiField("bkdfmac_biz_action_consumed_amount_d_t_o")
	private List<BkdfmacBizActionConsumedAmountDTO> bizActionConsumedAmountList;

	/**
	 * 业务活动唯一id
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	public List<BkdfmacBizActionConsumedAmountDTO> getBizActionConsumedAmountList() {
		return this.bizActionConsumedAmountList;
	}
	public void setBizActionConsumedAmountList(List<BkdfmacBizActionConsumedAmountDTO> bizActionConsumedAmountList) {
		this.bizActionConsumedAmountList = bizActionConsumedAmountList;
	}

	public String getBizUkId() {
		return this.bizUkId;
	}
	public void setBizUkId(String bizUkId) {
		this.bizUkId = bizUkId;
	}

}
