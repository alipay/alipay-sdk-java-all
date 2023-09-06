package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SlmServiceAtomicInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.autocheck.step.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:20:54
 */
public class AlipayOpenMiniAutocheckStepGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8252221495348182377L;

	/** 
	 * 百格脚本步骤信息
	 */
	@ApiListField("slm_service_atomic_info")
	@ApiField("slm_service_atomic_info_v_o")
	private List<SlmServiceAtomicInfoVO> slmServiceAtomicInfo;

	public void setSlmServiceAtomicInfo(List<SlmServiceAtomicInfoVO> slmServiceAtomicInfo) {
		this.slmServiceAtomicInfo = slmServiceAtomicInfo;
	}
	public List<SlmServiceAtomicInfoVO> getSlmServiceAtomicInfo( ) {
		return this.slmServiceAtomicInfo;
	}

}
