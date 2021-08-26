package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BillDingBizOrder;
import com.alipay.api.domain.BillDingBizOrderSum;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.bill.dingstaffbizorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:39
 */
public class AlipayDataDataserviceBillDingstaffbizorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5466462914547738348L;

	/** 
	 * 账单明细列表。如果返回数量小于page_size，则表示查询结束
	 */
	@ApiListField("bill_list")
	@ApiField("bill_ding_biz_order")
	private List<BillDingBizOrder> billList;

	/** 
	 * 月汇总信息,包括当前的收支明细所涉及的所有月份汇总, 但是如果这些月份汇总上页查询已经返回, 当前页也则不再返回。根据传入参数last_id的前6位判断已经返回的月份信息
	 */
	@ApiListField("bill_sum")
	@ApiField("bill_ding_biz_order_sum")
	private List<BillDingBizOrderSum> billSum;

	public void setBillList(List<BillDingBizOrder> billList) {
		this.billList = billList;
	}
	public List<BillDingBizOrder> getBillList( ) {
		return this.billList;
	}

	public void setBillSum(List<BillDingBizOrderSum> billSum) {
		this.billSum = billSum;
	}
	public List<BillDingBizOrderSum> getBillSum( ) {
		return this.billSum;
	}

}
