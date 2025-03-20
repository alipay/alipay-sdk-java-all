package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * n点餐物料申请情况查询
 *
 * @author auto create
 * @since 1.0, 2025-03-20 11:12:53
 */
public class AlipayOpenSpNordermaterialsapplyTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1841964914873128696L;

	/**
	 * 门店作业单据标识唯一标识，一个作业单据只需要支付一次保证金
	 */
	@ApiField("shop_task_id")
	private String shopTaskId;

	public String getShopTaskId() {
		return this.shopTaskId;
	}
	public void setShopTaskId(String shopTaskId) {
		this.shopTaskId = shopTaskId;
	}

}
