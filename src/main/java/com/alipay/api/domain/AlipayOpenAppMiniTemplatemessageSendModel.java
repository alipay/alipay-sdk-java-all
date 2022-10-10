package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序发送模板消息
 *
 * @author auto create
 * @since 1.0, 2022-09-16 12:05:55
 */
public class AlipayOpenAppMiniTemplatemessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 3597754113997617251L;

	/**
	 * 模板消息内容。商家/开发者将模板占位符替换为自定义内容。

注意：
* 选用模板时配置的关键字顺序与keyword_ X相互对应，填写时需注意。

* 自定义消息内容仅需替换 value 后内容即可，其余内容请勿修改。如 {"keyword1": {"value" : "2021年01月"}。表示第一个关键字数据为"2021年01月" 。

* value 最长为 50 个字符。
	 */
	@ApiField("data")
	private String data;

	/**
	 * *支付消息模板：需传入用户发生的交易行为的支付宝交易号 trade_no；
*表单提交模板：需传入用户在小程序触发表单提交事件获得的表单号；
*刷脸消息模板：需传入在IOT刷脸后得到的ftoken等，用于信息发送的校验。
说明：订阅消息模板无需传入本参数。
	 */
	@ApiField("form_id")
	private String formId;

	/**
	 * 小程序的跳转页面。用于用户点击模板消息 进入小程序查看 按钮后，跳转至商家小程序对应页面。
	 */
	@ApiField("page")
	private String page;

	/**
	 * 接收模板消息的用户 user_id，一般为2088开头的16为数字。
注意：需为实际支付/提交表单/刷脸/订阅消息的用户。
	 */
	@ApiField("to_user_id")
	private String toUserId;

	/**
	 * 商家在商家自运营中心选用的消息模板ID，详情参见 <a href="https://opendocs.alipay.com/mini/01rnqx#%E9%80%89%E7%94%A8%E6%B6%88%E6%81%AF%E6%A8%A1%E6%9D%BF">选用消息模板</a> 。
	 */
	@ApiField("user_template_id")
	private String userTemplateId;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getFormId() {
		return this.formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public String getUserTemplateId() {
		return this.userTemplateId;
	}
	public void setUserTemplateId(String userTemplateId) {
		this.userTemplateId = userTemplateId;
	}

}
