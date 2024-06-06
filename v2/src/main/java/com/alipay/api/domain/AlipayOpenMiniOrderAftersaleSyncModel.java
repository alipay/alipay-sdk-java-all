package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家售后处理结果同步
 *
 * @author auto create
 * @since 1.0, 2024-04-11 15:35:17
 */
public class AlipayOpenMiniOrderAftersaleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3175113846684874864L;

	/**
	 * 操作code
	 */
	@ApiField("action_code")
	private String actionCode;

	/**
	 * 交易组件售后单id
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/**
	 * 售后审核原因。
	 */
	@ApiField("audit_reason")
	private String auditReason;

	/**
	 * 商家售后审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 物流信息，action_code为203时必填
	 */
	@ApiListField("logistics_list")
	@ApiField("aftersale_logistics_info_d_t_o")
	private List<AftersaleLogisticsInfoDTO> logisticsList;

	/**
	 * 商家地址
	 */
	@ApiField("merchant_address_info")
	private AftersaleAddressInfoDTO merchantAddressInfo;

	/**
	 * 商家实际同意退款的金额（元）
	 */
	@ApiField("merchant_agree_refund_amount")
	private String merchantAgreeRefundAmount;

	/**
	 * 买家open_id；open_id和user_id二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号，创建订单时由商户传入
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/mini/05dxgc?pathHash=1a3ecb13">用户授权</a>; 其它场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/open/284/web">网页授权获取用户信息</a>。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionCode() {
		return this.actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getAftersaleId() {
		return this.aftersaleId;
	}
	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}

	public String getAuditReason() {
		return this.auditReason;
	}
	public void setAuditReason(String auditReason) {
		this.auditReason = auditReason;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public List<AftersaleLogisticsInfoDTO> getLogisticsList() {
		return this.logisticsList;
	}
	public void setLogisticsList(List<AftersaleLogisticsInfoDTO> logisticsList) {
		this.logisticsList = logisticsList;
	}

	public AftersaleAddressInfoDTO getMerchantAddressInfo() {
		return this.merchantAddressInfo;
	}
	public void setMerchantAddressInfo(AftersaleAddressInfoDTO merchantAddressInfo) {
		this.merchantAddressInfo = merchantAddressInfo;
	}

	public String getMerchantAgreeRefundAmount() {
		return this.merchantAgreeRefundAmount;
	}
	public void setMerchantAgreeRefundAmount(String merchantAgreeRefundAmount) {
		this.merchantAgreeRefundAmount = merchantAgreeRefundAmount;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
