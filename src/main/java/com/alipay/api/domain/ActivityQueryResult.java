package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收藏有礼appId对应新用户、老用户模版的查询结果
 *
 * @author auto create
 * @since 1.0, 2018-12-26 15:47:30
 */
public class ActivityQueryResult extends AlipayObject {

	private static final long serialVersionUID = 2552689434566312196L;

	/**
	 * 查询返回结果的code
biz_code与biz_msg的对应关系见下：
biz_code:OK, biz_msg:正常
biz_code:BENEFITED, biz_msg:您已领取过收藏有礼券
biz_code:BENEFITED_COUPON, biz_msg:您已领取收藏有礼券
biz_code:KEEP_OLD_USER_NO_COUPON, biz_msg:您已收藏该小程序
biz_code:CANCEL_KEEP_OLD_USER_NO_COUPON, biz_msg:您近期已收藏过该小程序
biz_code:ACTIVITY_NOT_EXIST, biz_msg:活动异常，链接失效
biz_code:NOT_START, biz_msg:活动未开始
biz_code:PAUSE, biz_msg:活动已暂停
biz_code:END, biz_msg:活动已结束
biz_code:TIMEOUT, biz_msg:活动已过期
biz_code:NO_COUPON, biz_msg:券无余量
biz_code:UNKNOWN_ERROR, biz_msg:未知异常
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 对应code的中文描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/**
	 * 查询的小程序id
	 */
	@ApiField("query_app_id")
	private String queryAppId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizMsg() {
		return this.bizMsg;
	}
	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}

	public String getQueryAppId() {
		return this.queryAppId;
	}
	public void setQueryAppId(String queryAppId) {
		this.queryAppId = queryAppId;
	}

}
