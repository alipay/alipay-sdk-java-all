package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收益分配订单查询
 *
 * @author auto create
 * @since 1.0, 2023-07-19 19:25:17
 */
public class AnttechBlockchainFinanceDistributionBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4383639894672457417L;

	/**
	 * 收益分配账单Id 二选一
	 */
	@ApiField("distribution_order_id")
	private String distributionOrderId;

	/**
	 * 收益分配产品码, 请咨询业务同学
	 */
	@ApiField("distribution_pro_no")
	private String distributionProNo;

	/**
	 * 核销流水 二选一
	 */
	@ApiField("write_off_biz_no")
	private String writeOffBizNo;

	public String getDistributionOrderId() {
		return this.distributionOrderId;
	}
	public void setDistributionOrderId(String distributionOrderId) {
		this.distributionOrderId = distributionOrderId;
	}

	public String getDistributionProNo() {
		return this.distributionProNo;
	}
	public void setDistributionProNo(String distributionProNo) {
		this.distributionProNo = distributionProNo;
	}

	public String getWriteOffBizNo() {
		return this.writeOffBizNo;
	}
	public void setWriteOffBizNo(String writeOffBizNo) {
		this.writeOffBizNo = writeOffBizNo;
	}

}
