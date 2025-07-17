package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EquipmentAuthRemoveQueryBypageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.equipment.auth.querybypage response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:20
 */
public class AlipayOfflineProviderEquipmentAuthQuerybypageResponse extends AlipayResponse {

	private static final long serialVersionUID = 4698833195583321348L;

	/** 
	 * 机具解绑按照条件分页查询返回信息
	 */
	@ApiListField("equipmentauthremovequerybypagelist")
	@ApiField("equipment_auth_remove_query_bypage_d_t_o")
	private List<EquipmentAuthRemoveQueryBypageDTO> equipmentauthremovequerybypagelist;

	/** 
	 * 总记录数
	 */
	@ApiField("total")
	private Long total;

	public void setEquipmentauthremovequerybypagelist(List<EquipmentAuthRemoveQueryBypageDTO> equipmentauthremovequerybypagelist) {
		this.equipmentauthremovequerybypagelist = equipmentauthremovequerybypagelist;
	}
	public List<EquipmentAuthRemoveQueryBypageDTO> getEquipmentauthremovequerybypagelist( ) {
		return this.equipmentauthremovequerybypagelist;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
