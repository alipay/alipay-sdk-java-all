package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QipanMerchantCrowd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-18 16:44:00
 */
public class AlipayMerchantQipanCrowdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5844458526984379658L;

	/** 
	 * 商家自定义人群列表
	 */
	@ApiListField("crowd_list")
	@ApiField("qipan_merchant_crowd")
	private List<QipanMerchantCrowd> crowdList;

	/** 
	 * 返回查询结果的总条数
	 */
	@ApiField("total_number")
	private String totalNumber;

	public void setCrowdList(List<QipanMerchantCrowd> crowdList) {
		this.crowdList = crowdList;
	}
	public List<QipanMerchantCrowd> getCrowdList( ) {
		return this.crowdList;
	}

	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getTotalNumber( ) {
		return this.totalNumber;
	}

}
