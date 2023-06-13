package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存查询任务批量查询
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:20:10
 */
public class AlipayCommerceTransportAdStocktaskBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4568588349163627326L;

	/**
	 * 用户id+根据用户id批量查询该用户提交的库存查询任务
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

}
