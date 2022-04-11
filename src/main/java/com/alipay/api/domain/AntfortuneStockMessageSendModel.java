package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 股票专用机构消息通道
 *
 * @author auto create
 * @since 1.0, 2021-12-15 15:54:35
 */
public class AntfortuneStockMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 8535132416472628752L;

	/**
	 * 签约协议号（uid在某个机构处的唯一标识）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 消息大类：股票-STOCK，信托-TRUST
	 */
	@ApiField("category")
	private String category;

	/**
	 * 消息id、用来控制消息幂等
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 参数列表，用来替换消息模板中的内容
	 */
	@ApiListField("param")
	@ApiField("kv")
	private List<Kv> param;

	/**
	 * 子类别：新股中签、etc
	 */
	@ApiField("sub_category")
	private String subCategory;

	/**
	 * 消息类型、关联发送的消息模板
	 */
	@ApiField("template")
	private String template;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public List<Kv> getParam() {
		return this.param;
	}
	public void setParam(List<Kv> param) {
		this.param = param;
	}

	public String getSubCategory() {
		return this.subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getTemplate() {
		return this.template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}

}
