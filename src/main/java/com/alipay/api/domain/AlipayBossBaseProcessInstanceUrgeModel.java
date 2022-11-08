package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 催单
 *
 * @author auto create
 * @since 1.0, 2022-03-17 09:36:53
 */
public class AlipayBossBaseProcessInstanceUrgeModel extends AlipayObject {

	private static final long serialVersionUID = 1348696429351378569L;

	/**
	 * 模板
	 */
	@ApiField("code")
	private String code;

	/**
	 * 这个是发消息使用，直接传给jar包的，请以JSON的格式传送字符串，内部使用的是map，但是此平台不支持map，所以定义成String，但是请以JSON的格式传送
	 */
	@ApiField("msg_template")
	private String msgTemplate;

	/**
	 * 消息类型
	 */
	@ApiListField("msg_type_list")
	@ApiField("string")
	private List<String> msgTypeList;

	/**
	 * 流程实例Id
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMsgTemplate() {
		return this.msgTemplate;
	}
	public void setMsgTemplate(String msgTemplate) {
		this.msgTemplate = msgTemplate;
	}

	public List<String> getMsgTypeList() {
		return this.msgTypeList;
	}
	public void setMsgTypeList(List<String> msgTypeList) {
		this.msgTypeList = msgTypeList;
	}

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
