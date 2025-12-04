package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentRiskProVO;
import com.alipay.api.domain.RentRiskInfoVO;
import com.alipay.api.domain.ShipGoodsRiskVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.risk.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-02 22:04:02
 */
public class AlipayCommerceRentRiskConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1559245494495211864L;

	/** 
	 * Tn_Level类型结果，risk_level字段取值范围T1-T10（T1 ~ T4: 低风险；T5 ~ T6: 中风险；T7 ~ T8: 高风险；T9 ~ T10: 极高风险）
	 */
	@ApiField("comprehensive_risk_models")
	private RentRiskProVO comprehensiveRiskModels;

	/** 
	 * Boolean类型结果，true-命中极低风险 false-未命中极低风险
	 */
	@ApiField("extremely_low_risk_models")
	private RentRiskProVO extremelyLowRiskModels;

	/** 
	 * Boolean类型结果，true-命中高风险 false-未命中高风险
	 */
	@ApiField("high_risk_models")
	private RentRiskProVO highRiskModels;

	/** 
	 * BASIC-租安盾基础版，面向全量租赁商户；
PRO-租安盾专业版，面向签约商户；
	 */
	@ApiField("product_edition")
	private String productEdition;

	/** 
	 * null
	 */
	@ApiListField("risk_infos")
	@ApiField("rent_risk_info_v_o")
	private List<RentRiskInfoVO> riskInfos;

	/** 
	 * null
	 */
	@ApiListField("ship_goods_risk_models")
	@ApiField("ship_goods_risk_v_o")
	private List<ShipGoodsRiskVO> shipGoodsRiskModels;

	/** 
	 * 联营商户订单分组
	 */
	@ApiField("vam_group")
	private String vamGroup;

	public void setComprehensiveRiskModels(RentRiskProVO comprehensiveRiskModels) {
		this.comprehensiveRiskModels = comprehensiveRiskModels;
	}
	public RentRiskProVO getComprehensiveRiskModels( ) {
		return this.comprehensiveRiskModels;
	}

	public void setExtremelyLowRiskModels(RentRiskProVO extremelyLowRiskModels) {
		this.extremelyLowRiskModels = extremelyLowRiskModels;
	}
	public RentRiskProVO getExtremelyLowRiskModels( ) {
		return this.extremelyLowRiskModels;
	}

	public void setHighRiskModels(RentRiskProVO highRiskModels) {
		this.highRiskModels = highRiskModels;
	}
	public RentRiskProVO getHighRiskModels( ) {
		return this.highRiskModels;
	}

	public void setProductEdition(String productEdition) {
		this.productEdition = productEdition;
	}
	public String getProductEdition( ) {
		return this.productEdition;
	}

	public void setRiskInfos(List<RentRiskInfoVO> riskInfos) {
		this.riskInfos = riskInfos;
	}
	public List<RentRiskInfoVO> getRiskInfos( ) {
		return this.riskInfos;
	}

	public void setShipGoodsRiskModels(List<ShipGoodsRiskVO> shipGoodsRiskModels) {
		this.shipGoodsRiskModels = shipGoodsRiskModels;
	}
	public List<ShipGoodsRiskVO> getShipGoodsRiskModels( ) {
		return this.shipGoodsRiskModels;
	}

	public void setVamGroup(String vamGroup) {
		this.vamGroup = vamGroup;
	}
	public String getVamGroup( ) {
		return this.vamGroup;
	}

}
