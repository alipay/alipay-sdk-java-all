package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量发送模板消息
 *
 * @author auto create
 * @since 1.0, 2024-01-14 22:42:48
 */
public class AlipayOpenAppMiniTemplatemessageBatchsendModel extends AlipayObject {

	private static final long serialVersionUID = 5675512215554331478L;

	/**
	 * 棋盘人群编码。参数非必传。若传入棋盘人群编码，平台将会对棋盘人群包内的用户和消息模板订阅人群取交集，进行定向消息投送；若不传则默认对该消息模板的订阅人群进行批量发送。
获取棋盘人群编码可参考<a href="https://opendocs.alipay.com/b/05pafz?pathHash=391f9fa7" target="_blank">棋盘密云接入文档</a>
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 模板消息内容，商家/开发者将模板占位符替换为自定义内容
	 */
	@ApiField("data")
	private String data;

	/**
	 * 需传入商家小程序内的具体页面路径。用户点击消息卡片时，将会跳转至到指定商家小程序对应页面。
	 */
	@ApiField("page")
	private String page;

	/**
	 * 定时发送时间，若不传定时发送时间则立即触发批量发送。
	 */
	@ApiField("schedule_send_time")
	private Date scheduleSendTime;

	/**
	 * 商家在商家自运营中心选用的消息模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public Date getScheduleSendTime() {
		return this.scheduleSendTime;
	}
	public void setScheduleSendTime(Date scheduleSendTime) {
		this.scheduleSendTime = scheduleSendTime;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
