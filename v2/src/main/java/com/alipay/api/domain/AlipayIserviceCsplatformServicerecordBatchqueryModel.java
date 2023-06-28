package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 方舟工作台服务记录查询接口
 *
 * @author auto create
 * @since 1.0, 2023-04-26 17:09:19
 */
public class AlipayIserviceCsplatformServicerecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6795682655157153251L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
