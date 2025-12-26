package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询店铺信息
 *
 * @author auto create
 * @since 1.0, 2025-10-27 17:17:26
 */
public class AntMerchantExpandAstoreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4676715499226745531L;

	/**
	 * 商家在支付宝平台内创建的一种营销业务的载体，可以支持发品、配券以及活动报名的id,它的来源是SAAS服务商来进件的时候,创建团购店铺的时候,生成的。
	 */
	@ApiField("a_store_id")
	private String aStoreId;

	/**
	 * 外部业务单号,与店铺对应,本期暂时不支持
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getaStoreId() {
		return this.aStoreId;
	}
	public void setaStoreId(String aStoreId) {
		this.aStoreId = aStoreId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
