package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VehicleDashboardResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.vehicledashboard.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:42:42
 */
public class AlipayIserviceCognitiveOcrVehicledashboardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1362118741876672242L;

	/** 
	 * 服务ip
	 */
	@ApiField("ip")
	private String ip;

	/** 
	 * 识别结果
	 */
	@ApiListField("result")
	@ApiField("vehicle_dashboard_result")
	private List<VehicleDashboardResult> result;

	/** 
	 * 0为识别成功，1为识别失败
	 */
	@ApiField("ret")
	private Long ret;

	/** 
	 * 识别服务的RT,单位为毫秒ms
	 */
	@ApiField("rt")
	private Long rt;

	/** 
	 * 识别服务的session id
	 */
	@ApiField("sid")
	private String sid;

	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp( ) {
		return this.ip;
	}

	public void setResult(List<VehicleDashboardResult> result) {
		this.result = result;
	}
	public List<VehicleDashboardResult> getResult( ) {
		return this.result;
	}

	public void setRet(Long ret) {
		this.ret = ret;
	}
	public Long getRet( ) {
		return this.ret;
	}

	public void setRt(Long rt) {
		this.rt = rt;
	}
	public Long getRt( ) {
		return this.rt;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSid( ) {
		return this.sid;
	}

}
