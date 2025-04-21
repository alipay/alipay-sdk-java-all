package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打印消息发送
 *
 * @author auto create
 * @since 1.0, 2021-04-07 15:10:03
 */
public class AlipayCommerceIotSdarttoolMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 2385324918285369219L;

	/**
	 * 消息是否必达(immediate_msg为false时此字段设置有效)，消息过期时间顺延3*24h. 建议使用expire_time设置消息过期时间
	 */
	@ApiField("bi_da")
	private Boolean biDa;

	/**
	 * 设备查询条件类型 ；SUPPLIERID_SN:supplierid+sn ;
 ITEMID_SN:itemid + sn;
SN:sn
	 */
	@ApiField("device_query_type")
	private String deviceQueryType;

	/**
	 * 是否即时消息; true-校验设备是否在线，false-不校验设备是否在线
	 */
	@ApiField("immediate_msg")
	private Boolean immediateMsg;

	/**
	 * 产品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 消息内容
	 */
	@ApiField("msg_content")
	private String msgContent;

	/**
	 * 消息内容格式
	 */
	@ApiField("msg_content_type")
	private String msgContentType;

	/**
	 * 消息过期时间戳(ms)， 默认为当前时间顺延24h有效。当设备在线时消息服务过期之前尝试推送。最大过期时间顺延3*24h
	 */
	@ApiField("msg_expire")
	private Long msgExpire;

	/**
	 * 消息优先级（immediate_msg为false此字段设置有效）数字越大优先发送。
	 */
	@ApiField("msg_priority")
	private Long msgPriority;

	/**
	 * 消息类型：
xpaas_common-小程序消息；
ruyi_ordermsg-如意订单消息
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 服务ID，当小程序消费消息时必传(传入的是小程序ID)
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 设备sn号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 厂商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public Boolean getBiDa() {
		return this.biDa;
	}
	public void setBiDa(Boolean biDa) {
		this.biDa = biDa;
	}

	public String getDeviceQueryType() {
		return this.deviceQueryType;
	}
	public void setDeviceQueryType(String deviceQueryType) {
		this.deviceQueryType = deviceQueryType;
	}

	public Boolean getImmediateMsg() {
		return this.immediateMsg;
	}
	public void setImmediateMsg(Boolean immediateMsg) {
		this.immediateMsg = immediateMsg;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMsgContent() {
		return this.msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public String getMsgContentType() {
		return this.msgContentType;
	}
	public void setMsgContentType(String msgContentType) {
		this.msgContentType = msgContentType;
	}

	public Long getMsgExpire() {
		return this.msgExpire;
	}
	public void setMsgExpire(Long msgExpire) {
		this.msgExpire = msgExpire;
	}

	public Long getMsgPriority() {
		return this.msgPriority;
	}
	public void setMsgPriority(Long msgPriority) {
		this.msgPriority = msgPriority;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
