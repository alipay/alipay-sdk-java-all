package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.follow.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:27:36
 */
public class AlipayOpenPublicFollowBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4189257349338591928L;

	/** 
	 * 本次调用获取的userId个数，最大值为10000
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 查询分组的userid
	 */
	@ApiField("next_user_id")
	private String nextUserId;

	/** 
	 * 支付宝用户的
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户的唯一标识列表
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/** 
	 * 用户的userId列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

	public void setNextUserId(String nextUserId) {
		this.nextUserId = nextUserId;
	}
	public String getNextUserId( ) {
		return this.nextUserId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}
	public List<String> getOpenIdList( ) {
		return this.openIdList;
	}

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
