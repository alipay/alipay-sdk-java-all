package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小指令触发会员登陆
 *
 * @author auto create
 * @since 1.0, 2025-11-05 14:27:41
 */
public class AlipayPayInstructOpencardTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 4661791839576254858L;

	/**
	 * ABCP请求超时时间，单位毫秒，默认值为2 * 60 * 1000L(2分钟)超时，-1表示永不超时，可以根据业务情况修改
	 */
	@ApiField("bpaas_ipc_timeout")
	private String bpaasIpcTimeout;

	/**
	 * 发起收款:show
关闭收银界面:pop
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * opencard
打开会员卡
	 */
	@ApiField("page")
	private String page;

	/**
	 * 开卡调用参数
	 */
	@ApiField("params")
	private Params params;

	/**
	 * POS 设备唯一标识，建议取 POS 设备 SN 编号，保证每个设备唯一
	 */
	@ApiField("pos_id")
	private String posId;

	public String getBpaasIpcTimeout() {
		return this.bpaasIpcTimeout;
	}
	public void setBpaasIpcTimeout(String bpaasIpcTimeout) {
		this.bpaasIpcTimeout = bpaasIpcTimeout;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public Params getParams() {
		return this.params;
	}
	public void setParams(Params params) {
		this.params = params;
	}

	public String getPosId() {
		return this.posId;
	}
	public void setPosId(String posId) {
		this.posId = posId;
	}

}
