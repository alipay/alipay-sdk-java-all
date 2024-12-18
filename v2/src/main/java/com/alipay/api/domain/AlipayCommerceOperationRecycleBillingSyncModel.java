package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收阵地结算资金明细同步
 *
 * @author auto create
 * @since 1.0, 2024-09-26 17:19:19
 */
public class AlipayCommerceOperationRecycleBillingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2281992949979135818L;

	/**
	 * 资金明细集合
	 */
	@ApiListField("funds_details")
	@ApiField("recycle_funds_info")
	private List<RecycleFundsInfo> fundsDetails;

	/**
	 * 回收订单来源, 比价插件: ALIPAY_PRICE_COMPARISON,
回收派单: ALIPAY_RECYCLE_DISPATCH
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 商户侧回收单号
	 */
	@ApiField("out_biz_recycle_id")
	private String outBizRecycleId;

	public List<RecycleFundsInfo> getFundsDetails() {
		return this.fundsDetails;
	}
	public void setFundsDetails(List<RecycleFundsInfo> fundsDetails) {
		this.fundsDetails = fundsDetails;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOutBizRecycleId() {
		return this.outBizRecycleId;
	}
	public void setOutBizRecycleId(String outBizRecycleId) {
		this.outBizRecycleId = outBizRecycleId;
	}

}
