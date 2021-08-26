package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备关联信息，如生效计划id
 *
 * @author auto create
 * @since 1.0, 2020-05-06 13:28:43
 */
public class DeviceRelationData extends AlipayObject {

	private static final long serialVersionUID = 7872447182289724863L;

	/**
	 * 生效计划id列表
	 */
	@ApiListField("plan_id_list")
	@ApiField("number")
	private List<Long> planIdList;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	public List<Long> getPlanIdList() {
		return this.planIdList;
	}
	public void setPlanIdList(List<Long> planIdList) {
		this.planIdList = planIdList;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
