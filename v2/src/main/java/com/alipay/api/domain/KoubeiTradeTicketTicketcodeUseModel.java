package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证码核销
 *
 * @author auto create
 * @since 1.0, 2021-09-03 17:21:51
 */
public class KoubeiTradeTicketTicketcodeUseModel extends AlipayObject {

	private static final long serialVersionUID = 5248826122955936372L;

	/**
	 * 凭证码类型,INTERNAL_CODE(内部凭证码),EXTERNAL_CODE(外部凭证码),默认INTERNAL_CODE,外部券场景必填
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 扩展信息，或落地到核销任务单上
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 业务发生时间，默认为接口调用时间
	 */
	@ApiField("gmt_biz")
	private Date gmtBiz;

	/**
	 * 口碑订单号，使用外部凭证码核销时必填
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 核销份数，次卡业务必填、非次卡业务选填， 非次卡场景表示核销同一订单下的同类凭证的个数
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 外部请求号，支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店id类型,INTERNAL_SHOP(内部店铺id),EXTERNAL_SHOP(外部店铺id),默认INTERNAL_SHOP
	 */
	@ApiField("shop_type")
	private String shopType;

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

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getTicketCode() {
		return this.ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

}
