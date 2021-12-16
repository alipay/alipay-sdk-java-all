package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连弱关联绑定二维码生成
 *
 * @author auto create
 * @since 1.0, 2021-11-25 11:17:48
 */
public class AntMerchantExpandIndirectBindQrcodecreateModel extends AlipayObject {

	private static final long serialVersionUID = 8159291114149237599L;

	/**
	 * 动作类型，绑定bind/解除绑定un_bind
	 */
	@ApiField("action")
	private String action;

	/**
	 * 外部业务号。有商户扫码绑定或解除绑定时，操作成功后会发送消息，此业务号将在消息中原样返回
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
