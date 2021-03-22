package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 码商发码成功回调接口
 *
 * @author auto create
 * @since 1.0, 2019-11-19 16:08:55
 */
public class KoubeiTradeTicketTicketcodeSendModel extends AlipayObject {

	private static final long serialVersionUID = 8636671811795848411L;

	/**
	 * 需要发送的码列表，其中code表示串码码值，num表示码的可核销份数
	 */
	@ApiListField("isv_ma_list")
	@ApiField("kb_isv_ma_code")
	private List<KbIsvMaCode> isvMaList;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 请求id，唯一标识一次请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑商品发货单号
	 */
	@ApiField("send_order_no")
	private String sendOrderNo;

	/**
	 * 口碑发码通知透传码商，码商需要跟发码通知获取到的参数一致
	 */
	@ApiField("send_token")
	private String sendToken;

	/**
	 * 券过期时间,默认为口碑商品配置失效时间
	 */
	@ApiField("valid_end")
	private Date validEnd;

	/**
	 * 券生效时间,默认为口碑商品配置生效时间
	 */
	@ApiField("valid_start")
	private Date validStart;

	public List<KbIsvMaCode> getIsvMaList() {
		return this.isvMaList;
	}
	public void setIsvMaList(List<KbIsvMaCode> isvMaList) {
		this.isvMaList = isvMaList;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSendOrderNo() {
		return this.sendOrderNo;
	}
	public void setSendOrderNo(String sendOrderNo) {
		this.sendOrderNo = sendOrderNo;
	}

	public String getSendToken() {
		return this.sendToken;
	}
	public void setSendToken(String sendToken) {
		this.sendToken = sendToken;
	}

	public Date getValidEnd() {
		return this.validEnd;
	}
	public void setValidEnd(Date validEnd) {
		this.validEnd = validEnd;
	}

	public Date getValidStart() {
		return this.validStart;
	}
	public void setValidStart(Date validStart) {
		this.validStart = validStart;
	}

}
