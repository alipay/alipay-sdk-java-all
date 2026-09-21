package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplyItemDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.indflow.supply.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 14:52:48
 */
public class AlipayOfflineProviderIndflowSupplyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2648569683565888422L;

	/** 
	 * 展位ID
	 */
	@ApiField("out_pos_id")
	private String outPosId;

	/** 
	 * null
	 */
	@ApiListField("supplies")
	@ApiField("supply_item_d_t_o")
	private List<SupplyItemDTO> supplies;

	/** 
	 * 供给数量，单位：个
	 */
	@ApiField("supply_count")
	private Long supplyCount;

	public void setOutPosId(String outPosId) {
		this.outPosId = outPosId;
	}
	public String getOutPosId( ) {
		return this.outPosId;
	}

	public void setSupplies(List<SupplyItemDTO> supplies) {
		this.supplies = supplies;
	}
	public List<SupplyItemDTO> getSupplies( ) {
		return this.supplies;
	}

	public void setSupplyCount(Long supplyCount) {
		this.supplyCount = supplyCount;
	}
	public Long getSupplyCount( ) {
		return this.supplyCount;
	}

}
