package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HbMerchantBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-20 15:18:21
 */
public class AlipayPcreditHuabeiMerchantBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7391172857278291692L;

	/** 
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("hb_merchant_bill")
	private List<HbMerchantBill> billList;

	/** 
	 * 条目数，最多20000条，多余20000条请细分时间获取
	 */
	@ApiField("size")
	private Long size;

	public void setBillList(List<HbMerchantBill> billList) {
		this.billList = billList;
	}
	public List<HbMerchantBill> getBillList( ) {
		return this.billList;
	}

	public void setSize(Long size) {
		this.size = size;
	}
	public Long getSize( ) {
		return this.size;
	}

}
