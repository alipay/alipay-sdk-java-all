package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灰度流量校验
 *
 * @author auto create
 * @since 1.0, 2026-09-24 11:02:29
 */
public class AntfortuneStockGrayTrafficCheckModel extends AlipayObject {

	private static final long serialVersionUID = 4144383728739713858L;

	/**
	 * 实际发往灰度环境的组件/应用名清单，由发布单各组件所选发布环境推得
	 */
	@ApiListField("applications")
	@ApiField("string")
	private List<String> applications;

	/**
	 * 机构标识
	 */
	@ApiField("inst_id")
	private String instId;

	public List<String> getApplications() {
		return this.applications;
	}
	public void setApplications(List<String> applications) {
		this.applications = applications;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
