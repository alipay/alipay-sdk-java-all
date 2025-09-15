package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询签约申请单状态
 *
 * @author auto create
 * @since 1.0, 2025-06-17 15:53:32
 */
public class AlipayOpenInviteOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4778939389185865425L;

	/**
	 * 商家的支付宝账号，如果调用alipay.open.invite.order.create接口时有传入支付宝账号，则这里查询签约状态时必须要传
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * isv业务系统单据编号
	 */
	@ApiField("isv_biz_id")
	private String isvBizId;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getIsvBizId() {
		return this.isvBizId;
	}
	public void setIsvBizId(String isvBizId) {
		this.isvBizId = isvBizId;
	}

}
