package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一键营销商家中心PUSH消息接口
 *
 * @author auto create
 * @since 1.0, 2016-09-07 16:01:59
 */
public class KoubeiMarketingDataMessageDeliverModel extends AlipayObject {

	private static final long serialVersionUID = 2388981416365873497L;

	/**
	 * 消息内容，json格式， KEY值编号递增
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息， json格式，
key值：
REDIRECT_URL跳转地址; 
CHANNEL发送渠道，对应value值为：MSGBOX消息盒子，PUSH手机消息通知
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
