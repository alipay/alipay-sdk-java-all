package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大出行智能平台-轮班任务-创建
 *
 * @author auto create
 * @since 1.0, 2022-11-03 14:44:39
 */
public class AlipayCommerceTransportIntelligentizeWorkshiftCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1725767617535753388L;

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
	 * 下行场站配备的司机数，若填写则执行分场站轮班
	 */
	@ApiField("down_driver_count")
	private Long downDriverCount;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 该线路配备的总司机数
	 */
	@ApiField("line_driver_count")
	private Long lineDriverCount;

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
	 * 服务任务名称
	 */
	@ApiField("service_task_name")
	private String serviceTaskName;

	/**
	 * 上行场站配备的司机数，若填写则执行分场站轮班
	 */
	@ApiField("up_driver_count")
	private Long upDriverCount;

	/**
	 * 轮班参数列表
	 */
	@ApiListField("work_shift_param_list")
	@ApiField("work_shift_param")
	private List<WorkShiftParam> workShiftParamList;

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

	public Long getDownDriverCount() {
		return this.downDriverCount;
	}
	public void setDownDriverCount(Long downDriverCount) {
		this.downDriverCount = downDriverCount;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public Long getLineDriverCount() {
		return this.lineDriverCount;
	}
	public void setLineDriverCount(Long lineDriverCount) {
		this.lineDriverCount = lineDriverCount;
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

	public String getServiceTaskName() {
		return this.serviceTaskName;
	}
	public void setServiceTaskName(String serviceTaskName) {
		this.serviceTaskName = serviceTaskName;
	}

	public Long getUpDriverCount() {
		return this.upDriverCount;
	}
	public void setUpDriverCount(Long upDriverCount) {
		this.upDriverCount = upDriverCount;
	}

	public List<WorkShiftParam> getWorkShiftParamList() {
		return this.workShiftParamList;
	}
	public void setWorkShiftParamList(List<WorkShiftParam> workShiftParamList) {
		this.workShiftParamList = workShiftParamList;
	}

}
