package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndirectAuthOrderFailedReason;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.authorder.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:36:37
 */
public class AlipayMerchantIndirectAuthorderQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 4654263564689631688L;

	/** 
	 * 商家认证申请单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商家认证申请单状态，枚举值：审核中(AUDITING)、待联系人确认（CONTACT_CONFIRM），待法人确认（LEGAL_CONFIRM）、审核通过(AUDIT_PASS)、审核失败(AUDIT_REJECT)、已冻结(AUDIT_FREEZE)、已撤回(CANCELED)
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 商家认证小程序二维码图片链接，申请单状态处于审核通过、待联系人确认、待法人确认、已冻结时返回，商户使用支付宝APP扫码后完成后续确认动作。
此字段是平台生成并返回的二维码码值，通过浏览器访问即可获得一个二维码的图片。服务商在推广过程中，可引导商家使用支付宝APP扫描此二维码，进入认证申请单页面，完成认证申请的后续确认操作。
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 申请单审核失败时的原因描述列表
	 */
	@ApiListField("verify_list")
	@ApiField("indirect_auth_order_failed_reason")
	private List<IndirectAuthOrderFailedReason> verifyList;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setVerifyList(List<IndirectAuthOrderFailedReason> verifyList) {
		this.verifyList = verifyList;
	}
	public List<IndirectAuthOrderFailedReason> getVerifyList( ) {
		return this.verifyList;
	}

}
