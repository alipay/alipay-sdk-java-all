package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料单据获取成功反馈接口
 *
 * @author auto create
 * @since 1.0, 2018-09-25 11:42:19
 */
public class KoubeiSalesKbassetStuffOrdersresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7445821361825122832L;

	/**
	 * 物料单据反馈列表，最大200条
	 */
	@ApiListField("orders_feedback")
	@ApiField("access_orders_feed_back")
	private List<AccessOrdersFeedBack> ordersFeedback;

	public List<AccessOrdersFeedBack> getOrdersFeedback() {
		return this.ordersFeedback;
	}
	public void setOrdersFeedback(List<AccessOrdersFeedBack> ordersFeedback) {
		this.ordersFeedback = ordersFeedback;
	}

}
