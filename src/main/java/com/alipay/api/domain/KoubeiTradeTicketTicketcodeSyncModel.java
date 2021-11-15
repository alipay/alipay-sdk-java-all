package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证码同步
 *
 * @author auto create
 * @since 1.0, 2020-07-31 15:05:46
 */
public class KoubeiTradeTicketTicketcodeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6318593985672634723L;

	/**
	 * 凭证码类型,INTERNAL_CODE(内部凭证码),EXTERNAL_CODE(外部凭证码),默认INTERNAL_CODE,外部券场景必填
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 业务发生时间，如为空默认为接口调用时间
	 */
	@ApiField("gmt_biz")
	private Date gmtBiz;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 券码剩余可核销份数(非次卡场景1可核销，0不可核销)
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 外部请求号，支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 凭证状态变更操作发生的门店id
	 */
	@ApiField("sync_shop_id")
	private String syncShopId;

	/**
	 * 凭证码，包括内部凭证码和外部凭证码，内部凭证码为12位，纯数字，且唯一不重复
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public Date getGmtBiz() {
		return this.gmtBiz;
	}
	public void setGmtBiz(Date gmtBiz) {
		this.gmtBiz = gmtBiz;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSyncShopId() {
		return this.syncShopId;
	}
	public void setSyncShopId(String syncShopId) {
		this.syncShopId = syncShopId;
	}

	public String getTicketCode() {
		return this.ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

}
