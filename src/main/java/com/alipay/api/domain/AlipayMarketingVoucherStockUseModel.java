package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户券码券核销
 *
 * @author auto create
 * @since 1.0, 2019-01-14 21:12:55
 */
public class AlipayMarketingVoucherStockUseModel extends AlipayObject {

	private static final long serialVersionUID = 8372169587834688613L;

	/**
	 * 券码，也就是商户在创建外部券码模板时，上传的文件中的内容
	 */
	@ApiField("entity_no")
	private String entityNo;

	/**
	 * 数字和字母，每一次核销都必须唯一，如果重复，则认为是重复的请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getEntityNo() {
		return this.entityNo;
	}
	public void setEntityNo(String entityNo) {
		this.entityNo = entityNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
