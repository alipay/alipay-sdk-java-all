package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打印消息发送
 *
 * @author auto create
 * @since 1.0, 2019-12-25 18:20:11
 */
public class AlipayCommerceIotSdarttoolMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 3887532662769233933L;

	/**
	 * 当离线消息挤压太多时，若设备上线将获取所有未过期的消息。推送太多消息对设备体验不太好，所以此字段用于设置消息是必达。当消息不是必达的
	 */
	@ApiField("bi_da")
	private Boolean biDa;

	/**
	 * 设备查询条件类型 supplierid+sn : (SUPPLIERID_SN)
itemid + sn: ITEMID_SN
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
	 * 根据消息类型有不同的消息模板，传入的消息内容会是多个参数如云打印
{"contentParams":["打印内容"],"target":"打印编号-可选默认第一个","instructionFormat":"template或cmd"}
cloud_print: 消息内容详见: https://alipay.open.taobao.com/docs/doc.htm?spm=a219a.7629140.0.0.46cf4b70bQj0aZ&treeId=662&articleId=117980&docType=1#s1
	 */
	@ApiField("msg_content")
	private String msgContent;

	/**
	 * 消息内容格式
	 */
	@ApiField("msg_content_type")
	private String msgContentType;

	/**
	 * 消息过期时间戳(单位秒)， 默认为当前时间延期3天有效。若消息在此时间之前未推送，将不再推送（必达消息会永久保留直到推送成功）
	 */
	@ApiField("msg_expire")
	private Long msgExpire;

	/**
	 * 离线消息，当设备在线时消息优先发送级别，越大优先级域高(优先级为正整数)。
	 */
	@ApiField("msg_priority")
	private Long msgPriority;

	/**
	 * 消息类型
云打印: cloud_print
	 */
	@ApiField("msg_type")
	private String msgType;

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
