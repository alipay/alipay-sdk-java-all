package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 团体资金用户流水查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-06 19:45:09
 */
public class AlipayFundTransGroupfundsUserbillsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5353394266149664515L;

	/**
	 * 指定具体活动对应的批次号列表，不超过20个批次
	 */
	@ApiListField("batch_nos")
	@ApiField("string")
	private List<String> batchNos;

	/**
	 * 当前用户支付宝账户ID
	 */
	@ApiField("current_user_id")
	private String currentUserId;

	public List<String> getBatchNos() {
		return this.batchNos;
	}
	public void setBatchNos(List<String> batchNos) {
		this.batchNos = batchNos;
	}

	public String getCurrentUserId() {
		return this.currentUserId;
	}
	public void setCurrentUserId(String currentUserId) {
		this.currentUserId = currentUserId;
	}

}
