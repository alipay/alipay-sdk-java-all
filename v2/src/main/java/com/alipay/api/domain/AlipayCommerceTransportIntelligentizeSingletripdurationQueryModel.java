package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-单程时间-查询
 *
 * @author auto create
 * @since 1.0, 2022-11-03 14:43:55
 */
public class AlipayCommerceTransportIntelligentizeSingletripdurationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4148559962779596132L;

	/**
	 * 聚合方式（MIN、MAX、MEAN、PERCENTILE_95）
	 */
	@ApiField("aggregate_type")
	private String aggregateType;

	/**
	 * 城市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公交业主ID
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 线路方向（UP-上行，DOWN-下行）
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 扩展参数，json格式，由双方约定取值。单程时间查询接口algo_date_list参数必填
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 线路ID，同一条线路的不同方向该值不同
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 线路Key，同一条线路的不同方向该值相同
	 */
	@ApiField("line_key")
	private String lineKey;

	/**
	 * 请求ID，唯一标识一次请求，由调用方自行确保唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 聚合时间粒度，单位：分钟，只支持：5、10、15、20、30、60
	 */
	@ApiField("time_span")
	private Long timeSpan;

	public String getAggregateType() {
		return this.aggregateType;
	}
	public void setAggregateType(String aggregateType) {
		this.aggregateType = aggregateType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getLineKey() {
		return this.lineKey;
	}
	public void setLineKey(String lineKey) {
		this.lineKey = lineKey;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTimeSpan() {
		return this.timeSpan;
	}
	public void setTimeSpan(Long timeSpan) {
		this.timeSpan = timeSpan;
	}

}
