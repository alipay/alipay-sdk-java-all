package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomerRecommendation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.customer.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-22 12:07:55
 */
public class ZhimaCreditEpAssistantCustomerRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8419162873384641356L;

	/** 
	 * 可核实的数据口径截止日期，格式为yyyy-MM-dd。多源数据无法确定统一截止日期时为null，不使用推荐生成日期代替。示例仅说明日期格式，不代表实际数据截止日期。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("data_as_of")
	private String dataAsOf;

	/** 
	 * 当前携带结果的原始生成时间，含时区；生成中展示旧结果保留原时间，无可用结果时为null。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("generated_at")
	private String generatedAt;

	/** 
	 * 当前携带推荐结果的批次ID；生成中携带旧结果时返回旧批次ID，无可用结果时为null。不是登录或授权凭证。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("recommendation_batch_id")
	private String recommendationBatchId;

	/** 
	 * null
	 */
	@ApiListField("recommendations")
	@ApiField("customer_recommendation")
	private List<CustomerRecommendation> recommendations;

	/** 
	 * GENERATING状态建议重查等待时间，单位毫秒；即使携带旧结果也返回。READY及EMPTY为null。间隔不保证等待结束后任务完成，具体参数待联调确认。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("retry_after_ms")
	private Long retryAfterMs;

	/** 
	 * 推荐结果状态：READY表示当前有可展示结果且没有在途更新；GENERATING表示生成中，可以同时携带上一批可展示结果；EMPTY表示生成成功但没有匹配结果。GENERATING时按retry_after_ms有界重查。
	 */
	@ApiField("status")
	private String status;

	public void setDataAsOf(String dataAsOf) {
		this.dataAsOf = dataAsOf;
	}
	public String getDataAsOf( ) {
		return this.dataAsOf;
	}

	public void setGeneratedAt(String generatedAt) {
		this.generatedAt = generatedAt;
	}
	public String getGeneratedAt( ) {
		return this.generatedAt;
	}

	public void setRecommendationBatchId(String recommendationBatchId) {
		this.recommendationBatchId = recommendationBatchId;
	}
	public String getRecommendationBatchId( ) {
		return this.recommendationBatchId;
	}

	public void setRecommendations(List<CustomerRecommendation> recommendations) {
		this.recommendations = recommendations;
	}
	public List<CustomerRecommendation> getRecommendations( ) {
		return this.recommendations;
	}

	public void setRetryAfterMs(Long retryAfterMs) {
		this.retryAfterMs = retryAfterMs;
	}
	public Long getRetryAfterMs( ) {
		return this.retryAfterMs;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
