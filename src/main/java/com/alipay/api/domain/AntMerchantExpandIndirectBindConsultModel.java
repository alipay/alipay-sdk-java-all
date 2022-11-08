package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代间连商户解绑咨询接口
 *
 * @author auto create
 * @since 1.0, 2022-01-11 14:33:54
 */
public class AntMerchantExpandIndirectBindConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4528863546113736962L;

	/**
	 * 申请单ID，与out_biz_no二选一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务号，与order_no二选一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
