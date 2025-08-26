package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EapAuthVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrhealth.eap.authority.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-12 14:26:59
 */
public class AlipayDigitalmgmtHrhealthEapAuthorityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3378729239812143886L;

	/** 
	 * 该参数用来标识用户是否有权益以及用户所属团餐所属组织，是根据用户查询用户权益信息以及corp按照组织归属转换得来，供应商会依据此参数判断用户是否展示蚂蚁团餐内容
	 */
	@ApiListField("eap_auth_vo")
	@ApiField("eap_auth_v_o")
	private List<EapAuthVO> eapAuthVo;

	public void setEapAuthVo(List<EapAuthVO> eapAuthVo) {
		this.eapAuthVo = eapAuthVo;
	}
	public List<EapAuthVO> getEapAuthVo( ) {
		return this.eapAuthVo;
	}

}
