package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义事件报表返回体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:48
 */
public class OpenApiEventReportDataResult extends AlipayObject {

	private static final long serialVersionUID = 6265617498733581893L;

	/**
	 * 在接口返回时,如果syncQueryResultValid为false,那么这是一个异步查询，请根据asyncQueryId和asyncQueryStatus继续查询
	 */
	@ApiField("async_query_id")
	private String asyncQueryId;

	/**
	 * 异步查询时，轮训结果的状态，只有SUCCESS时才有数据
	 */
	@ApiField("async_query_status")
	private String asyncQueryStatus;

	/**
	 * 事件的具体数据,包含事件的维度属性和指标数值
	 */
	@ApiListField("items")
	@ApiField("open_api_event_report_item_v_o")
	private List<OpenApiEventReportItemVO> items;

	/**
	 * 同步查询结果可用
如果这个值为true, 那么这是一次同步查询,
如果为false,那么这是一个异步查询，请根据asyncQueryId继续查询
	 */
	@ApiField("sync_query_result_valid")
	private Boolean syncQueryResultValid;

	public String getAsyncQueryId() {
		return this.asyncQueryId;
	}
	public void setAsyncQueryId(String asyncQueryId) {
		this.asyncQueryId = asyncQueryId;
	}

	public String getAsyncQueryStatus() {
		return this.asyncQueryStatus;
	}
	public void setAsyncQueryStatus(String asyncQueryStatus) {
		this.asyncQueryStatus = asyncQueryStatus;
	}

	public List<OpenApiEventReportItemVO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiEventReportItemVO> items) {
		this.items = items;
	}

	public Boolean getSyncQueryResultValid() {
		return this.syncQueryResultValid;
	}
	public void setSyncQueryResultValid(Boolean syncQueryResultValid) {
		this.syncQueryResultValid = syncQueryResultValid;
	}

}
