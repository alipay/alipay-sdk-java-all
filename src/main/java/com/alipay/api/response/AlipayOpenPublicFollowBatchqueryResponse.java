package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.follow.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-21 14:02:08
 */
public class AlipayOpenPublicFollowBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1327887281587449421L;

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

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
