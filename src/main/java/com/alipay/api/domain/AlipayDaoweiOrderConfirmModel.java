package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单确认接口
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:23:44
 */
public class AlipayDaoweiOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7717277212929981817L;

	/**
	 * 备注信息，商家确认订单时添加的备注信息，长度不超过2000个字符
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 到位业务订单号。用户在到位下单时，由到位系统生成的32位全局唯一数字 id。
通过应用中的应用网关post发送给商户（应用网关配置参考链接：https%3A%2F%2Fdoc.open.alipay.com%2Fdocs%2Fdoc.htm%3Fspm%3Da219a.7629140.0.0.TcIuKL%26treeId%3D193%26articleId%3D105310%26docType%3D1）。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商户订单号码。确认接单时需要设置外部订单号，由商户自行生成，并确保其唯一性
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
