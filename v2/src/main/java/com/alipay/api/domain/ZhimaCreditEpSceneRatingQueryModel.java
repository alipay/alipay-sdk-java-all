package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用评估订单查询
 *
 * @author auto create
 * @since 1.0, 2019-04-18 17:14:48
 */
public class ZhimaCreditEpSceneRatingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3138538251912259468L;

	/**
	 * 芝麻企业信用评估订单号，通过<a href="https://opendocs.alipay.com/apis/api_8/zhima.credit.ep.scene.rating.initialize">zhima.credit.ep.scene.rating.initialize</a>(芝麻企业信用信用评估初始化)接口进行信用评估初始化后获取。
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
