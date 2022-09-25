package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业消息发送
 *
 * @author auto create
 * @since 1.0, 2019-03-18 11:52:25
 */
public class AlipayOpenAppPropertyMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 2197553419548331318L;

	/**
	 * 业务ID，作为消息的唯一标识，服务端会按照此参数做幂等处理
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 物业消息对应的小区名称
	 */
	@ApiField("community")
	private String community;

	/**
	 * 消息模板：您2019.01.01到2019.02.01的物业费账单为500.00元，请及时缴纳。
content以map形式传递关键字段值。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 物业消息发送时间
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 物业消息标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 物业消息类型：代收费账单-月度通知(CHARGE_BILL_MONTH)、物业费账单-月度通知(PROPERTY_BILL_MONTH)、物业费账单-逾期通知(PROPERTY_BILL_OVERDUE)、工单开始处理(ORDER_START)、工单预计服务时间（ORDER_SERVICE_TIME）、工单被关闭(ORDER_CLOSE)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 物业消息推送的用户支付宝ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 物业消息对应的url地址，可引导用户跳转
	 */
	@ApiField("url")
	private String url;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCommunity() {
		return this.community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
