package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.watchlist.brief.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:20:17
 */
public class ZhimaCreditWatchlistBriefGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3475956795361717848L;

	/** 
	 * 唯一标示每一次接口调用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 输入用户返回结果：
0 未命中逾期名单
1 命中一类名单，例如用户有一周以内的轻微逾期
2 命中二类名单，例如用户有一周以上中等逾期
3 命中三类名单，例如用户有一个月以上的严重逾期
N/A 无法评估该用户逾期状况，例如未获得用户授权。
	 */
	@ApiField("level")
	private String level;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel( ) {
		return this.level;
	}

}
