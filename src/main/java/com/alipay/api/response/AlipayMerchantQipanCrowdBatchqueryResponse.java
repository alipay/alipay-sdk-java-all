package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QipanMerchantCrowd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-02 11:16:48
 */
public class AlipayMerchantQipanCrowdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5281585568935657699L;

	/** 
	 * 商家自定义人群列表
	 */
	@ApiField("crowd_list")
	private QipanMerchantCrowd crowdList;

	/** 
	 * 返回查询结果的总条数
	 */
	@ApiField("total_number")
	private String totalNumber;

	public void setCrowdList(QipanMerchantCrowd crowdList) {
		this.crowdList = crowdList;
	}
	public QipanMerchantCrowd getCrowdList( ) {
		return this.crowdList;
	}

	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getTotalNumber( ) {
		return this.totalNumber;
	}

}
