package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * n点餐物料申请订单支付完成通知
 *
 * @author auto create
 * @since 1.0, 2025-03-20 11:12:46
 */
public class AlipayOpenSpNordermaterialsapplyPayorderNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5675679557775275169L;

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
