package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MachineType;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.machinetype.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class AlipayMsaasMediarecogMmtcaftscvMachinetypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7566315169766945961L;

	/** 
	 * 视觉货柜机型信息列表
	 */
	@ApiListField("machine_types")
	@ApiField("machine_type")
	private List<MachineType> machineTypes;

	public void setMachineTypes(List<MachineType> machineTypes) {
		this.machineTypes = machineTypes;
	}
	public List<MachineType> getMachineTypes( ) {
		return this.machineTypes;
	}

}
