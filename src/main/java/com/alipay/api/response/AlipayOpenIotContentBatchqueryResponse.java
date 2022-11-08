package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iot.content.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-24 15:46:49
 */
public class AlipayOpenIotContentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3324764425283877993L;

	/** 
	 * 格式取决于查询数据的场景
	 */
	@ApiListField("content_list")
	@ApiField("string")
	private List<String> contentList;

	/** 
	 * 总数据条数
	 */
	@ApiField("list_total_count")
	private Long listTotalCount;

	/** 
	 * 错误说明，错误情况会包含通用错误码中不包含的场景错误信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 查询结果码，根据不同场景可能有所不同
	 */
	@ApiField("query_result_code")
	private String queryResultCode;

	/** 
	 * 内容查询埋点，内部应用与外部调用的串联埋点
	 */
	@ApiField("query_token")
	private String queryToken;

	public void setContentList(List<String> contentList) {
		this.contentList = contentList;
	}
	public List<String> getContentList( ) {
		return this.contentList;
	}

	public void setListTotalCount(Long listTotalCount) {
		this.listTotalCount = listTotalCount;
	}
	public Long getListTotalCount( ) {
		return this.listTotalCount;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setQueryResultCode(String queryResultCode) {
		this.queryResultCode = queryResultCode;
	}
	public String getQueryResultCode( ) {
		return this.queryResultCode;
	}

	public void setQueryToken(String queryToken) {
		this.queryToken = queryToken;
	}
	public String getQueryToken( ) {
		return this.queryToken;
	}

}
