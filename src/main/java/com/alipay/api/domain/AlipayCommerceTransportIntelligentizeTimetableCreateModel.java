package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大出行智能平台-时刻表任务-创建
 *
 * @author auto create
 * @since 1.0, 2020-09-04 19:44:57
 */
public class AlipayCommerceTransportIntelligentizeTimetableCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5162741295413726762L;

	/**
	 * 城市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公交企业ID
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 线路信息列表，单次请求只支持同一条线路，支持同时计算该线路的上行+下行
	 */
	@ApiListField("line_info_list")
	@ApiField("time_table_line_info")
	private List<TimeTableLineInfo> lineInfoList;

	/**
	 * 请求ID，唯一标识一次请求，由调用方自行确保唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务任务名称
	 */
	@ApiField("service_task_name")
	private String serviceTaskName;

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

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public List<TimeTableLineInfo> getLineInfoList() {
		return this.lineInfoList;
	}
	public void setLineInfoList(List<TimeTableLineInfo> lineInfoList) {
		this.lineInfoList = lineInfoList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceTaskName() {
		return this.serviceTaskName;
	}
	public void setServiceTaskName(String serviceTaskName) {
		this.serviceTaskName = serviceTaskName;
	}

}
