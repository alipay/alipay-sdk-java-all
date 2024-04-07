package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZmWatchListDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.watchlistii.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:32:45
 */
public class ZhimaCreditWatchlistiiGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7654752698144372652L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 所查询的某个用户的行业关注名单列表。当is_matched为true时会返回该参数。
	 */
	@ApiListField("details")
	@ApiField("zm_watch_list_detail")
	private List<ZmWatchListDetail> details;

	/** 
	 * true=命中 在关注名单中
false=未命中
	 */
	@ApiField("is_matched")
	private Boolean isMatched;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setDetails(List<ZmWatchListDetail> details) {
		this.details = details;
	}
	public List<ZmWatchListDetail> getDetails( ) {
		return this.details;
	}

	public void setIsMatched(Boolean isMatched) {
		this.isMatched = isMatched;
	}
	public Boolean getIsMatched( ) {
		return this.isMatched;
	}

}
