package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Data;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.follow.list response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-21 10:10:27
 */
public class AlipayMobilePublicFollowListResponse extends AlipayResponse {

	private static final long serialVersionUID = 5462353711169836855L;

	/** 
	 * 返回结果码，如200，标识成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 当前组的值
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 用户数据
	 */
	@ApiField("data")
	private Data data;

	/** 
	 * 与nextUserId对应，标准Alipay UserId
	 */
	@ApiField("next_alipay_user_id")
	private String nextAlipayUserId;

	/** 
	 * 查询分组的userid
	 */
	@ApiField("next_user_id")
	private String nextUserId;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

	public void setData(Data data) {
		this.data = data;
	}
	public Data getData( ) {
		return this.data;
	}

	public void setNextAlipayUserId(String nextAlipayUserId) {
		this.nextAlipayUserId = nextAlipayUserId;
	}
	public String getNextAlipayUserId( ) {
		return this.nextAlipayUserId;
	}

	public void setNextUserId(String nextUserId) {
		this.nextUserId = nextUserId;
	}
	public String getNextUserId( ) {
		return this.nextUserId;
	}

}
