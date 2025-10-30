package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询订单详情接口
 *
 * @author auto create
 * @since 1.0, 2017-04-06 18:05:24
 */
public class AlipayEcoLogisticsExpressOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8197292241337132625L;

	/**
	 * 物流机构编码，参照物流机构编码文档，<a href="https://expressprod.oss-cn-hangzhou.aliyuncs.com/docs/%E5%AF%84%E4%BB%B6%E5%B9%B3%E5%8F%B0-%E7%89%A9%E6%B5%81%E6%9C%BA%E6%9E%84%E7%BC%96%E7%A0%81%E6%96%87%E6%A1%A3.xlsx">点此下载</a>。
	 */
	@ApiField("logis_merch_code")
	private String logisMerchCode;

	/**
	 * 寄件平台订单号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getLogisMerchCode() {
		return this.logisMerchCode;
	}
	public void setLogisMerchCode(String logisMerchCode) {
		this.logisMerchCode = logisMerchCode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
