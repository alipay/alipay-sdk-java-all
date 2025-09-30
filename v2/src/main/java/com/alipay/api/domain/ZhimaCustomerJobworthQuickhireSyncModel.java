package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 岗位上线状态同步
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:01:57
 */
public class ZhimaCustomerJobworthQuickhireSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2362133176833172298L;

	/**
	 * 岗位唯一id
	 */
	@ApiField("recruit_code_id")
	private String recruitCodeId;

	/**
	 * 信用服务，由芝麻信用运营分配，请联系业务对接人配置，固定写死即可
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 岗位上线状态，0 = 审核中，1 = 已上线， 2 = 拒绝，3 = 下线
	 */
	@ApiField("sync_status")
	private String syncStatus;

	public String getRecruitCodeId() {
		return this.recruitCodeId;
	}
	public void setRecruitCodeId(String recruitCodeId) {
		this.recruitCodeId = recruitCodeId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSyncStatus() {
		return this.syncStatus;
	}
	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}

}
