package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大出行智能平台-客流预测任务-创建
 *
 * @author auto create
 * @since 1.0, 2023-04-26 19:47:30
 */
public class AlipayCommerceTransportIntelligentizeOdpredictionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1813676831478554115L;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公交企业自定义ID，需与技术人员确认是否已生效
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 客流预测任务扩展参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 客流预测对应线路列表
	 */
	@ApiListField("line_list")
	@ApiField("od_prediction_line_info")
	private List<OdPredictionLineInfo> lineList;

	/**
	 * 指定客流预测数据月份
	 */
	@ApiField("month")
	private String month;

	/**
	 * 公交地铁公司线网版本
	 */
	@ApiField("network_version")
	private String networkVersion;

	/**
	 * COMMON_BUS_OPEN-常规公交开线,
COMMON_BUS_DIAGNOSE-常规公交诊断,
CUSTOMIZED_BUS_OPEN-定制公交开线
	 */
	@ApiField("od_predict_type")
	private String odPredictType;

	/**
	 * false-无需计算替代线路;true-需要计算替代线路
	 */
	@ApiField("replace")
	private Boolean replace;

	/**
	 * 请求id，每次请求唯一
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务任务描述
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

	public List<OdPredictionLineInfo> getLineList() {
		return this.lineList;
	}
	public void setLineList(List<OdPredictionLineInfo> lineList) {
		this.lineList = lineList;
	}

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getNetworkVersion() {
		return this.networkVersion;
	}
	public void setNetworkVersion(String networkVersion) {
		this.networkVersion = networkVersion;
	}

	public String getOdPredictType() {
		return this.odPredictType;
	}
	public void setOdPredictType(String odPredictType) {
		this.odPredictType = odPredictType;
	}

	public Boolean getReplace() {
		return this.replace;
	}
	public void setReplace(Boolean replace) {
		this.replace = replace;
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
