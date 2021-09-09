package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单服务者变更接口
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:23:29
 */
public class AlipayDaoweiOrderSpModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3199853123249348363L;

	/**
	 * 到位业务订单号，全局唯一，由32位数字组成，用户在到位下单时系统生成并消息同步给商家，商户只能查自己同步到的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部服务者id，由商户自己生成，保证同一商户id唯一，同步服务者信息或者修改订单服务者信息时设置，长度不超过64个字符
	 */
	@ApiField("out_sp_id")
	private String outSpId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutSpId() {
		return this.outSpId;
	}
	public void setOutSpId(String outSpId) {
		this.outSpId = outSpId;
	}

}
