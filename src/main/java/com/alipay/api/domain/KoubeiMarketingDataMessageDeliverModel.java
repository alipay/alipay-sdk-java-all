package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一键营销商家中心PUSH消息接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:02:29
 */
public class KoubeiMarketingDataMessageDeliverModel extends AlipayObject {

	private static final long serialVersionUID = 8472489666681162355L;

	/**
	 * 消息内容，json格式， key不可随意定义，只能是KEY+数字，数字编号递增
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息， json格式，
key值：
REDIRECT_URL跳转地址，目前做了强校验REDIRECT_URL一定要有值; 
CHANNEL发送渠道，对应value值为：MSGBOX(商家APP消息盒子)，PUSH(手机消息通知)，可以通过CHANNEL选择发送消息的渠道（要和沟通模板配置保持对应，如果传了CHANNEL的值，则msg_type和CHANNEL两个字段一起对应一个沟通模板，如果没有传CHANNEL的值，则msg_type对应一个沟通模板）
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息业务类型
活动推荐消息：PROMO_RECOMMEND;
活动效果消息: PROMO_STAT
	 */
	@ApiField("msg_type")
	private String msgType;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

}
